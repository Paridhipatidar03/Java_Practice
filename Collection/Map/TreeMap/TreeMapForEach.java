import java.util.*;

public class TreeMapForEach {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(101, "Java");
        map.put(102, "Python");
        map.put(103, "C++");

        System.out.println("Traversing TreeMap using For-Each Loop:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
