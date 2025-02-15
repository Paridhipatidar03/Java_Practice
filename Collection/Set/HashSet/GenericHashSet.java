import java.util.HashSet;

public class GenericHashSet {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Checking and removing elements
        System.out.println("Contains 'Banana'? " + fruits.contains("Banana"));
        fruits.remove("Banana");

        // Checking size and clearing
        System.out.println("Size: " + fruits.size());
        fruits.clear();
        System.out.println("HashSet Empty? " + fruits.isEmpty());
    }
}
