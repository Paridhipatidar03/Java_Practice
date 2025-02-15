import java.util.*;

public class MergeLinkedHashMaps {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(1, "A");
        map1.put(2, "B");

        LinkedHashMap<Integer, String> map2 = new LinkedHashMap<>();
        map2.put(3, "C");
        map2.put(4, "D");

        map1.putAll(map2);
        System.out.println("Merged LinkedHashMap: " + map1);
    }
}
