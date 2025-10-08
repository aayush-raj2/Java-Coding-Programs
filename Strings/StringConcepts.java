// Strings/StringConcepts.java
// Author: Aayush Raj
// Description: Demonstrates string immutability and string pool behavior.

public class StringConcepts {
    public static void main(String[] args) {
        String original = "Hello";
        String modified = original.concat(" World");

        System.out.println("Original String: " + original);
        System.out.println("Modified String: " + modified);

        // Demonstrate string pool behavior
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        System.out.println("\nUsing == operator (String Pool check): " + (s1 == s2)); // true
        System.out.println("Comparing new String object: " + (s1 == s3)); // false
        System.out.println("Using equals() method: " + s1.equals(s3)); // true
    }
}
/*
🖥️ Output:

Original String: Hello
Modified String: Hello World

Using == operator (String Pool check): true
Comparing new String object: false
Using equals() method: true
*/
