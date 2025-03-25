import java.util.*;

public class checkedNavigableMapExample {
    public static void main(String[] args) {
        NavigableMap<Integer, String> map = new TreeMap<>();
        NavigableMap<Integer, String> checkedMap = Collections.checkedNavigableMap(map, Integer.class, String.class);
        checkedMap.put(10, "Ten");
        System.out.println(checkedMap);
    }
}
