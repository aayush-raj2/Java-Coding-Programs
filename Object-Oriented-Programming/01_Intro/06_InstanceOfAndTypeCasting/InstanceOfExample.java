// 06_InstanceOfAndTypeCasting/InstanceOfExample.java
// Author: Aayush Raj
// Description: Demonstrates the use of 'instanceof' operator in Java.

class Animal {
    void eat() {
        System.out.println("🐾 Animal is eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("🐶 Dog is barking...");
    }
}

public class InstanceOfExample {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Upcasting
        System.out.println("🔍 Checking object type using instanceof:");

        System.out.println("animal instanceof Animal ➤ " + (animal instanceof Animal));
        System.out.println("animal instanceof Dog ➤ " + (animal instanceof Dog));
        System.out.println("animal instanceof Object ➤ " + (animal instanceof Object));
    }
}

/*
🖥️ Output (for InstanceOfExample.java)
🔍 Checking object type using instanceof:
animal instanceof Animal ➤ true
animal instanceof Dog ➤ true
animal instanceof Object ➤ true

🧠 Concept:
- 'instanceof' checks the runtime type of an object.
- Returns true if the object is an instance of that class or subclass.
*/
