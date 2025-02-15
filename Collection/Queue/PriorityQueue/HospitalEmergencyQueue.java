import java.util.*;

class Patient implements Comparable<Patient> {
    String name;
    int severity; // Lower severity number = higher priority

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    @Override
    public int compareTo(Patient other) {
        return Integer.compare(this.severity, other.severity);
    }

    @Override
    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}

public class HospitalEmergencyQueue {
    public static void main(String[] args) {
        PriorityQueue<Patient> queue = new PriorityQueue<>();

        // Adding Patients
        queue.add(new Patient("Ram", 3));
        queue.add(new Patient("Shyam", 1));
        queue.add(new Patient("Akay", 5));
        queue.add(new Patient("Kaju", 2));

        // Checking the Most Critical Patient (Peek)
        System.out.println("Most Critical: " + queue.peek());

        // Treating the Most Critical Patient
        System.out.println("Treating: " + queue.poll());

        // Checking Remaining Patients
        System.out.println("Remaining: " + queue);

        // Checking Size
        System.out.println("Total Patients: " + queue.size());

        // Clearing the Queue
        queue.clear();
        System.out.println("Queue Empty? " + queue.isEmpty());
    }
}
