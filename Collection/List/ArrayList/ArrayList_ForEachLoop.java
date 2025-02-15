import java.util.*;  

public class ArrayList_ForEachLoop {
    public static void main(String[] args) {
        ArrayList<String> aa = new ArrayList<>();
        System.out.println("Enter your Name:");
        
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        
        aa.add("Hello Dear!");
        aa.add(" Greetings ");
        aa.add(name);
        
        for (String s : aa) {  
            System.out.println(s); 
        }

        sc.close();  
    }
}

