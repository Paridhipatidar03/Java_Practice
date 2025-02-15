import java.util.*;

public class MergeHashtables {
    public static void main(String[] args) {
        Hashtable<Integer, String> table1 = new Hashtable<>();
        table1.put(1, "A");
        table1.put(2, "B");

        Hashtable<Integer, String> table2 = new Hashtable<>();
        table2.put(3, "C");
        table2.put(4, "D");

        table1.putAll(table2);
        System.out.println("Merged Hashtable: " + table1);
    }
}
