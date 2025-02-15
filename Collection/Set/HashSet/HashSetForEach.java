import java.util.HashSet;

public class HashSetForEach {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Indore");
        cities.add("Bhopal");
        cities.add("Delhi");

        System.out.print("HashSet using For-Each: ");
        for (String city : cities) {
            System.out.print(city + " ");
        }
    }
}
