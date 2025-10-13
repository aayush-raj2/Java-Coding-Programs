// 03_FinalKeyword/FinalClassExample.java
// Author: Aayush Raj
// Description: Demonstrates a final class that cannot be inherited.

final class Utility {
    void displayMessage() {
        System.out.println("🔒 This is a final class — cannot be extended.");
    }
}

// ❌ The below code would cause an error if uncommented
// class SubUtility extends Utility { }

public class FinalClassExample {
    public static void main(String[] args) {
        Utility util = new Utility();
        util.displayMessage();
    }
}

/*
🖥️ Output (for FinalClassExample.java)
🔒 This is a final class — cannot be extended.

🧠 Concept:
- A 'final' class cannot be extended (no inheritance allowed).
- Useful for security, immutability, or API design (e.g., String class in Java).
*/
