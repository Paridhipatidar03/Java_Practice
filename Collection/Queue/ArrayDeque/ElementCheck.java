import java.util.*;

public class ElementCheck {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("Red");
        deque.add("Green");
        deque.add("Blue");
        deque.add("Yellow");

        String searchElement = "Green";

        if (deque.contains(searchElement)) {
            System.out.println(searchElement + " is present in the ArrayDeque.");
        } else {
            System.out.println(searchElement + " is NOT present in the ArrayDeque.");
        }
    }
}
