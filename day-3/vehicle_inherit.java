//vehicle inheritance
import java.util.Scanner;

class Vehicle {
    protected String brand;
    protected int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}

class Car extends Vehicle {
    private String fuelType;

    Car(String brand, int speed, String fuelType) {
        super(brand, speed);
        this.fuelType = fuelType;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Fuel: " + fuelType);
    }
}

public class vehicle_inherit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String brand = sc.next();
        int speed = sc.nextInt();
        String fuel = sc.next();
        new Car(brand, speed, fuel).display();
    }
}