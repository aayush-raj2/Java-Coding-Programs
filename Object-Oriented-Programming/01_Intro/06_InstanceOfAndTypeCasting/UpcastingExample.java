// 06_InstanceOfAndTypeCasting/UpcastingExample.java
// Author: Aayush Raj
// Description: Demonstrates upcasting (child object referenced by parent type).

class Vehicle {
    void start() {
        System.out.println("🚗 Vehicle started.");
    }
}

class Bike extends Vehicle {
    void ride() {
        System.out.println("🏍️ Riding the bike...");
    }
}

public class UpcastingExample {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Vehicle vehicle = bike; // Upcasting

        vehicle.start(); // Allowed
        // vehicle.ride(); ❌ Not accessible (specific to Bike)

        System.out.println("\n✅ Upcasting allows general behavior but hides child-specific features.");
    }
}

/*
🖥️ Output (for UpcastingExample.java)
🚗 Vehicle started.

✅ Upcasting allows general behavior but hides child-specific features.

🧠 Concept:
- Upcasting: Assigning child object to parent reference.
- Safe and automatic in Java.
- Only parent class methods are accessible.
*/
