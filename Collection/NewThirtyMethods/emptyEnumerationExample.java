import java.util.*;

public class emptyEnumerationExample {
    public static void main(String[] args) {
        Enumeration<String> enumeration = Collections.emptyEnumeration();
        System.out.println(enumeration.hasMoreElements());
    }
}
