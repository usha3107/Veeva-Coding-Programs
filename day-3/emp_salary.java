//encapsulated employee salary
import java.util.Scanner;

class Employee {
    private int employeeId;
    private String name;
    private double salary;

    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    public boolean setSalary(double newSalary) {
        if (newSalary >= 0) {
            this.salary = newSalary;
            return true;
        }
        return false;
    }
}

public class emp_salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        String name = sc.next();
        double salary = sc.nextDouble();
        double newSalary = sc.nextDouble();

        Employee e = new Employee(id, name, salary);
        if (!e.setSalary(newSalary)) {
            System.out.println("Invalid Salary");
        }
        System.out.printf("%.2f%n", e.getSalary());
    }
}