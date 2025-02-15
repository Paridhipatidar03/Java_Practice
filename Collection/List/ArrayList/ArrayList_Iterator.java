import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Iterator {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("Paridhi");
        a.add("Patidar");

        Iterator<String> iterator = a.iterator();
        System.out.println("Iterating through iterator:");

        while (iterator.hasNext()) {  
            System.out.println(iterator.next()); 
        }
    }
}
