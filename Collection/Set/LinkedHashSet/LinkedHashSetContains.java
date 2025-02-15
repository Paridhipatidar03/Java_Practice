import java.util.LinkedHashSet;

public class LinkedHashSetContains {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);

        // Checking if 200 exists
        if (numbers.contains(200)) {
            System.out.println("200 is in the set.");
        } else {
            System.out.println("200 is not in the set.");
        }
    }
}
