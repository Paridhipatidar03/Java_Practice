import java.util.*;

public class LL_Non_Generic {
    public static void main(String[] args) {
        List linkedList = new LinkedList<>();
        List linkedList2 = new LinkedList<>();
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);
        System.out.println(linkedList);

        linkedList2.add(100);
        linkedList2.add(200);
        linkedList2.add(400);

        linkedList.toArray();

        System.out.println(linkedList);
        System.out.println(linkedList.contains(100));
        System.out.println(linkedList.getClass());
        linkedList2.retainAll(linkedList);
        System.out.println(linkedList2);

        System.out.println(linkedList.containsAll(linkedList2));

        linkedList2.add(300);
        System.out.println(linkedList);
        System.out.println(linkedList2);
        System.out.println(linkedList.equals(linkedList2)
        );
        int hashCode=linkedList.hashCode();
        System.out.println("hahCode of linkedList2" +hashCode);
    }
}
