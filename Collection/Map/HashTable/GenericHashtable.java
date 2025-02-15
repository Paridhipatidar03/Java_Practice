import java.util.*;

public class GenericHashtable {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();

        // Add key-value pairs
        table.put(1, "Apple");
        table.put(2, "Banana");
        table.put(3, "Cherry");

        // Retrieve and check values
        System.out.println("Key 2: " + table.get(2));
        System.out.println("Contains key 3? " + table.containsKey(3));

        // Remove a key and update values
        table.remove(3);
        table.putIfAbsent(4, "Date");
        table.replace(2, "Blueberry");
        System.out.println("Updated Table: " + table);

        // Iterate through the table
        table.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

        // Clone and display
        Hashtable<Integer, String> clonedTable = (Hashtable<Integer, String>) table.clone();
        System.out.println("Cloned Table: " + clonedTable);

        // Clear the table
        table.clear();
        System.out.println("After clearing: " + table);
    }
}
