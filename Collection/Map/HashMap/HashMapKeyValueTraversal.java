import java.util.*;

public class HashMapKeyValueTraversal {
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();
        map.put("Math", 95.5);
        map.put("Science", 88.0);
        map.put("English", 78.5);

        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());
    }
}
