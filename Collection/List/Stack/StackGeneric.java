import java.util.*;
class Student {

    int rollNo, age;
    String name;

    Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "{Roll No:" + rollNo + "name=" + name + "', age=" + age + "}";
    }
}
public class StackGeneric {

    public static void main(String[] args) {

        List<Student> li = new Stack<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num of students");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Enter Student Details");
            System.out.println("Roll NO :");
            int roll = sc.nextInt();

            System.out.println("Name:");
            String name = sc.nextLine();
            sc.nextLine();
            System.out.println("Age:");
            int age = sc.nextInt();
            Student s1 = new Student(roll, name, age);
            li.add(s1);
        }
    }
}