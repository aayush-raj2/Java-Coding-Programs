// 03_Inheritance/PolymorphismWithInheritance.java
// Author: Aayush Raj
// Description: Demonstrates polymorphism using inheritance.

class Animal {
    void sound() {
        System.out.println("🐾 Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("🐶 Dog barks");
    }
}

public class PolymorphismWithInheritance {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();

        myAnimal.sound();
        myDog.sound();
    }
}

/*
🖥️ Output:
🐾 Animal makes a sound
🐶 Dog barks
*/
