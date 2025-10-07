// Functions/RecursionExample.java
// Author: Aayush Raj
// Description: Demonstrates recursion with factorial calculation.
/*📘 Concepts used:
    -> Recursive function
    -> Base condition
    -> Stack-based execution */

import java.util.Scanner;

public class RecursionExample {
    static long factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Factorial of " + num + " = " + factorial(num));
        sc.close();
    }
}
/* 💻 Example Run:
   Enter a number: 5

   🖥️ Output:
   Factorial of 5 = 120

   📘 Explanation:
      -> Recursive function calls itself:
      -> factorial(5)
         = 5 * factorial(4)
         = 5 * 4 * 3 * 2 * 1
         = 120
      -> Base condition (if (n == 0 || n == 1) return 1;) prevents infinite recursion. */
