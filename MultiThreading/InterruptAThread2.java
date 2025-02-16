public class InterruptAThread2 extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("GeeksforGeeks");
        } catch (InterruptedException e) {
            throw new RuntimeException("Thread interrupted");
        }
    }

    public static void main(String[] args) {
        InterruptAThread2 t1 = new InterruptAThread2();
        t1.start(); // Start the thread
        try {
            t1.interrupt(); // Interrupt the thread
        } catch (Exception e) {
            System.out.println("Exception handled");
        }
    }
}
