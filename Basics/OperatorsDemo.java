// Basics/OperatorsDemo.java
// Author: Aayush Raj
// Description: Demonstrates arithmetic, relational, and logical operators in Java.
/*📘 Concepts used:
    -> Arithmetic, relational & logical operators
    -> Operator precedence and evaluation
    -> Printing expressions */

public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // Arithmetic operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational operators
        System.out.println("a > b: " + (a > b));
        System.out.println("a == b: " + (a == b));

        // Logical operators
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
    }
}

/*Output:
Addition: 15
Subtraction: 5
Multiplication: 50
Division: 2
Modulus: 0
a > b: true
a == b: false
x && y: false
x || y: true
!x: false
*/
