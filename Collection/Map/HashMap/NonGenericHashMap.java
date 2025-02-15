import java.util.*;

public class NonGenericHashMap {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("One", 1);
        map.put(2, "Two");
        map.put(3.5, true);

        System.out.println("Non-Generic HashMap: " + map);
    }
}
