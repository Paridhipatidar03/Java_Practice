import java.util.*;

public class TreeMapKeyValueTraversal {
    public static void main(String[] args) {
        TreeMap<String, Double> map = new TreeMap<>();
        map.put("Math", 95.5);
        map.put("Science", 88.0);
        map.put("English", 78.5);

        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());
    }
}
