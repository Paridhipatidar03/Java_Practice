import java.util.*;

public class EmployeeRecords {
    public static void main(String[] args) {
        HashMap<Integer, String> employeeMap = new HashMap<>();

        // Add employee records
        employeeMap.put(101, "Ram");
        employeeMap.put(102, "Shyam");
        employeeMap.put(103, "Akash");

        // Retrieve and check employee details
        System.out.println("Employee 102: " + employeeMap.get(102));
        System.out.println("ID 103 exists? " + employeeMap.containsKey(103));

        // Remove an employee
        employeeMap.remove(103);
        System.out.println("After removing ID 103: " + employeeMap);

        // Add if absent and update
        employeeMap.putIfAbsent(104, "Rahul");
        employeeMap.replace(102, "Shyam Jr.");
        System.out.println("Updated Records: " + employeeMap);

        // Iterate through records
        employeeMap.forEach((id, name) -> System.out.println("ID: " + id + ", Name: " + name));

        // Clear all records
        employeeMap.clear();
        System.out.println("Records after clear: " + employeeMap);
    }
}
