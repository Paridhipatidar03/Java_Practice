import java.util.TreeSet;
import java.util.Collections;

public class TreeSetReverse {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>(Collections.reverseOrder());

        numbers.add(10);
        numbers.add(50);
        numbers.add(30);

        System.out.println("TreeSet in Reverse Order: " + numbers);
    }
}
