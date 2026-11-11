
import java.util.Scanner;

public class calculator {

    
    static int calculate(int a, int b) {
        return a + b;
    }

    
    static int calculate(int a, int b, int c) {
        return a + b + c;
    }

    
    static double calculate(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();

        if (choice == 1) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(calculate(a, b));
        }
        else if (choice == 2) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            System.out.println(calculate(a, b, c));
        }
        else if (choice == 3) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            System.out.println(calculate(a, b));
        }

        sc.close();
    }
}
