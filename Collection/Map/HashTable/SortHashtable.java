import java.util.*;

public class SortHashtable {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();
        table.put(3, "Orange");
        table.put(1, "Apple");
        table.put(2, "Banana");

        TreeMap<Integer, String> sortedTable = new TreeMap<>(table);
        System.out.println("Sorted Hashtable by Keys: " + sortedTable);

        List<Map.Entry<Integer, String>> list = new ArrayList<>(table.entrySet());
        list.sort(Map.Entry.comparingByValue());

        System.out.println("Sorted Hashtable by Values:");
        for (Map.Entry<Integer, String> entry : list) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
