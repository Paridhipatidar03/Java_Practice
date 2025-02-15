import java.util.*;

public class HashtableRemove {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();
        table.put(1, "Red");
        table.put(2, "Green");
        table.put(3, "Blue");

        System.out.println("Before removal: " + table);
        table.remove(2);
        System.out.println("After removing key 2: " + table);
    }
}
