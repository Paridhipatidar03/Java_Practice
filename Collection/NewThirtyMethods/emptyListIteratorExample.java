import java.util.*;

public class emptyListIteratorExample {
    public static void main(String[] args) {
        ListIterator<String> listIterator = Collections.emptyListIterator();
        System.out.println(listIterator.hasNext());
    }
}
