import java.util.*;

public class VectorGeneric {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>(List.of("Apple", "Banana", "Cherry", "Date"));
        System.out.println("Initial Vector: " + vector);

        vector.add(2, "Blueberry");
        vector.set(3, "Dragonfruit");
        vector.remove("Banana");
        vector.remove(1);
        System.out.println("Updated Vector: " + vector);

        System.out.println("Contains 'Apple'? " + vector.contains("Apple"));
        System.out.println("Size: " + vector.size());

        System.out.print("Iterating: ");
        vector.forEach(fruit -> System.out.print(fruit + " "));
        System.out.println();

        vector.clear();
        System.out.println("After clearing: " + vector);
    }
}
