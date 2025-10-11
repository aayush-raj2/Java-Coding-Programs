// 01_ClassesAndObjects/ObjectDemo.java
// Author: Aayush Raj
// Description: Demonstrates creating and using objects from a defined class.

public class ObjectDemo {
    public static void main(String[] args) {
        // Creating objects (instances) from ClassExample
        ClassExample device1 = new ClassExample("Apple", "iPhone 15");
        ClassExample device2 = new ClassExample("Samsung", "Galaxy S24");

        // Display object data
        device1.showDetails();
        System.out.println();
        device2.showDetails();
    }
}

/*
🖥️ Output (for ObjectDemo)
📱 Device Info:
Brand: Apple
Model: iPhone 15
Battery: 100%

📱 Device Info:
Brand: Samsung
Model: Galaxy S24
Battery: 100%


🧠 Concept:
Objects are real instances of a class.
Each object has its own copy of class variables.
*/
