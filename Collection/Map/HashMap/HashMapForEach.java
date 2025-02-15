import java.util.*;

public class HashMapForEach {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Java");
        map.put(102, "Python");
        map.put(103, "C++");

        System.out.println("Traversing HashMap using For-Each Loop:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
