import java.util.*;

public class checkedCollectionExample {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        Collection<String> checkedList = Collections.checkedCollection(list, String.class);
        checkedList.add("Hello");
        System.out.println(checkedList);
    }
}
