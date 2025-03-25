import java.util.*;

public class checkedSortedMapExample {
    public static void main(String[] args) {
        SortedMap<Integer, String> map = new TreeMap<>();
        SortedMap<Integer, String> checkedMap = Collections.checkedSortedMap(map, Integer.class, String.class);
        checkedMap.put(5, "Five");
        System.out.println(checkedMap);
    }
}
