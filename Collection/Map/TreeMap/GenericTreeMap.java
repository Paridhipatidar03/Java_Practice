import java.util.*;

public class GenericTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        // Insert elements
        map.put(3, "Red");
        map.put(1, "Green");
        map.put(2, "Blue");
        map.put(5, "Yellow");
        map.put(4, "Orange");

        // Print TreeMap
        System.out.println("TreeMap: " + map);

        // Get and check values
        System.out.println("Value for key 2: " + map.get(2));

        // Get first and last keys/entries
        System.out.println("First key: " + map.firstKey());
        System.out.println("Last key: " + map.lastKey());

        // Get higher/lower keys and entries
        map.higherKey(2);
        map.lowerKey(2);
        map.higherEntry(2);
        map.lowerEntry(2);

        // Get floor/ceiling keys and entries
        map.ceilingKey(3);
        map.floorKey(3);
        map.ceilingEntry(3);
        map.floorEntry(3);

        // Get keys, values, and entries
        System.out.println("Key Set: " + map.keySet());
        System.out.println("Values: " + map.values());

        // Modify map
        map.remove(3);
        System.out.println("After removing key 3: " + map);
        map.pollFirstEntry();
        map.pollLastEntry();
        map.descendingMap();

        // Clear and check if empty
        map.clear();
        System.out.println("Is TreeMap empty? " + map.isEmpty());
    }
}
