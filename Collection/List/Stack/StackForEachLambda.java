import java.util.Stack;

public class StackForEachLambda {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Iterating using forEach():");
        stack.forEach(element -> System.out.println(element));
    }
}




// For-Each Loop	=====>  Bottom to Top	(Java 5+)
// forEach() (Lambda)	=====>  Bottom to Top	(Java 8+)
// forEach() (Method Reference)	=====>  Bottom to Top	(Java 8+)
// forEach() with Stream Reverse	=====>  LIFO (Top to Bottom)	(Java 8+)