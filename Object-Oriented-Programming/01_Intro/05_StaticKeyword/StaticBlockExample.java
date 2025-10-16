// 05_StaticKeyword/StaticBlockExample.java
// Author: Aayush Raj
// Description: Demonstrates static blocks in Java (runs once before main).

public class StaticBlockExample {
    static int counter;

    // Static block executes before main() and only once
    static {
        counter = 100;
        System.out.println("🧩 Static block executed. Counter initialized to " + counter);
    }

    StaticBlockExample() {
        counter++;
        System.out.println("➡️ New object created. Counter: " + counter);
    }

    public static void main(String[] args) {
        System.out.println("🏁 Main method starts.");

        StaticBlockExample obj1 = new StaticBlockExample();
        StaticBlockExample obj2 = new StaticBlockExample();

        System.out.println("🔢 Final Counter: " + counter);
    }
}

/*
🖥️ Output (for StaticBlockExample.java)
🧩 Static block executed. Counter initialized to 100
🏁 Main method starts.
➡️ New object created. Counter: 101
➡️ New object created. Counter: 102
🔢 Final Counter: 102

🧠 Concept:
- Static blocks execute once when the class is loaded.
- Used for class-level initialization (e.g., DB connections, constants).
*/
