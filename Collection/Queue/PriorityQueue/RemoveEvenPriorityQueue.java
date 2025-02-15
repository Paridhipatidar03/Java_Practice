import java.util.*;

public class RemoveEvenPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Arrays.asList(10, 15, 20, 25, 30));

        Iterator<Integer> iterator = pq.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println("PriorityQueue after removing even numbers: " + pq);
    }
}
