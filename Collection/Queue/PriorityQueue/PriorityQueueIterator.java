import java.util.*;

public class PriorityQueueIterator {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Banana");
        pq.add("Apple");
        pq.add("Cherry");

        Iterator<String> iterator = pq.iterator();
        System.out.println("PriorityQueue elements:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
