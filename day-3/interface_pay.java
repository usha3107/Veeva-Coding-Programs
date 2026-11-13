//interface based payment
import java.util.Scanner;

interface Payment {
    double pay(double amount);
}

class CardPayment implements Payment {
    public double pay(double amount) { return amount + amount * 0.02; }
}

class UpiPayment implements Payment {
    public double pay(double amount) { return amount; }
}

public class interface_pay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.next();
        double amount = sc.nextDouble();

        Payment p = type.equalsIgnoreCase("C") ? new CardPayment() : new UpiPayment();
        System.out.printf("%.2f%n", p.pay(amount));
    }
}