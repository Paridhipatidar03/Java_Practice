import java.util.*;

class Ticket {
    private static int ticketCounter = 1;
    private int ticketId;
    private String passengerName;
    private String destination;
    private Date travelDate;

    public Ticket(String passengerName, String destination, Date travelDate) {
        this.ticketId = ticketCounter++;
        this.passengerName = passengerName;
        this.destination = destination;
        this.travelDate = travelDate;
    }

    public int getTicketId() {
        return ticketId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getDestination() {
        return destination;
    }

    public Date getTravelDate() {
        return travelDate;
    }

    @Override
    public String toString() {
        return "Ticket ID: " + ticketId + ", Passenger Name: " + passengerName + ", Destination: " + destination + ", Travel Date and Time: " + travelDate;
    }
}

class TicketBookingSystem {
    private List<Ticket> tickets;
    private int availableTickets;
    private static final List<String> validDestinations = Arrays.asList("City A", "City B", "City C", "City D");
    private static final List<String> timeSlots = Arrays.asList("10:00", "13:00", "16:00", "19:00", "22:00");

    public TicketBookingSystem(int totalTickets) {
        tickets = Collections.synchronizedList(new ArrayList<>());
        this.availableTickets = totalTickets;
    }

    public synchronized void bookTicket(String passengerName, String destination, Date travelDate) {
        if (availableTickets <= 0) {
            System.out.println("No tickets available.");
            return;
        }

        if (!validDestinations.contains(destination)) {
            System.out.println("Invalid destination. Please choose from: " + validDestinations);
            return;
        }

        Date currentDate = new Date();
        if (travelDate.before(currentDate)) {
            System.out.println("Travel date and time must be after the current date and time.");
            return;
        }

        String travelTime = new java.text.SimpleDateFormat("HH:mm").format(travelDate);
        if (!timeSlots.contains(travelTime)) {
            System.out.println("Invalid time slot. Please choose from: " + timeSlots);
            return;
        }

        Ticket ticket = new Ticket(passengerName, destination, travelDate);
        tickets.add(ticket);
        availableTickets--;
        System.out.println("Ticket successfully booked!\n" + ticket);
    }

    public synchronized void viewAllTickets() {
        if (tickets.isEmpty()) {
            System.out.println("No tickets booked yet.");
        } else {
            System.out.println("List of all booked tickets:");
            for (Ticket ticket : tickets) {
                System.out.println(ticket);
            }
        }
    }

    public synchronized void cancelTicket(int ticketId) {
        boolean found = false;
        Iterator<Ticket> iterator = tickets.iterator();
        while (iterator.hasNext()) {
            Ticket ticket = iterator.next();
            if (ticket.getTicketId() == ticketId) {
                iterator.remove();
                availableTickets++;
                System.out.println("Ticket with ID " + ticketId + " has been successfully canceled.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Ticket with ID " + ticketId + " not found.");
        }
    }

    public synchronized int getAvailableTickets() {
        return availableTickets;
    }
}

class BookingThread extends Thread {
    private TicketBookingSystem bookingSystem;
    private String passengerName;
    private String destination;
    private String travelDateTime;

    public BookingThread(TicketBookingSystem bookingSystem, String passengerName, String destination, String travelDateTime) {
        this.bookingSystem = bookingSystem;
        this.passengerName = passengerName;
        this.destination = destination;
        this.travelDateTime = travelDateTime;
    }

    @Override
    public void run() {
        try {
            Date travelDate = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm").parse(travelDateTime);
            bookingSystem.bookTicket(passengerName, destination, travelDate);
        } catch (Exception e) {
            System.out.println("Invalid date and time format. Please use yyyy-MM-dd HH:mm.");
        }
    }
}

public class TicketBookingSystemMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of tickets available: ");
        int totalTickets = scanner.nextInt();
        TicketBookingSystem bookingSystem = new TicketBookingSystem(totalTickets);

        while (true) {
            System.out.println("\n=== Ticket Booking System ===");
            System.out.println("1. Book Ticket");
            System.out.println("2. View All Tickets");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Check Available Tickets");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Passenger Name: ");
                    scanner.nextLine(); // Consume newline
                    String name = scanner.nextLine();
                    System.out.print("Enter Destination: ");
                    String destination = scanner.nextLine();
                    System.out.print("Enter Travel Date and Time (yyyy-MM-dd HH:mm): ");
                    String dateInput = scanner.nextLine();
                    BookingThread bookingThread = new BookingThread(bookingSystem, name, destination, dateInput);
                    bookingThread.start();
                    try {
                        bookingThread.join();
                    } catch (InterruptedException e) {
                        System.out.println("Booking thread interrupted.");
                    }
                    break;
                case 2:
                    bookingSystem.viewAllTickets();
                    break;
                case 3:
                    System.out.print("Enter Ticket ID to cancel: ");
                    int ticketId = scanner.nextInt();
                    bookingSystem.cancelTicket(ticketId);
                    break;
                case 4:
                    System.out.println("Available Tickets: " + bookingSystem.getAvailableTickets());
                    break;
                case 5:
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
