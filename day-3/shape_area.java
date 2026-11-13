//shape area using runtime polymorphism
import java.util.Scanner;

abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    private double radius;
    Circle(double radius) { this.radius = radius; }
    double area() { return 3.14 * radius * radius; }
}

class Rectangle extends Shape {
    private double length, width;
    Rectangle(double length, double width) { this.length = length; this.width = width; }
    double area() { return length * width; }
}

public class shape_area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.next();
        Shape s;
        if (type.equalsIgnoreCase("C")) {
            s = new Circle(sc.nextDouble());
        } else {
            double l = sc.nextDouble();
            double w = sc.nextDouble();
            s = new Rectangle(l, w);
        }
        System.out.printf("%.2f%n", s.area());
    }
}