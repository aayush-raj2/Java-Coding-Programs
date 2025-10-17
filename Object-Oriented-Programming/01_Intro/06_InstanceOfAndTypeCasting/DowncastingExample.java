// 06_InstanceOfAndTypeCasting/DowncastingExample.java
// Author: Aayush Raj
// Description: Demonstrates downcasting with instanceof safety check.

class Shape {
    void draw() {
        System.out.println("🎨 Drawing a shape...");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("⚪ Calculating circle area...");
    }
}

public class DowncastingExample {
    public static void main(String[] args) {
        Shape shape = new Circle(); // Upcasting
        shape.draw();

        // Safe downcasting using instanceof
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape; // Downcasting
            circle.area();
        } else {
            System.out.println("❌ Downcasting not safe.");
        }
    }
}

/*
🖥️ Output (for DowncastingExample.java)
🎨 Drawing a shape...
⚪ Calculating circle area...

🧠 Concept:
- Downcasting: Converting parent reference back to child type.
- Must be checked with 'instanceof' to avoid ClassCastException.
*/
