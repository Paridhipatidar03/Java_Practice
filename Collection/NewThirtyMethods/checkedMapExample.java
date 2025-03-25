import java.util.*;

public class checkedMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        Map<Integer, String> checkedMap = Collections.checkedMap(map, Integer.class, String.class);
        checkedMap.put(1, "One");
        System.out.println(checkedMap);
    }
}
