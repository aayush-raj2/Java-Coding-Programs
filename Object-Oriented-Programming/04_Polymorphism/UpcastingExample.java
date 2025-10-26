// 12_Polymorphism/UpcastingExample.java
// Author: Aayush Raj
// Description: Demonstrates upcasting in Java (safe implicit conversion).

class Animal {
    public void sound() {
        System.out.println("🐾 Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("🐶 Dog barks");
    }

    public void fetch() {
        System.out.println("🎾 Dog fetches the ball");
    }
}

public class UpcastingExample {
    public static void main(String[] args) {
        // Upcasting: Dog object → Animal reference
        Animal a = new Dog();

        a.sound();   // Allowed (overridden)
        // a.fetch(); // ❌ Not accessible (parent reference)
    }
}

/*
🖥️ Output:
🐶 Dog barks
*/
