import java.util.*;

public class checkedQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        
        // Creating a checked queue that only allows Integer values
        Queue<Integer> checkedQueue = Collections.checkedQueue(queue, Integer.class);

        checkedQueue.add(10);
        checkedQueue.add(20);
        checkedQueue.add(30);
        
        System.out.println("Checked Queue: " + checkedQueue);
        
        // This will cause a runtime error if uncommented, because we are trying to add a String
        // ((Queue) checkedQueue).add("Not an Integer"); 
        
        System.out.println("Removed element: " + checkedQueue.poll());
        System.out.println("Updated Queue: " + checkedQueue);
    }
}
