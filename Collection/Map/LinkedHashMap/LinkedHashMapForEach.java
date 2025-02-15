import java.util.*;

public class LinkedHashMapForEach {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(101, "Java");
        map.put(102, "Python");
        map.put(103, "C++");

        System.out.println("Traversing LinkedHashMap using For-Each Loop:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
