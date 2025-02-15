import java.util.*;

public class SortLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(3, "Orange");
        map.put(1, "Apple");
        map.put(2, "Banana");

        List<Map.Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        System.out.println("Sorted LinkedHashMap by Values:");
        for (Map.Entry<Integer, String> entry : list) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
