import java.util.*;

public class copyExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(Arrays.asList("A", "B", "C"));
        List<String> list2 = new ArrayList<>(Arrays.asList("", "", ""));
        Collections.copy(list2, list1);
        System.out.println(list2);
    }
}
