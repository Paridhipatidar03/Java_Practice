import java.util.Stack;

public class StackReverseForEach {
    public static void main(String[] args) {
        Stack<Double> stack = new Stack<>();
        stack.push(1.1);
        stack.push(2.2);
        stack.push(3.3);

        System.out.println("Iterating in LIFO order:");
        stack.stream()
             .sorted((a, b) -> -1) // Reverse order
             .forEach(System.out::println);
    }
}


// Method	                                                    Modifies  Stack?                     	Memory Usage	Efficiency
// Collections.reverse()	                                           ✅ Yes	                            Low	        Fastest
// stream().sorted(Comparator.reverseOrder())	                       ❌ No	                                High	     Medium
// ListIterator (Reverse Iteration)	                                   ❌ No	                                Low	        Fastest
