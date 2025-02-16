import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SharedResource {
    private final Lock lock = new ReentrantLock();

    public void displayMessage(String message) {
        lock.lock(); // Acquire the lock
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println(message + " - " + i);
                try {
                    Thread.sleep(500); // Simulate some delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } finally {
            lock.unlock(); // Release the lock
        }
    }
}

public class ExplicitLockExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread thread1 = new Thread(() -> resource.displayMessage("Thread 1"));
        Thread thread2 = new Thread(() -> resource.displayMessage("Thread 2"));

        thread1.start();
        thread2.start();
    }
}
