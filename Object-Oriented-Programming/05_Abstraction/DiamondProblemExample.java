// 05_Abstraction/DiamondProblemExample.java
// Author: Aayush Raj
// Description: Demonstrates the Diamond Problem in interfaces and its resolution.

interface Father {
    default void show() {
        System.out.println("👨 Father: Guidance and discipline.");
    }
}

interface Mother {
    default void show() {
        System.out.println("👩 Mother: Care and affection.");
    }
}

class Child implements Father, Mother {
    // Must override to resolve ambiguity
    @Override
    public void show() {
        System.out.println("👦 Child inherits both traits:");
        Father.super.show();
        Mother.super.show();
    }
}

public class DiamondProblemExample {
    public static void main(String[] args) {
        Child child = new Child();
        child.show();
    }
}

/*
🧠 Concept:
Java avoids the Diamond Problem by forcing the implementing class to override the conflicting method.
The child class can explicitly choose which interface's default method to call using InterfaceName.super.method().

🖥️ Output:
👦 Child inherits both traits:
👨 Father: Guidance and discipline.
👩 Mother: Care and affection.
*/
