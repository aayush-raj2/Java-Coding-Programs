// Strings/StringMethodsDemo.java
// Author: Aayush Raj
// Description: Demonstrates strings as method parameters and return values.

public class StringMethodsDemo {

    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    static String formatName(String first, String last) {
        return last.toUpperCase() + ", " + first;
    }

    static boolean checkPalindrome(String text) {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {
        greet("Aayush");
        System.out.println("Formatted Name: " + formatName("John", "Doe"));
        System.out.println("Is 'Level' a palindrome? " + checkPalindrome("Level"));
    }
}
/*
🖥️ Output:

Hello, Aayush!
Formatted Name: DOE, John
Is 'Level' a palindrome? true
*/
