import java.util.Vector;

public class VectorBasic {
    public static void main(String[] args) {
        Vector<String> tasks = new Vector<>();

        tasks.add("Buy groceries");
        tasks.add("Complete project");
        tasks.add("Pay bills");

        System.out.println("Tasks: " + tasks);

        tasks.remove("Pay bills"); // Removing a completed task
        System.out.println("Updated Tasks: " + tasks);
    }
}
