import java.util.*;

public class emptyIteratorExample {
    public static void main(String[] args) {
        Iterator<String> iterator = Collections.emptyIterator();
        System.out.println(iterator.hasNext());
    }
}
