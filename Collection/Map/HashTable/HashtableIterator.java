import java.util.*;

public class HashtableIterator {
    public static void main(String[] args) {
        Hashtable<String, Integer> table = new Hashtable<>();
        table.put("Alice", 25);
        table.put("Bob", 30);
        table.put("Charlie", 35);

        Iterator<Map.Entry<String, Integer>> iterator = table.entrySet().iterator();
        System.out.println("Hashtable elements:");
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
