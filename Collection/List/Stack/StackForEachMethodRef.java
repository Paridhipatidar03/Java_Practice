import java.util.Stack;

public class StackForEachMethodRef {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Dog");
        stack.push("Cat");
        stack.push("Bird");

        System.out.println("Iterating using method reference:");
        stack.forEach(System.out::println);
    }
}

