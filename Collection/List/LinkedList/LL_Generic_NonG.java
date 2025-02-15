import java.util.*;
public class LL_Generic_NonG{

    public static void main(String[] args) {
        List <Integer> list=new LinkedList<>();
        list.add(1);
        LinkedList<String> list2=new LinkedList<>();
        list2.add("Hello");
        List list3=new LinkedList<>();
        list3.addAll(list);
        list3.addAll(list2);
        System.out.println(list3);
    }
}