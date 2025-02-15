import java.util.LinkedHashSet;

public class LinkedHashSetRemove {
    public static void main(String[] args) {
        LinkedHashSet<String> names = new LinkedHashSet<>();

        names.add("Ram");
        names.add("Shyam");
        names.add("Arjun");

        System.out.println("Before removal: " + names);

        // Removing an element
        names.remove("Bob");

        System.out.println("After removal: " + names);
    }
}
