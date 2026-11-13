//order processing with strategy interface
import java.util.Scanner;

interface DiscountStrategy {
    double apply(double amount);
}

class RegularDiscount implements DiscountStrategy {
    public double apply(double amount) { return amount - amount * 0.05; }
}

class PremiumDiscount implements DiscountStrategy {
    public double apply(double amount) { return amount - amount * 0.15; }
}

public class order_process {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.next();
        double amount = sc.nextDouble();

        if (amount < 0) {
            System.out.println("Invalid Amount");
            return;
        }

        DiscountStrategy d = type.equalsIgnoreCase("P") ? new PremiumDiscount() : new RegularDiscount();
        System.out.printf("%.2f%n", d.apply(amount));
    }
}