import java.util.Scanner;

// Sender class that sends messages
class Sender {
    public synchronized void send(String msg) {
        System.out.println(Thread.currentThread().getName() + " Sending: " + msg);
        try {
            Thread.sleep(2000); // Simulate delay in sending
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println(Thread.currentThread().getName() + " Message Sent: " + msg);
    }
}

// ChatThread class for managing sending messages from different sides
class ChatThread extends Thread {
    private String msg;
    private Sender sender;
    private Object lock; // Shared lock object for synchronization
    private boolean myTurn; // Flag to indicate whose turn it is

    public ChatThread(String msg, Sender sender, Object lock, boolean myTurn) {
        this.msg = msg;
        this.sender = sender;
        this.lock = lock;
        this.myTurn = myTurn;
    }

    public void run() {
        synchronized (lock) {
            while (!myTurn) {
                try {
                    lock.wait(); // Wait for your turn
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted.");
                }
            }
            // Send the message
            sender.send(msg);

            // Notify the other thread and update the turn
            myTurn = false;
            lock.notify();
        }
    }
}

// Main class for the chatting simulation
public class ChatSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sender sender = new Sender(); // Shared sender object
        Object lock = new Object(); // Lock object for synchronization

        // Input messages for user 1
        System.out.println("User 1: Enter your message:");
        String user1Msg = sc.nextLine();

        // Input messages for user 2
        System.out.println("User 2: Enter your message:");
        String user2Msg = sc.nextLine();

        // Create threads for both users
        ChatThread user1Thread = new ChatThread(user1Msg, sender, lock, true);  // User 1 starts first
        ChatThread user2Thread = new ChatThread(user2Msg, sender, lock, false); // User 2 waits for their turn

        // Start both threads
        user1Thread.setName("User 1");
        user2Thread.setName("User 2");
        user1Thread.start();
        user2Thread.start();

        // Wait for both threads to finish
        try {
            user1Thread.join();
            user2Thread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Chat session completed.");
    }
}
