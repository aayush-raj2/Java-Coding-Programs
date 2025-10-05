// Basics/InputOutput.java
// Author: Aayush Raj
// Description: Demonstrates how to take input from the user and display formatted output.
/* 📘 Concepts used:
     -> Using Scanner for user input
     -> printf() formatting
     -> Mixing strings, integers, and doubles */

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your marks (out of 100): ");
        double marks = sc.nextDouble();

        System.out.printf("\n👋 Hello %s!\n", name);
        System.out.printf("You are %d years old and scored %.2f marks.\n", age, marks);

        sc.close();
    }
}
/* 🖥️ Sample Output:
    Enter your name: Aayush
    Enter your age: 19
    Enter your marks (out of 100): 95.75

    👋 Hello Aayush!
    You are 19 years old and scored 95.75 marks.
  */
