import java.util.*;

public class HashtableForEach {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();
        table.put(101, "Java");
        table.put(102, "Python");
        table.put(103, "C++");

        System.out.println("Traversing Hashtable using For-Each Loop:");
        for (Map.Entry<Integer, String> entry : table.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
