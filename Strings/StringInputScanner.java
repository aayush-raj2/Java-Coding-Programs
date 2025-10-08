// Strings/StringInputScanner.java
// Author: Aayush Raj
// Description: Takes string input from the user using Scanner class.

import java.util.Scanner;

public class StringInputScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String name = sc.nextLine();

        System.out.print("Enter your favorite programming language: ");
        String lang = sc.nextLine();

        System.out.println("\nHello, " + name + "!");
        System.out.println("You love coding in " + lang + ".");

        sc.close();
    }
}
/*
🖥️ Output:

Enter your full name: Aayush Raj
Enter your favorite programming language: Java

Hello, Aayush Raj!
You love coding in Java.
*/
