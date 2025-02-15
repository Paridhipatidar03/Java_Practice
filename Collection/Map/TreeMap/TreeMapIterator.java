import java.util.*;

public class TreeMapIterator {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Paridhi", 25);
        map.put("Pooja", 30);
        map.put("Palak", 35);

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        System.out.println("TreeMap elements:");
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
