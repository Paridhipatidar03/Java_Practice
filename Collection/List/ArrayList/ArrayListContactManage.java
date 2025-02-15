import java.util.*;

class Contact {
    String phone, name, email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String toString() {
        return "Name: " + name + " | Phone No: " + phone + " | Email: " + email;
    }
}

public class ArrayListContactManage {
    public static void main(String[] args) {
        ArrayList<Contact> contact = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Add Contact  2. View Contacts  3. Exit");
            int value = sc.nextInt();
            sc.nextLine(); // Fix: Consume the leftover newline

            if (value == 1) {
                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Phone: ");
                String phone = sc.nextLine();

                System.out.print("Enter Email: ");
                String email = sc.nextLine();

                contact.add(new Contact(name, phone, email));
                System.out.println("✅ Contact Added Successfully!");
            } else if (value == 2) {
                if (contact.isEmpty()) {
                    System.out.println("❌ No contacts found.");
                } else {
                    System.out.println("\n📞 Contact List:");
                    for (Contact c : contact) {
                        System.out.println(c);
                    }
                }
            } else {
                System.out.println("🚪 Exiting... Thank you!");
                break;
            }
        }
        sc.close();
    }
}
