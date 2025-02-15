import java.util.TreeSet;

public class TreeSetGeneric {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        // Adding elements (TreeSet maintains sorting)
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);
        // numbers.add(40);

        // Checking and removing elements
        System.out.println("First: " + numbers.first());
        System.out.println("Last: " + numbers.last());
        System.out.println("Higher than 20: " + numbers.higher(20));
        numbers.remove(30);

        // Checking size and clearing
        System.out.println("Size: " + numbers.size());
        numbers.clear();
        System.out.println("TreeSet Empty? " + numbers.isEmpty());
    }
}
