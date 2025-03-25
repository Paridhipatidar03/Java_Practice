import java.util.*;

public class binarySearchExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        int index = Collections.binarySearch(list, 30);
        System.out.println("Index: " + index);
    }
}
