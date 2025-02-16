class SharedResource {
    public void displayMessage(String message) {
        synchronized (this) { // Implicit lock on the current instance
            for (int i = 0; i < 3; i++) {
                System.out.println(message + " - " + i);
                try {
                    Thread.sleep(500); // Simulate some delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class ImplicitLockExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread thread1 = new Thread(() -> resource.displayMessage("Thread 1"));
        Thread thread2 = new Thread(() -> resource.displayMessage("Thread 2"));

        thread1.start();
        thread2.start();
    }
}
