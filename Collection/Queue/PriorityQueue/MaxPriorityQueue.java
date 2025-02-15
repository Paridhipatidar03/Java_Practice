import java.util.*;

public class MaxPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());
        maxPQ.add(40);
        maxPQ.add(10);
        maxPQ.add(30);
        maxPQ.add(20);

        System.out.println("Max-PriorityQueue (Reverse Order): " + maxPQ);
    }
}
