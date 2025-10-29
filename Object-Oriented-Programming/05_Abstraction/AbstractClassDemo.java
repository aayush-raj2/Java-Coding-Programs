// 05_Abstraction/AbstractClassDemo.java
// Author: Aayush Raj
// Description: Demonstrates abstraction using abstract class and method.

abstract class Bike {
    Bike() {
        System.out.println("🏍️ Bike is created.");
    }

    // Abstract method
    abstract void run();

    // Non-abstract method
    void changeGear() {
        System.out.println("⚙️ Gear changed.");
    }
}

class Honda extends Bike {
    @Override
    void run() {
        System.out.println("🛞 Honda bike is running safely...");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Bike bike = new Honda(); // upcasting
        bike.run();
        bike.changeGear();
    }
}

/*
🖥️ Output:
🏍️ Bike is created.
🛞 Honda bike is running safely...
⚙️ Gear changed.
*/
