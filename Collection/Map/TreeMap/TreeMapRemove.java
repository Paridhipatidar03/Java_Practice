import java.util.*;

public class TreeMapRemove {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Blue");

        System.out.println("Before removal: " + map);
        map.remove(2);
        System.out.println("After removing key 2: " + map);
    }
}
