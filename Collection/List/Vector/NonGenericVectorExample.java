// Vector is a resizable array that is synchronized (thread-safe). Before Java 5, generics were not available, so Vector was used without specifying a type. This means it could store different types of objects in the same collection.

import java.util.Vector;

public class NonGenericVectorExample {
    public static void main(String[] args) {
        Vector v = new Vector();  

        // Adding different types of elements
        v.add("Hello");   
        v.add(100);       
        v.add(3.14);      
        v.add(true);      
        v.add('A');       

        System.out.println("Vector Elements: " + v);

        System.out.println("Element at index 1: " + v.get(1));

        System.out.println("\nIterating through Vector:");

        for (Object obj : v) {
            System.out.println(obj + " (Type: " + obj.getClass().getSimpleName() + ")");
        }
    }
}
