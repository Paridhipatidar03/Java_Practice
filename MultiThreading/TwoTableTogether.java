class TableTwo extends Thread{
    public void printTable(){
        for(int i=1;i<=10;i++){
            System.out.println("2 * " +i +" = " +(i*2));
        }
       
    }
    public void run(){
        printTable();
    }

}
class TableThree extends Thread{
    public void printTable(){
        for(int i=1;i<=10;i++){
            System.out.println("3 * " +i +" = " +(i*3));
        }
       
    }
    public void run(){
        printTable();
    }

}
public class TwoTableTogether{
    public static void main(String[] args) {
        TableTwo t1= new TableTwo();
        TableThree t2 = new TableThree();

        t1.start();
        t2.start();
    }
}