// ControlStatements/ForLoopDemo.java
// Author: Aayush Raj
// Description: Demonstrates the use of for loops with sum calculation and pattern printing.
/*📘 Concepts used:
    -> For loops
    -> Nested loops
    -> Summation and pattern generation */

public class ForLoopDemo {
    public static void main(String[] args) {
        int sum = 0;

        System.out.println("Numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nSum = " + sum);

        // Pattern printing
        System.out.println("\nTriangle Pattern:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/*🖥️ Output (partial):
     Numbers from 1 to 10:
     1 2 3 4 5 6 7 8 9 10 
     Sum = 55

     Triangle Pattern:
     *
     * *
     * * *
     * * * *
     * * * * *
*/
