import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetIterator {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(50);
        numbers.add(20);
        numbers.add(30);

        // Using Iterator
        Iterator<Integer> itr = numbers.iterator();
        System.out.print("TreeSet using Iterator: ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
