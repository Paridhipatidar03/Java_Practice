import java.util.*;

public class checkedQueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> checkedQueue = Collections.checkedQueue(queue, Integer.class);
        checkedQueue.add(100);
        System.out.println(checkedQueue);
    }
}
