// Strings/StringExceptionDemo.java
// Author: Aayush Raj
// Description: Handles exceptions when reading string data from files.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringExceptionDemo {
    public static void main(String[] args) {
        try {
            File file = new File("data.txt");
            Scanner sc = new Scanner(file);
            System.out.println("File content: " + sc.nextLine());
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("⚠️ File not found! Please ensure 'data.txt' exists.");
        } finally {
            System.out.println("Program ended gracefully.");
        }
    }
}
/*
🖥️ Output:

⚠️ File not found! Please ensure 'data.txt' exists.
Program ended gracefully.
*/
