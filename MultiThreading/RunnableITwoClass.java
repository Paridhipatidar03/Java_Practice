class TaskFirst implements Runnable{

    public void run(){
        System.out.println("stat=1");
        System.out.println("stat=2");
        System.out.println("stat=3");
        System.out.println("stat=4");
    }
}
class TaskSecond implements Runnable{

    public void run(){
        System.out.println("stat=11");
        System.out.println("stat=22");
        System.out.println("stat=33");
        System.out.println("stat=44");
    }
}

public class RunnableITwoClass{

    public static void main(String[] args) {
        
        Thread t1= new Thread(new TaskFirst());
        Thread t2= new Thread(new TaskSecond());

        t1.start();
        t2.start();
    }
}