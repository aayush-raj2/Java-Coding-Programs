// Author: Aayush Raj
// Description: Checks balanced parentheses using Stack

import java.util.Stack;

public class ValidParenthesisChecker {
    public static boolean isValid(String expr) {
        Stack<Character> stack = new Stack<>();

        for (char c : expr.toCharArray()) {
            if (c == '(' || c == '{' || c == '[')
                stack.push(c);
            else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expr1 = "({[]})";
        String expr2 = "([)]";
        System.out.println(expr1 + " → " + isValid(expr1));
        System.out.println(expr2 + " → " + isValid(expr2));
    }
}

/*
🖥️ Output:
({[]}) → true
([)] → false
*/
