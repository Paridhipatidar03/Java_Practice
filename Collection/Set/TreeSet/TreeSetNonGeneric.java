import java.util.TreeSet;

public class TreeSetNonGeneric {
    public static void main(String[] args) {
        TreeSet set = new TreeSet(); // Non-generic TreeSet

        set.add("Banana");
        set.add("Apple");
        set.add("Cherry");

        System.out.println("TreeSet (Sorted): " + set);
    }
}
