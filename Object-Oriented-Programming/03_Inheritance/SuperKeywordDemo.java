// 11_Inheritance/SuperKeywordDemo.java
// Author: Aayush Raj
// Description: Demonstrates the use of 'extends' and 'super' in Java inheritance.

class Vehicle {
    String brand = "Generic Vehicle";

    Vehicle() {
        System.out.println("🚀 Vehicle Constructor Called");
    }

    void displayBrand() {
        System.out.println("🏷️ Brand: " + brand);
    }
}

class Car extends Vehicle {
    String brand = "Car Brand";

    Car() {
        super(); // Calls Vehicle constructor
        System.out.println("🚗 Car Constructor Called");
    }

    void displayBrand() {
        super.displayBrand(); // Access parent class method
        System.out.println("🚘 Brand in Car: " + brand);
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.displayBrand();
    }
}

/*
🖥️ Output:
🚀 Vehicle Constructor Called
🚗 Car Constructor Called
🏷️ Brand: Generic Vehicle
🚘 Brand in Car: Car Brand
*/
