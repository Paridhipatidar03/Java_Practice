import java.util.*;

public class NonGenericLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap map = new LinkedHashMap();
        map.put("One", 1);
        map.put(2, "Two");
        map.put(3.5, true);

        System.out.println("Non-Generic LinkedHashMap: " + map);
    }
}
