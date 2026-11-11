
import java.util.Scanner;

public class ShapeArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ch = sc.nextInt();
        double area;

        switch (ch) {
            case 1:
                double r = sc.nextDouble();
                area = 3.14 * r * r;
                System.out.printf("%.2f", area);
                break;

            case 2:
                double l = sc.nextDouble();
                double b = sc.nextDouble();
                area = l * b;
                System.out.printf("%.2f", area);
                break;

            case 3:
                double base = sc.nextDouble();
                double h = sc.nextDouble();
                area = 0.5 * base * h;
                System.out.printf("%.2f", area);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
