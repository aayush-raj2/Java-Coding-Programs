// 02_ThisKeyword/ThisKeywordExample.java
// Author: Aayush Raj
// Description: Demonstrates the use of 'this' keyword to distinguish between instance variables and parameters.

public class ThisKeywordExample {
    String name;
    int age;

    // Constructor using 'this' to resolve variable shadowing
    public ThisKeywordExample(String name, int age) {
        this.name = name; // 'this.name' refers to the instance variable
        this.age = age;
    }

    // Method to display data
    public void display() {
        System.out.println("👤 Name: " + name);
        System.out.println("🎂 Age: " + age);
    }

    public static void main(String[] args) {
        ThisKeywordExample person1 = new ThisKeywordExample("Aayush", 21);
        person1.display();
    }
}

/*
🖥️ Output (for ThisKeywordExample.java)
👤 Name: Aayush
🎂 Age: 21

🧠 Concept:
The 'this' keyword refers to the current object.
It helps differentiate between instance variables and local parameters with the same name.
*/
