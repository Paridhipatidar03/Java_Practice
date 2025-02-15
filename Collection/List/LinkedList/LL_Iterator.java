import java.util.*;

public class LL_Iterator {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        sc.nextLine();  // Consume the leftover newline
        
        System.out.println("Enter the values for string list:");
        for (int i = 0; i < n; i++) {
            String a = sc.nextLine();
            list.add(a);
        }
        
        // Using a generic iterator
        Iterator<String> i = list.iterator();
        System.out.println("List elements:");
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        
        // Using another iterator to remove all elements
        Iterator<String> it = list.iterator();
        System.out.println("Removing elements:");
        while (it.hasNext()) {
            System.out.println("Removing: " + it.next());
            it.remove();
            System.out.println(list);
        }

        // Check if the list is empty after removal
        System.out.println("List after removal: " + list);

        sc.close();
    }
}
