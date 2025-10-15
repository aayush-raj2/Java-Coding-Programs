// 04_Constructors/CopyConstructorExample.java
// Author: Aayush Raj
// Description: Demonstrates a copy constructor (manual version in Java).

public class CopyConstructorExample {
    String studentName;
    int rollNumber;

    // Parameterized constructor
    public CopyConstructorExample(String studentName, int rollNumber) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
    }

    // Copy constructor - copies data from another object
    public CopyConstructorExample(CopyConstructorExample obj) {
        this.studentName = obj.studentName;
        this.rollNumber = obj.rollNumber;
    }

    void display() {
        System.out.println("🎓 Student: " + studentName + ", Roll No: " + rollNumber);
    }

    public static void main(String[] args) {
        CopyConstructorExample s1 = new CopyConstructorExample("Aayush", 101);
        CopyConstructorExample s2 = new CopyConstructorExample(s1); // copying s1 into s2

        s1.display();
        s2.display();
    }
}

/*
🖥️ Output (for CopyConstructorExample.java)
🎓 Student: Aayush, Roll No: 101
🎓 Student: Aayush, Roll No: 101

🧠 Concept:
A *copy constructor* creates a new object by copying data from another existing object.
Java doesn’t provide it by default; it’s implemented manually.
*/
