// 02_ThisKeyword/ThisAsMethodArgument.java
// Author: Aayush Raj
// Description: Shows how 'this' can be passed as an argument to another method.

public class ThisAsMethodArgument {

    void greet(ThisAsMethodArgument obj) {
        System.out.println("👋 Hello from method, object received successfully!");
    }

    void callGreet() {
        greet(this); // Passing current object as argument
    }

    public static void main(String[] args) {
        ThisAsMethodArgument example = new ThisAsMethodArgument();
        example.callGreet();
    }
}

/*
🖥️ Output (for ThisAsMethodArgument.java)
👋 Hello from method, object received successfully!

🧠 Concept:
The current object reference can be passed as a parameter to another method or constructor using 'this'.
*/
