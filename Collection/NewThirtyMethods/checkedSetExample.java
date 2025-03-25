import java.util.*;

public class checkedSetExample {
    public static void main(String[] args) {
        Set<Double> set = new HashSet<>();
        Set<Double> checkedSet = Collections.checkedSet(set, Double.class);
        checkedSet.add(1.5);
        System.out.println(checkedSet);
    }
}
