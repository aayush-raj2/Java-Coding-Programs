// 01_ClassesAndObjects/ClassExample.java
// Author: Aayush Raj
// Description: Demonstrates defining a class in Java – the blueprint for objects.

public class ClassExample {
    // ========== PROPERTIES ==========
    String brand;
    String model;
    int batteryLevel;

    // ========== CONSTRUCTOR ==========
    public ClassExample(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.batteryLevel = 100;
    }

    // ========== METHOD ==========
    public void showDetails() {
        System.out.println("📱 Device Info:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Battery: " + batteryLevel + "%");
    }
}

/*
🧠 Concept:
A *class* defines the structure and behavior of future objects.
It doesn’t do anything by itself — it’s like a blueprint.

🧪 Output (for ClassExample)
# No direct output — this file defines a class (blueprint).
# To see results, use it in ObjectDemo.java.
*/
