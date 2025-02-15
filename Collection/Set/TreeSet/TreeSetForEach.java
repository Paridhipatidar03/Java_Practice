import java.util.TreeSet;

public class TreeSetForEach {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();

        names.add("Paridhi");
        names.add("Pooja");
        names.add("Palak");

        System.out.print("TreeSet using For-Each: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
    }
}
