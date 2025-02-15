import java.util.*;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "swiss";
        Hashtable<Character, Integer> table = new Hashtable<>();

        for (char c : str.toCharArray()) {
            table.put(c, table.getOrDefault(c, 0) + 1);
        }

        for (char c : str.toCharArray()) {
            if (table.get(c) == 1) {
                System.out.println("First Non-Repeating Character: " + c);
                break;
            }
        }
    }
}
