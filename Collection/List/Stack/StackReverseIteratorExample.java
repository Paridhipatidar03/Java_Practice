import java.util.ListIterator;
import java.util.Stack;

public class StackReverseIteratorExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        System.out.println("Stack elements in LIFO order:");

        // ListIterator is an enhanced version of Iterator that allows bidirectional traversal (both forward and backward) in List implementations like ArrayList, LinkedList, and Stack.

        ListIterator<String> listIterator = stack.listIterator(stack.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}