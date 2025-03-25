import java.util.*;

public class enumerationExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("X", "Y", "Z");
        Enumeration<String> enumeration = Collections.enumeration(list);
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
