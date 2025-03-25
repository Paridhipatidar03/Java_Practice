import java.util.*;

public class frequencyExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Python", "Java", "C++");
        int freq = Collections.frequency(list, "Java");
        System.out.println("Frequency of Java: " + freq);
    }
}
