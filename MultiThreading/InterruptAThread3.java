public class InterruptAThread3 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        InterruptAThread3 t1 = new InterruptAThread3();
        t1.start();  // Start the thread
        t1.interrupt();  // Interrupt the thread (though it won't affect the loop here)
    }
}
