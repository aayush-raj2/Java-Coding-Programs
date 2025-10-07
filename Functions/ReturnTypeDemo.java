// Functions/ReturnTypeDemo.java
// Author: Aayush Raj
// Description: Shows how functions can return different data types.
/*📘 Concepts used:
  -> Methods with return values
  -> Multiple return types (int, String, boolean) */

public class ReturnTypeDemo {

    static int getSquare(int n) {
        return n * n;
    }

    static String greet(String name) {
        return "Hello, " + name + "! 👋";
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println("Square of 5 = " + getSquare(5));
        System.out.println(greet("Aayush"));
        System.out.println("Is 10 even? " + isEven(10));
    }
}
/* 🖥️ Output:
   Square of 5 = 25
   Hello, Aayush! 👋
   Is 10 even? true

  📘 Explanation:
     -> getSquare(5) → returns integer 25
     -> greet("Aayush") → returns formatted string greeting
     -> isEven(10) → returns boolean true */
