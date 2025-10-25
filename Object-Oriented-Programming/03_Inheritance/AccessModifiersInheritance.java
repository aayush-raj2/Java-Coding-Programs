// 03_Inheritance/AccessModifiersInheritance.java
// Author: Aayush Raj
// Description: Demonstrates visibility of members across inherited classes.

class Animal {
    public String name = "Rocky";
    protected int age = 3;
    private String breed = "German Shepherd";

    void show() {
        System.out.println("🐕 Private breed inside Animal: " + breed);
    }
}

class Dog extends Animal {
    void printDetails() {
        System.out.println("👤 Name: " + name); // public - accessible
        System.out.println("🎂 Age: " + age);   // protected - accessible
        // System.out.println("🐾 Breed: " + breed); // ❌ private - not accessible
    }
}

public class AccessModifiersInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printDetails();
    }
}

/*
🖥️ Output:
👤 Name: Rocky
🎂 Age: 3
*/
