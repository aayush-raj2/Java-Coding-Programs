// 04_Polymorphism/CompileTimePolymorphismDemo.java
// Author: Aayush Raj
// Description: Demonstrates compile-time polymorphism using method overloading.

class Printer {

    // Print integer
    public void print(int num) {
        System.out.println("🧮 Printing Integer: " + num);
    }

    // Print double
    public void print(double num) {
        System.out.println("📏 Printing Double: " + num);
    }

    // Print string
    public void print(String text) {
        System.out.println("📝 Printing String: " + text);
    }

    // Print boolean
    public void print(boolean flag) {
        System.out.println("🔘 Printing Boolean: " + flag);
    }
}

public class CompileTimePolymorphismDemo {
    public static void main(String[] args) {
        Printer p = new Printer();

        p.print(100);
        p.print(99.99);
        p.print("Hello World");
        p.print(true);
    }
}

/*
🖥️ Output:
🧮 Printing Integer: 100
📏 Printing Double: 99.99
📝 Printing String: Hello World
🔘 Printing Boolean: true
*/
