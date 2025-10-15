// 04_Constructors/DefaultConstructorExample.java
// Author: Aayush Raj
// Description: Demonstrates the use of a default constructor in Java.

public class DefaultConstructorExample {
    String name;
    int age;

    // Default constructor — automatically called when no constructor is defined
    public DefaultConstructorExample() {
        name = "Unknown";
        age = 0;
        System.out.println("🧱 Default constructor invoked.");
    }

    void display() {
        System.out.println("👤 Name: " + name);
        System.out.println("🎂 Age: " + age);
    }

    public static void main(String[] args) {
        DefaultConstructorExample person = new DefaultConstructorExample();
        person.display();
    }
}

/*
🖥️ Output (for DefaultConstructorExample.java)
🧱 Default constructor invoked.
👤 Name: Unknown
🎂 Age: 0

🧠 Concept:
A *default constructor* initializes objects with default values.
If you define no constructor, Java automatically provides one.
*/
