// 03_FinalKeyword/FinalMethodExample.java
// Author: Aayush Raj
// Description: Demonstrates the use of a final method to prevent overriding.

class Vehicle {
    final void startEngine() {
        System.out.println("🚗 Engine started - standard procedure.");
    }
}

class Car extends Vehicle {
    // ❌ Attempting to override final method would cause a compile-time error
    // void startEngine() { System.out.println("Custom start!"); }
    
    void display() {
        System.out.println("🚙 Car ready to drive!");
    }
}

public class FinalMethodExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine(); // inherited from Vehicle
        car.display();
    }
}

/*
🖥️ Output (for FinalMethodExample.java)
🚗 Engine started - standard procedure.
🚙 Car ready to drive!

🧠 Concept:
- A 'final' method cannot be overridden in subclasses.
- Ensures consistent behavior across all child classes.
*/
