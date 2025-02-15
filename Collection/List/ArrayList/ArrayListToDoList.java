import java.util.*;

public class ArrayListToDoList {
    
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Task  2. View Tasks  3. Remove Task  4. Exit");
            int choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            if (choice == 1) {
                System.out.print("Enter Task: ");
                String task = sc.nextLine();
                tasks.add(task);
            } else if (choice == 2) {
                System.out.println("Your Tasks:");
                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println((i + 1) + ". " + tasks.get(i));
                }
            } else if (choice == 3) {
                System.out.print("Enter Task Number to Remove: ");
                int index = sc.nextInt();
                if (index > 0 && index <= tasks.size()) {
                    tasks.remove(index - 1);
                } else {
                    System.out.println("Invalid Task Number!");
                }
            } else {
                break;
            }
        }
        sc.close();
    }
}
