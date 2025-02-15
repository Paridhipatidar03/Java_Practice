import java.util.HashSet;

public class CheckValueInHashSet {
    public static void main(String[] args) {
        HashSet<String> employees = new HashSet<>();
        employees.add("Ram");
        employees.add("Shyam");
        employees.add("Arjun");

        String search = "Arjun";
        if (employees.contains(search)) {
            System.out.println(search + " is an employee.");
        } else {
            System.out.println(search + " is not an employee.");
        }
    }
}
