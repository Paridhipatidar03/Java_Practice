import java.util.*;

public class SortHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(3, "Orange");
        map.put(1, "Apple");
        map.put(2, "Banana");

        TreeMap<Integer, String> sortedMap = new TreeMap<>(map);
        System.out.println("Sorted HashMap by Keys: " + sortedMap);

        List<Map.Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        System.out.println("Sorted HashMap by Values:");
        for (Map.Entry<Integer, String> entry : list) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
