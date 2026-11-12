import java.util.Scanner;

class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public void display() {
        if (this.price < 0) {
            System.out.println("Invalid Price");
        } else {
            System.out.printf("%s %s %.2f%n", this.productId, this.name, this.price);
        }
    }
}

public class const_this_keyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNext()) return;
        String id = sc.next();
        String name = sc.next();
        double price = sc.nextDouble();

        Product product = new Product(id, name, price);
        product.display();
    }
}