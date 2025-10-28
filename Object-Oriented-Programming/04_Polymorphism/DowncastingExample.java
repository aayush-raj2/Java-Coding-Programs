// 12_Polymorphism/DowncastingExample.java
// Author: Aayush Raj
// Description: Demonstrates downcasting in Java with instanceof safety check.

class Vehicle {
    public void start() {
        System.out.println("🚘 Vehicle is starting...");
    }
}

class Car extends Vehicle {
    public void openRoof() {
        System.out.println("🌤️ Car’s sunroof is opened!");
    }
}

public class DowncastingExample {
    public static void main(String[] args) {
        Vehicle v = new Car(); // Upcasting
        v.start();

        // Safe downcasting using instanceof
        if (v instanceof Car) {
            Car c = (Car) v;
            c.start();
            c.openRoof();
        }
    }
}

/*
🖥️ Output:
🚘 Vehicle is starting...
🚘 Vehicle is starting...
🌤️ Car’s sunroof is opened!
*/
