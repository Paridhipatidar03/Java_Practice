import java.util.*;

public class checkedNavigableSetExample {
    public static void main(String[] args) {
        NavigableSet<String> set = new TreeSet<>();
        NavigableSet<String> checkedSet = Collections.checkedNavigableSet(set, String.class);
        checkedSet.add("A");
        System.out.println(checkedSet);
    }
}
