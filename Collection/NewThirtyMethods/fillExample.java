import java.util.*;

public class fillExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
        Collections.fill(list, "Z");
        System.out.println(list);
    }
}
