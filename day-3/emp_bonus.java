//employee bonus hierarchy
import java.util.Scanner;

class Employee {
    protected String name;
    protected double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    double calculateBonus() { return 0; }
    String getName() { return name; }
}

class Manager extends Employee {
    Manager(String name, double salary) { super(name, salary); }
    @Override
    double calculateBonus() { return salary * 0.20; }
}

class Developer extends Employee {
    Developer(String name, double salary) { super(name, salary); }
    @Override
    double calculateBonus() { return salary * 0.15; }
}

public class emp_bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.next();
        String name = sc.next();
        double salary = sc.nextDouble();

        Employee e = type.equalsIgnoreCase("M")
                ? new Manager(name, salary)
                : new Developer(name, salary);

        System.out.println(e.getName());
        System.out.printf("%.2f%n", e.calculateBonus());
    }
}