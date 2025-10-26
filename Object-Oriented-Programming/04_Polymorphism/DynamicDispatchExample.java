// 12_Polymorphism/DynamicDispatchExample.java
// Author: Aayush Raj
// Description: Demonstrates dynamic method dispatch mechanism in Java.

class Vehicle {
    public void run() {
        System.out.println("🚘 Vehicle is running");
    }
}

class Car extends Vehicle {
    @Override
    public void run() {
        System.out.println("🚗 Car is running safely");
    }
}

class Bike extends Vehicle {
    @Override
    public void run() {
        System.out.println("🏍️ Bike is running fast");
    }
}

public class DynamicDispatchExample {
    public static void main(String[] args) {
        Vehicle v;

        v = new Car();  // upcasting
        v.run();

        v = new Bike(); // upcasting
        v.run();
    }
}

/*
🖥️ Output:
🚗 Car is running safely
🏍️ Bike is running fast
*/
