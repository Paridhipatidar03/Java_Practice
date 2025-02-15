import java.util.Vector;

public class VectorNonGeneric {
        public static void main(String[] args) {
        Vector v = new Vector(); // Non-generic Vector

        v.add(10);
        v.add(20);
        v.add(30);

        System.out.println("Vector: " + v);

        v.remove(1); // Removes element at index 1 (20)
        System.out.println("After Removal: " + v);
    }

}
