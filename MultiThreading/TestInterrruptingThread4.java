public class TestInterrruptingThread4 extends Thread {
    
     public void run(){
        for(int i=1;i<=2;i++){
             if(Thread.interrupted()){
                System.out.println("code for normal thread ");
             }
             else{
                System.out.println("code for normal thread");
             }
        }
         
     }
     public static void main(String[] args) {
        
        TestInterrruptingThread4 t1= new TestInterrruptingThread4();

        TestInterrruptingThread4 t2= new TestInterrruptingThread4();

        t1.start();
        t2.interrupt();
        t2.start();

     }
}
