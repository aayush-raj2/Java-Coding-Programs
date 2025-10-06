// ControlStatements/SwitchCase.java
// Author: Aayush Raj
// Description: Demonstrates switch-case control structure for simple menu handling.
/*📘 Concepts used:
     -> switch-case control flow
     -> Menu-driven program
     -> Break and default usage */

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        System.out.print("Choose an operation (1–4): ");
        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Result = " + (a + b));
                break;
            case 2:
                System.out.println("Result = " + (a - b));
                break;
            case 3:
                System.out.println("Result = " + (a * b));
                break;
            case 4:
                System.out.println("Result = " + (a / b));
                break;
            default:
                System.out.println("Invalid choice ❌");
        }
        sc.close();
    }
}

/*Output:
1. Addition
2. Subtraction
3. Multiplication
4. Division
Choose an operation (1–4): 3
Enter first number: 5
Enter second number: 4
Result = 20.0 */
