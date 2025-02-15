import java.util.*;

public class NonGenericHashtable {
    public static void main(String[] args) {
        Hashtable table = new Hashtable();
        table.put("One", 1);
        table.put(2, "Two");
        table.put(3.5, true);

        System.out.println("Non-Generic Hashtable: " + table);
    }
}
