// 04_Constructors/ParameterizedConstructorExample.java
// Author: Aayush Raj
// Description: Demonstrates a parameterized constructor for initializing object values.

public class ParameterizedConstructorExample {
    String courseName;
    int duration;

    // Parameterized constructor
    public ParameterizedConstructorExample(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void display() {
        System.out.println("📚 Course: " + courseName);
        System.out.println("⏱️ Duration: " + duration + " months");
    }

    public static void main(String[] args) {
        ParameterizedConstructorExample javaCourse = new ParameterizedConstructorExample("Java Programming", 6);
        javaCourse.display();
    }
}

/*
🖥️ Output (for ParameterizedConstructorExample.java)
📚 Course: Java Programming
⏱️ Duration: 6 months

🧠 Concept:
A *parameterized constructor* allows passing custom values when creating an object.
It helps initialize object data directly.
*/
