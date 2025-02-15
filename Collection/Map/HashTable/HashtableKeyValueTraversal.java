import java.util.*;

public class HashtableKeyValueTraversal {
    public static void main(String[] args) {
        Hashtable<String, Double> table = new Hashtable<>();
        table.put("Math", 95.5);
        table.put("Science", 88.0);
        table.put("English", 78.5);

        System.out.println("Keys: " + table.keySet());
        System.out.println("Values: " + table.values());
    }
}
