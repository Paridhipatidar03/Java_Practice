import java.util.*;

public class SumUsingForEach {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(10, 20, 30, 40, 50));

        int sum = 0;
        for (int num : deque) {
            sum += num;
        }

        System.out.println("Sum of elements: " + sum);
    }
}
