import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetIterator {
    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<>();

        cities.add("New York");
        cities.add("London");
        cities.add("Tokyo");

        System.out.print("Cities using Iterator: ");
        Iterator<String> itr = cities.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
