import java.util.*;

public class KthSmallestElement {
    public static int findKthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.addAll(Arrays.stream(arr).boxed().toList());
        // Arrays.stream(arr) produces a stream of 5, 1, 3, 2.
        // .boxed() Converts each int in the stream into an Integer (autoboxing).
        // Collects the boxed integers into an immutable List<Integer>.
        // Adds all elements from the list to the PriorityQueue<Integer> pq.

        // PriorityQueue (Min-Heap): { 3, 4, 7, 10, 20, 15 }
        
        for (int i = 1; i < k; i++) {
            pq.poll();
        }
        return pq.poll();
    }

    public static void main(String[] args) {
        int[] arr = { 7, 10, 4, 3, 20, 15 };
        int k = 3;

        System.out.println("3rd Smallest Element: " + findKthSmallest(arr, k));
    }
}
