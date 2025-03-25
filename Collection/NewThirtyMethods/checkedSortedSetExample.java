import java.util.*;

public class checkedSortedSetExample {
    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<>();
        SortedSet<String> checkedSet = Collections.checkedSortedSet(set, String.class);
        checkedSet.add("Zebra");
        System.out.println(checkedSet);
    }
}
