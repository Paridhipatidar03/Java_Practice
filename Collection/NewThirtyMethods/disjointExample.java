import java.util.*;

public class disjointExample {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        boolean result = Collections.disjoint(list1, list2);
        System.out.println("Are disjoint: " + result);
    }
}
