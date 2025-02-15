// Last In first Out

import java.util.Stack;
import java.util.Iterator;

public class StackNonGeneric {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("Ayush");
        stack.push("8");
        stack.push("okay");
        // Returns the head element without removing it (or null if empty).
        System.out.println(stack.peek());
        stack.push("Garima");
        stack.pop();
        Iterator<String> itr = stack.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
