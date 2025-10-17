// 06_InstanceOfAndTypeCasting/PrimitiveTypeCastingExample.java
// Author: Aayush Raj
// Description: Demonstrates primitive type casting (widening and narrowing).

public class PrimitiveTypeCastingExample {
    public static void main(String[] args) {
        int num = 100;
        double wide = num; // Widening (automatic)
        System.out.println("🔹 Widening (int → double): " + wide);

        double decimal = 9.99;
        int narrow = (int) decimal; // Narrowing (manual)
        System.out.println("🔸 Narrowing (double → int): " + narrow);
    }
}

/*
🖥️ Output (for PrimitiveTypeCastingExample.java)
🔹 Widening (int → double): 100.0
🔸 Narrowing (double → int): 9

🧠 Concept:
- Widening: smaller → larger data type (automatic)
- Narrowing: larger → smaller data type (explicit cast required)
*/
