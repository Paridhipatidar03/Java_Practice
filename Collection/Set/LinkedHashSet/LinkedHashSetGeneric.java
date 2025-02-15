import java.util.LinkedHashSet;

public class LinkedHashSetGeneric {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        // Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Checking and removing elements
        System.out.println("Contains 20? " + numbers.contains(20));
        numbers.remove(20);

        // Checking size and clearing
        System.out.println("Size: " + numbers.size());
        numbers.clear();
        System.out.println("LinkedHashSet Empty? " + numbers.isEmpty());
    }
}
