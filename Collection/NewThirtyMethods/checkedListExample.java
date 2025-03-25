import java.util.*;

public class checkedListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> checkedList = Collections.checkedList(list, String.class);
        checkedList.add("Java");
        System.out.println(checkedList);
    }
}
