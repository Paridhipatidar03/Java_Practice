class Counter {
    private int c = 0; // Shared variable

    // Synchronized method to increment counter
    public synchronized void inc() {
        c++;
    }

    // Synchronized method to get counter value
    public synchronized int getValue() {
        return c;
    }
}

public class SynchronizationEx {
    public static void main(String[] args) {
        Counter cnt = new Counter(); // Shared resource

        // Thread 1 to increment counter
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                cnt.inc();
                System.out.println("Thread 1: " + cnt.getValue());
                try {
                    Thread.sleep(10); // Simulate processing time
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Thread 2 to increment counter
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                cnt.inc();
                System.out.println("Thread 2: " + cnt.getValue());
                try {
                    Thread.sleep(10); // Simulate processing time
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start both threads
        t1.start();
        t2.start();

        // Wait for threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print final counter value
        System.out.println("Final Counter Value: " + cnt.getValue());
    }
}
// As Thread 1 and Thread 2 run concurrently, they may interleave unpredictably. For example:
// Thread 1 might increment the counter (cnt.inc()) but not print it immediately.
// Before Thread 1 prints the value, Thread 2 could increment the counter and print its value.

// Both threads share the same counter (cnt), and they both increment it. If Thread 2 executes cnt.inc() after Thread 1 but before Thread 1 prints, the counter will already have been incremented by the time Thread 1 prints.

// Synchronization ensures that only one thread can execute inc() or getValue() at a time, but it doesn't control when a thread runs.

// Thread 1 increments the counter to 2 but is preempted before printing.
// Thread 2 increments the counter to 3 and prints it.
// Then Thread 1 resumes and prints 3 (skipping 2 as seen from its perspective).