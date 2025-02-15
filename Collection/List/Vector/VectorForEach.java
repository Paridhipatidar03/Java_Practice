import java.util.Vector;

public class VectorForEach {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();

        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);

        System.out.println("Vector Elements: " + v);

        // Using for-each loop to iterate
        System.out.print("Elements using for-each: ");
        for (Integer num : v) {
            System.out.print(num + " ");
        }
    }
}
