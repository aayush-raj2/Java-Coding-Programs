// Strings/StringArrayDemo.java
// Author: Aayush Raj
// Description: Demonstrates arrays of strings and array traversal.

public class StringArrayDemo {
    public static void main(String[] args) {
        String[] languages = {"Java", "Python", "C++", "Go", "Rust"};

        System.out.println("Languages list:");
        for (String lang : languages) {
            System.out.println("- " + lang);
        }

        System.out.println("\nTotal languages: " + languages.length);
    }
}
/*
🖥️ Output:

Languages list:
- Java
- Python
- C++
- Go
- Rust

Total languages: 5
*/
