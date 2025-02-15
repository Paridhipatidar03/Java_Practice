import java.util.*;

public class ForEachLoopExample {
    public static void main(String[] args) {
        Deque<String> cities = new ArrayDeque<>();
        cities.add("New York");
        cities.add("London");
        cities.add("Paris");

        System.out.println("Traversing using For-Each Loop:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
