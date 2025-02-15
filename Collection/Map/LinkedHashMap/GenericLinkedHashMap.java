import java.util.*;

public class GenericLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // Insert elements
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Blue");

        // Retrieve and check values
        System.out.println("Key 2: " + map.get(2));
        System.out.println("Contains key 3? " + map.containsKey(3));

        // Remove a key and update values
        map.remove(3);
        map.replace(2, "Purple");
        map.putIfAbsent(4, "Yellow");

        // Display updated map
        System.out.println("Updated Map: " + map);

        // Iterate over the map
        map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

        // Clear the map
        map.clear();
        System.out.println("After clearing: " + map.isEmpty());
    }
}
