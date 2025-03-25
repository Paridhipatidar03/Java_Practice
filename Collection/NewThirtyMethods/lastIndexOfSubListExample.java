import java.util.*;

public class lastIndexOfSubListExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 20, 30);
        List<Integer> sublist = Arrays.asList(20, 30);
        int index = Collections.lastIndexOfSubList(list, sublist);
        System.out.println("Last occurrence at index: " + index);
    }
}
