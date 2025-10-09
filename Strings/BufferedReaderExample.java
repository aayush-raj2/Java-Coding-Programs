// Strings/BufferedReaderExample.java
// Author: Aayush Raj
// Description: Demonstrates reading input using BufferedReader.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a sentence: ");
        String sentence = reader.readLine();

        System.out.println("You entered: " + sentence);
        reader.close();
    }
}
/*
🖥️ Output:

Enter a sentence: Java Strings are powerful
You entered: Java Strings are powerful
*/
