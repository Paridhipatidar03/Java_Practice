import java.util.LinkedHashSet;

public class LinkedHashSetForEach {
    public static void main(String[] args) {
        LinkedHashSet<String> fruits = new LinkedHashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.print("Fruits using for-each: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
    }
}
