import java.util.*;

public class LL_ForEach {
  public static void main(String[] args) {
    LinkedList<Integer> list= new LinkedList<>();
    list.add(2);
    list.add(3);
    list.add(5);
    for(int l:list){
      System.out.println(l);
    }
  }   
}
