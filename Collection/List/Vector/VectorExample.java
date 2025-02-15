import java.util.Vector;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class VectorExample {
    public static void main(String[] args) {
        // Create a Generic Vector (stores only Integers)
        Vector<Integer> vector = new Vector<>();

        // 1️ Adding Elements
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);
        vector.add(60);
        System.out.println("Vector after additions: " + vector);

        // 2️ Inserting Element at a Specific Index
        vector.add(2, 25); // Inserts 25 at index 2
        System.out.println("After inserting 25 at index 2: " + vector);

        // 3️ Removing Elements
        vector.remove(3); // Removes element at index 3
        vector.remove(Integer.valueOf(60)); // Removes first occurrence of 60
        System.out.println("After removing elements: " + vector);

        // 4️ Accessing Elements
        System.out.println("Element at index 1: " + vector.get(1));

        // 5️ Updating an Element
        vector.set(2, 35); // Updates index 2 with 35
        System.out.println("After updating index 2 with 35: " + vector);

        // 6️ Checking Size and Capacity
        System.out.println("Vector Size: " + vector.size());
        System.out.println("Vector Capacity: " + vector.capacity()); // Default: starts with 10, doubles when full

        // 7️ Checking if Vector Contains an Element
        System.out.println("Contains 40? " + vector.contains(40));
        System.out.println("Contains 100? " + vector.contains(100));

        // 8️ Finding Index of an Element
        System.out.println("Index of 35: " + vector.indexOf(35));

        // 9️ Iterating Over Vector (Different Ways)

        // ➤ Using Iterator
        System.out.print("Using Iterator: ");
        Iterator<Integer> it = vector.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // ➤ Using ListIterator (Forward & Backward)
        System.out.print("Using ListIterator Forward: ");
        ListIterator<Integer> listIt = vector.listIterator();
        while (listIt.hasNext()) {
            System.out.print(listIt.next() + " ");
        }
        System.out.println();

        System.out.print("Using ListIterator Backward: ");
        while (listIt.hasPrevious()) {
            System.out.print(listIt.previous() + " ");
        }
        System.out.println();

        // ➤ Using Enumeration
        System.out.print("Using Enumeration: ");
        Enumeration<Integer> en = vector.elements();
        while (en.hasMoreElements()) {
            System.out.print(en.nextElement() + " ");
        }
        System.out.println();

        // ➤ Using forEach() with Lambda
        System.out.print("Using forEach() method: ");
        vector.forEach(element -> System.out.print(element + " "));
        System.out.println();

        //  Sorting the Vector
        Collections.sort(vector);
        System.out.println("Sorted Vector: " + vector);

        //  Converting Vector to Array
        Integer[] array = vector.toArray(new Integer[0]);
        System.out.print("Vector as Array: ");
        for (Integer num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        //  Clearing the Vector
        vector.clear();
        System.out.println("After clearing: " + vector);
        System.out.println("Is Vector empty? " + vector.isEmpty());
    }
}
