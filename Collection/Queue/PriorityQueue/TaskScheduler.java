import java.util.*;

class Task implements Comparable<Task> {
    String name;
    int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }

    public String toString() {
        return name + " (Priority: " + priority + ")";
    }
}

public class TaskScheduler {
    public static void main(String[] args) {
        PriorityQueue<Task> pq = new PriorityQueue<>();
        pq.add(new Task("Write Code", 2));
        pq.add(new Task("Submit Report", 1));
        pq.add(new Task("Fix Bugs", 3));

        System.out.println("Executing tasks based on priority:");
        while (!pq.isEmpty()) {
            System.out.println("Processing: " + pq.poll());
        }
    }
}
