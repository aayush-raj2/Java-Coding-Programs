// 07_BenefitsOfOOP/ReusabilityExample.java
// Author: Aayush Raj
// Description: Demonstrates reusability through inheritance and composition.

class Vehicle {
    protected String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void start() {
        System.out.println("🚗 " + brand + " vehicle started.");
    }
}

// Reusing Vehicle class through inheritance
class Car extends Vehicle {
    private int doors;

    Car(String brand, int doors) {
        super(brand);
        this.doors = doors;
    }

    void showCarInfo() {
        System.out.println("🚙 Car Brand: " + brand + " | Doors: " + doors);
    }
}

public class ReusabilityExample {
    public static void main(String[] args) {
        Car car1 = new Car("Tesla", 4);
        car1.start(); // Inherited method
        car1.showCarInfo(); // Child-specific method
    }
}

/*
🖥️ Output (for ReusabilityExample.java)
🚗 Tesla vehicle started.
🚙 Car Brand: Tesla | Doors: 4

🧠 Concept:
- Reusability allows existing code to be reused via inheritance or composition.
- Reduces redundancy, improves maintainability, and saves time.
*/
