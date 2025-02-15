import java.util.*;

public class MergeTreeMaps {
    public static void main(String[] args) {
        TreeMap<Integer, String> map1 = new TreeMap<>();
        map1.put(1, "A");
        map1.put(2, "B");

        TreeMap<Integer, String> map2 = new TreeMap<>();
        map2.put(3, "C");
        map2.put(4, "D");

        map1.putAll(map2);
        System.out.println("Merged TreeMap (Sorted): " + map1);
    }
}
