import java.util.*;

public class RemoveHighestPriority {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Arrays.asList(25, 10, 50, 5, 30));
        int a=pq.poll();

        System.out.println("Smallest Element Removed: "  +a);
        System.out.println("PriorityQueue after removal: " + pq);
    }
}
