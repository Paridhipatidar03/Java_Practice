import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterator {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        Iterator<Integer> itr = numbers.iterator();
        System.out.print("HashSet using Iterator: ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}

