import java.util.*;

public class PriorityQueueForEach {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Arrays.asList(5, 10, 15, 20));

        System.out.println("PriorityQueue elements:");
        for (int num : pq) {
            System.out.println(num);
        }
    }
}
