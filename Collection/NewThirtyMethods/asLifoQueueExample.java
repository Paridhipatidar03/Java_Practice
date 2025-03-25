import java.util.*;

public class asLifoQueueExample {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        Queue<Integer> queue = Collections.asLifoQueue(stack);
        System.out.println(queue.poll());
    }
}
