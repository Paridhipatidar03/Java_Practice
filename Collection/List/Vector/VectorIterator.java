import java.util.*;

public class VectorIterator {
     public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();

        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);

        System.out.println("Vector Elements: " + v);

        // Using Iterator to traverse Vector
        Iterator<Integer> itr = v.iterator();
        System.out.print("Elements using Iterator: ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
