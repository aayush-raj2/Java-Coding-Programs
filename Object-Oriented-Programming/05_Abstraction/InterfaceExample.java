// 05_Abstraction/InterfaceExample.java
// Author: Aayush Raj
// Description: Demonstrates abstraction using interfaces in Java.

interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("🚗 Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("🅿️ Car is stopping...");
    }
}

class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("🏍️ Bike is starting...");
    }

    @Override
    public void stop() {
        System.out.println("🛑 Bike is stopping...");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.start();
        car.stop();

        bike.start();
        bike.stop();
    }
}

/*
🖥️ Output:
🚗 Car is starting...
🅿️ Car is stopping...
🏍️ Bike is starting...
🛑 Bike is stopping...
*/
