import java.util.*;

public class LinkedHashMapIterator {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        System.out.println("LinkedHashMap elements:");
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
