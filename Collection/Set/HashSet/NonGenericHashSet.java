import java.util.HashSet;

public class NonGenericHashSet {
    public static void main(String[] args) {
        HashSet set = new HashSet(); // Non-generic

        set.add("Hello");
        set.add(100);  // Integer
        set.add(20.5); // Double

        System.out.println("HashSet (Non-Generic): " + set);
    }
}
