import java.util.*;

public class DescendingIterator{
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        
        Iterator<Integer> descIterator = deque.descendingIterator();
        
        System.out.println("Elements in reverse order:");
        while (descIterator.hasNext()) {
            System.out.print(descIterator.next() + " ");
        }
    }
}
