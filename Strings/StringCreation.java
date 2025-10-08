// Strings/StringCreation.java
// Author: Aayush Raj
// Description: Shows multiple ways to create strings.

public class StringCreation {
    public static void main(String[] args) {
        String literal = "Hello";                     // String literal
        String object = new String("World");          // Using new keyword
        char[] chars = {'J', 'a', 'v', 'a'};          // Using character array
        String fromArray = new String(chars);
        StringBuilder sb = new StringBuilder("Hi ");  // Mutable string
        sb.append("there!");

        System.out.println(literal + " " + object);
        System.out.println(fromArray);
        System.out.println(sb.toString());
    }
}
/*
🖥️ Output:

Hello World
Java
Hi there!
*/
