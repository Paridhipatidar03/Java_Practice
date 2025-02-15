import java.util.*;

public class ArrayList_Generic {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list.add(1);
        list.size();
        list.add(1, 2);
        list.addFirst(4);
        list.addLast(5);
        list2.addAll(list);
        list2.add(9);
        System.out.println(list);
        System.out.println(list2);
    }
}
