import java.util.LinkedHashSet;

public class LinkedHashSetNonGeneric {
    public static void main(String[] args) {
        LinkedHashSet set = new LinkedHashSet(); // Non-generic

        set.add(10);
        set.add("Hello");
        set.add(20.5);

        System.out.println("LinkedHashSet (Non-Generic): " + set);
    }
}
