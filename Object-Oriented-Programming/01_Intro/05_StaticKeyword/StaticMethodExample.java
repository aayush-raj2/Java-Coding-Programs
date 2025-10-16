// 05_StaticKeyword/StaticMethodExample.java
// Author: Aayush Raj
// Description: Demonstrates static methods that can be called without objects.

public class StaticMethodExample {
    int a = 10;
    static int b = 20;

    // Static method
    static void showStatic() {
        System.out.println("📘 Inside static method");
        System.out.println("Static variable b = " + b);
        // System.out.println(a); // ❌ Not allowed: cannot access instance variable directly
    }

    // Non-static method
    void showInstance() {
        System.out.println("📗 Inside instance method");
        System.out.println("Instance variable a = " + a);
        System.out.println("Static variable b = " + b);
    }

    public static void main(String[] args) {
        // Calling static method directly (no object required)
        StaticMethodExample.showStatic();

        // Creating object to call instance method
        StaticMethodExample obj = new StaticMethodExample();
        obj.showInstance();
    }
}

/*
🖥️ Output (for StaticMethodExample.java)
📘 Inside static method
Static variable b = 20
📗 Inside instance method
Instance variable a = 10
Static variable b = 20

🧠 Concept:
- static methods belong to the class, not to any object.
- Can be called using class name directly.
- Cannot access non-static (instance) members directly.
*/
