// 10_Encapsulation/JavaBeanExample.java
// Author: Aayush Raj
// Description: Demonstrates JavaBeans standards for encapsulation.

class Student {
    private String name;
    private int rollNo;
    private double marks;

    // Default constructor (required for JavaBeans)
    public Student() {}

    // Getters and Setters (required for JavaBeans)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public double getMarks() {
        return marks;
    }
    public void setMarks(double marks) {
        this.marks = marks;
    }
}

public class JavaBeanExample {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Aayush Raj");
        s.setRollNo(101);
        s.setMarks(92.5);

        System.out.println("🎓 Student Details:");
        System.out.println("👤 Name: " + s.getName());
        System.out.println("🆔 Roll No: " + s.getRollNo());
        System.out.println("📊 Marks: " + s.getMarks());
    }
}

/*
🖥️ Output (for JavaBeanExample.java)
🎓 Student Details:
👤 Name: Aayush Raj
🆔 Roll No: 101
📊 Marks: 92.5

🧠 Concept:
A JavaBean is a reusable software component that follows conventions:
1. Must have a public no-arg constructor.
2. All fields private.
3. Getters and Setters for access.
*/
