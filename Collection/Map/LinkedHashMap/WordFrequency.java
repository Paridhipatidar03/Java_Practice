import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        String sentence = "hello world hello java world java hello";
        String[] words = sentence.split(" ");

        LinkedHashMap<String, Integer> wordCount = new LinkedHashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Frequency: " + wordCount);
    }
}
