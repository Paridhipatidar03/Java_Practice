import java.util.*;

public class MergeHashMaps {
    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "A");
        map1.put(2, "B");

        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(3, "C");
        map2.put(4, "D");

        map1.putAll(map2);
        System.out.println("Merged HashMap: " + map1);
    }
}
