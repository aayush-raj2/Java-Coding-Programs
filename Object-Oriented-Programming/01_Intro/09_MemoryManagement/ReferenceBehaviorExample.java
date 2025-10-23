// 09_MemoryManagement/ReferenceBehaviorExample.java
// Author: Aayush Raj
// Description: Demonstrates how reference variables affect object memory in Java.

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("🎓 Student: " + name);
    }
}

public class ReferenceBehaviorExample {
    public static void main(String[] args) {
        Student s1 = new Student("Aayush");
        Student s2 = s1; // Both refer to same object

        s1.display();
        s2.display();

        System.out.println("\n🔗 Changing via one reference...");
        s2.name = "Riddhima";

        s1.display();
        s2.display();

        System.out.println("\n❌ Nullifying one reference...");
        s1 = null;

        System.out.println("s2 still refers to object:");
        s2.display();
    }
}

/*
🖥️ Output:
🎓 Student: Aayush
🎓 Student: Aayush

🔗 Changing via one reference...
🎓 Student: Riddhima
🎓 Student: Riddhima

❌ Nullifying one reference...
s2 still refers to object:
🎓 Student: Riddhima
*/
