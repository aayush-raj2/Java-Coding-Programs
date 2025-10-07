// Functions/MethodOverloading.java
// Author: Aayush Raj
// Description: Demonstrates method overloading with different parameter types.
/*📘 Concepts used:
     -> Method overloading
     -> Compile-time polymorphism
     ->Same method name, different parameter types */

public class MethodOverloading {

    // method 1
    static int add(int a, int b) {
        return a + b;
    }

    // method 2
    static double add(double a, double b) {
        return a + b;
    }

    // method 3
    static String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Sum (int): " + add(5, 7));
        System.out.println("Sum (double): " + add(4.5, 6.3));
        System.out.println("Sum (string): " + add("Hello ", "World"));
    }
}
/*🖥️ Output:
     Sum (int): 12
     Sum (double): 10.8
     Sum (string): Hello World

  📘 Explanation:
      Java calls the correct method based on parameter type:
      int → add(int, int)
      double → add(double, double)
      String → add(String, String) */
