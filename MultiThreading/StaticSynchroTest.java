
class PrintTest extends Thread {

    // Static synchronization locks the class PrintTest
    synchronized public static void printThread(int n)
    {

        for (int i = 1; i <= 10; i++) {

            System.out.println("Thread " + n
                               + " is working...");

            // Try block to check for exceptions
            try {

                // making thread to sleep for 0.6 seconds
                Thread.sleep(600);
            }

            // Catch block to handle the exceptions
            catch (Exception ex) {

                System.out.println(ex.toString());
            }
        }

        System.out.println("--------------------------");

        try {
            Thread.sleep(1000);
        }

        catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}

class Thread1 extends Thread {

    public void run()
    {

        // Passing the class not the object
        PrintTest.printThread(1);
    }
}

// Helper class extending Thread class
class Thread2 extends Thread {

    public void run()
    {

        // Passing the class not the object
        PrintTest.printThread(2);
    }
}

// Main class
public class StaticSynchroTest {

    public static void main(String[] args)
    {

        // No shared object
        // Creating objects of class 2 and 3 that
        // are extending to Thread class
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        // Starting thread with help of start() method
        t1.start();
        t2.start();
    }
}
