// 05_Abstraction/SerializableAndCloneableDemo.java
// Author: Aayush Raj
// Description: Demonstrates built-in marker interfaces - Serializable & Cloneable.

import java.io.Serializable;

class Student implements Serializable, Cloneable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class SerializableAndCloneableDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student(101, "Aayush");
        Student s2 = (Student) s1.clone();

        System.out.println("🎓 Original Student: " + s1.name + " | ID: " + s1.id);
        System.out.println("📋 Cloned Student: " + s2.name + " | ID: " + s2.id);
    }
}

/*
🖥️ Output:
🎓 Original Student: Aayush | ID: 101
📋 Cloned Student: Aayush | ID: 101
*/
