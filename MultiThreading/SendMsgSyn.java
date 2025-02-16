import java.io.*;
import java.util.Scanner;

// Sender class that sends messages
class Sender {
    public void send(String msg) {
        System.out.println("Sending: " + msg);
        try {
            Thread.sleep(2000); // Simulating delay in sending
        } catch (Exception e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("Message Sent: " + msg);
    }
}

// ThreadedSend class for sending messages from two sides
class ThreadedSend extends Thread {
    private String msg;
    private Sender sender;

    // Constructor to initialize the message and sender
    ThreadedSend(String msg, Sender sender) {
        this.msg = msg;
        this.sender = sender;
    }

    public void run() {
        // Synchronize the sender object to ensure only one thread sends at a time
        synchronized (sender) {
            sender.send(msg);
        }
    }
}

// Driver class
public class SendMsgSyn {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Sender send = new Sender(); // Shared Sender object

        // Input messages for side 1
        System.out.println("Side 1: Enter your first message:");
        String side1Msg1 = sc.nextLine();
        System.out.println("Side 1: Enter your second message:");
        String side1Msg2 = sc.nextLine();

        // Input messages for side 2
        System.out.println("Side 2: Enter your first message:");
        String side2Msg1 = sc.nextLine();
        System.out.println("Side 2: Enter your second message:");
        String side2Msg2 = sc.nextLine();

        // Creating threads for each message
        ThreadedSend side1Thread1 = new ThreadedSend(side1Msg1, send);
        ThreadedSend side1Thread2 = new ThreadedSend(side1Msg2, send);
        ThreadedSend side2Thread1 = new ThreadedSend(side2Msg1, send);
        ThreadedSend side2Thread2 = new ThreadedSend(side2Msg2, send);

        // Start all threads
        side1Thread1.start();
        side2Thread1.start();
        side1Thread2.start();
        side2Thread2.start();

        // Wait for all threads to complete
        try {
            side1Thread1.join();
            side2Thread1.join();
            side1Thread2.join();
            side2Thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("All messages have been sent properly.");
    }
}
