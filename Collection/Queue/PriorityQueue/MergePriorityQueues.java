import java.util.*;

public class MergePriorityQueues {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Arrays.asList(10, 30, 50));
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Arrays.asList(20, 40, 60));

        pq1.addAll(pq2);
        System.out.println("Merged PriorityQueue: " + pq1);
    }
}
