import java.util.Scanner;

public class discount_logic {
    public static double calculateFinalAmount(double amount) {
        if (amount >= 5000) {
            return amount * 0.90;
        } else if (amount >= 2000) {
            return amount * 0.95;
        } else {
            return amount;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextDouble()) return;
        double amount = sc.nextDouble();
        System.out.printf("%.2f%n", calculateFinalAmount(amount));
    }
}