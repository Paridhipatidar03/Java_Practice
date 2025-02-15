import java.util.*;

public class NonGenericPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add("Apple");
        pq.add(50);  // This will cause a runtime error because types are mixed

        System.out.println("Non-Generic PriorityQueue: " + pq);
    }
}
