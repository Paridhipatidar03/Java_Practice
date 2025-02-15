import java.util.*;
public class LL_Generic {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Shyam");
        list.add("Ram");
        System.out.println(list.size());
        list.contains("Ram");
        list.addFirst("Shyam");
        System.out.println(list.get(0));
        list.add(1,"Aman");
        list.addLast("Anuj");
        System.out.println(list);
    }
}
