import java.util.Vector;

public class VectorEmployee {
        public static void main(String[] args) {
        Vector<String> employees = new Vector<>();

        // Adding employees
        employees.add("Alice");
        employees.add("Bob");
        employees.add("Charlie");

        System.out.println("Employee List: " + employees);

        // Removing an employee
        employees.remove("Bob");

        // Checking if an employee exists
        if (employees.contains("Alice")) {
            System.out.println("Alice is still in the company.");
        }

        System.out.println("Updated Employee List: " + employees);
    }

}
