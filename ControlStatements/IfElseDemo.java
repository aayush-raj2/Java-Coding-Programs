// ControlStatements/IfElseDemo.java
// Author: Aayush Raj
// Description: Demonstrates decision-making using if, else if, and else statements.
/*📘 Concepts used:
     -> Nested if–else
     -> Relational operators
     -> Decision making based on conditions */

import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks (0–100): ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Grade: A+ 🎯");
        } else if (marks >= 75) {
            System.out.println("Grade: A");
        } else if (marks >= 60) {
            System.out.println("Grade: B");
        } else if (marks >= 40) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail ❌");
        }
        sc.close();
    }
}
/*🖥️ Output:
     Enter your marks (0–100): 82
     Grade: A */
