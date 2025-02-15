import java.util.*;

public class NonGenericTreeMap {
    public static void main(String[] args) {
        TreeMap map = new TreeMap();
        map.put(10, "Ten");
        map.put(5, 50);
        map.put(20, true);

        System.out.println("Non-Generic TreeMap: " + map);
    }
}
