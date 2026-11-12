import java.util.Scanner;

class Student {
    private int rollNo;
    private String name;
    private double marks;

    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public void display() {
        System.out.println("RollNo: " + this.rollNo);
        System.out.println("Name: " + this.name);
        System.out.println("Marks: " + this.marks);
    }
}

public class student_details {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int rollNo = sc.nextInt();
        String name = sc.next();
        double marks = sc.nextDouble();

        Student student = new Student(rollNo, name, marks);
        student.display();
    }
}