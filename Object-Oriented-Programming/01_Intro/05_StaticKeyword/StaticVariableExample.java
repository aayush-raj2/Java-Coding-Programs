// 05_StaticKeyword/StaticVariableExample.java
// Author: Aayush Raj
// Description: Demonstrates static variables shared across all objects.

public class StaticVariableExample {
    String studentName;
    static String collegeName = "IIT Delhi"; // Shared by all objects

    StaticVariableExample(String studentName) {
        this.studentName = studentName;
    }

    void display() {
        System.out.println("🎓 Student: " + studentName + " | 🏫 College: " + collegeName);
    }

    public static void main(String[] args) {
        StaticVariableExample s1 = new StaticVariableExample("Aayush");
        StaticVariableExample s2 = new StaticVariableExample("Rancho");

        s1.display();
        s2.display();

        // Changing college name for all
        StaticVariableExample.collegeName = "IIT Bombay";

        System.out.println("\nAfter changing college name:");
        s1.display();
        s2.display();
    }
}

/*
🖥️ Output (for StaticVariableExample.java)
🎓 Student: Aayush | 🏫 College: IIT Delhi
🎓 Student: Rancho | 🏫 College: IIT Delhi

After changing college name:
🎓 Student: Aayush | 🏫 College: IIT Bombay
🎓 Student: Rancho | 🏫 College: IIT Bombay

🧠 Concept:
- static variables belong to the class, not individual objects.
- All objects share the same copy.
- Useful for shared data like college name, company name, etc.
*/
