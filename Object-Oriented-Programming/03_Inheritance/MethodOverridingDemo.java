// 03_Inheritance/MethodOverridingDemo.java
// Author: Aayush Raj
// Description: Demonstrates method overriding and dynamic method dispatch.

class Vehicle {
    void start() {
        System.out.println("🚗 Vehicle starts...");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("🚘 Car starts with key ignition...");
    }
}

class ElectricCar extends Car {
    @Override
    void start() {
        System.out.println("🔋 Electric Car starts silently with button...");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Car();
        Vehicle v3 = new ElectricCar();

        v1.start(); // Vehicle version
        v2.start(); // Car version
        v3.start(); // ElectricCar version
    }
}

/*
🖥️ Output:
🚗 Vehicle starts...
🚘 Car starts with key ignition...
🔋 Electric Car starts silently with button...
*/
