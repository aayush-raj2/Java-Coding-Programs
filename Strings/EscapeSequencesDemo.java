// Strings/EscapeSequencesDemo.java
// Author: Aayush Raj
// Description: Demonstrates escape characters and Unicode usage.

public class EscapeSequencesDemo {
    public static void main(String[] args) {
        String text = "He said, \"Java is fun!\"\nPath: C:\\Users\\Java";
        String unicode = "\u0048\u0065\u006C\u006C\u006F"; // "Hello"

        System.out.println("Escape Sequences Example:");
        System.out.println(text);
        System.out.println("Unicode Example: " + unicode);
    }
}
/*
Escape Sequences Example:
He said, "Java is fun!"
Path: C:\Users\Java
Unicode Example: Hello
*/
