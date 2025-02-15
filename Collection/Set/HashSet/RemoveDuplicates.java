import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 10, 20, 40};

        HashSet<Integer> uniqueNumbers = new HashSet<>();
        for (int num : numbers) {
            uniqueNumbers.add(num);
        }

        System.out.println("Array without duplicates: " + uniqueNumbers);
    }
}
