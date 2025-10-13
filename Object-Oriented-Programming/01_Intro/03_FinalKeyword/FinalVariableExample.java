// 03_FinalKeyword/FinalVariableExample.java
// Author: Aayush Raj
// Description: Demonstrates the use of final variables in Java.

public class FinalVariableExample {
    // final variable - constant
    final double PI = 3.14159;

    public void showArea(double radius) {
        double area = PI * radius * radius;
        System.out.println("⚪ Radius: " + radius);
        System.out.println("🧮 Area of Circle: " + area);
    }

    public static void main(String[] args) {
        FinalVariableExample circle = new FinalVariableExample();
        circle.showArea(5.0);
    }
}

/*
🖥️ Output (for FinalVariableExample.java)
⚪ Radius: 5.0
🧮 Area of Circle: 78.53975

🧠 Concept:
- 'final' variables act as constants.
- Once assigned, their values cannot be changed.
- Usually written in uppercase (e.g., FINAL_VALUE) for clarity.
*/
