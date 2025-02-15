import java.util.*;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "swiss";
        TreeMap<Character, Integer> map = new TreeMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : str.toCharArray()) {
            if (map.get(c) == 1) {
                System.out.println("First Non-Repeating Character: " + c);
                break;
            }
        }
    }
}
