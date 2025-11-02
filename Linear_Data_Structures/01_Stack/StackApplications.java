// Author: Aayush Raj
// Description: Demonstrates Undo simulation and postfix evaluation using Stack

import java.util.Stack;

public class StackApplications {
    public static int evaluatePostfix(String expr) {
        Stack<Integer> stack = new Stack<>();

        for (char c : expr.toCharArray()) {
            if (Character.isDigit(c))
                stack.push(c - '0');
            else {
                int val2 = stack.pop();
                int val1 = stack.pop();
                switch (c) {
                    case '+': stack.push(val1 + val2); break;
                    case '-': stack.push(val1 - val2); break;
                    case '*': stack.push(val1 * val2); break;
                    case '/': stack.push(val1 / val2); break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        System.out.println("Undo Simulation using Stack:");
        Stack<String> actions = new Stack<>();
        actions.push("Typed 'Hello'");
        actions.push("Typed 'World'");
        System.out.println(actions.pop() + " undone!");

        System.out.println("\nPostfix Evaluation:");
        String postfix = "53*2+";
        System.out.println("Result: " + evaluatePostfix(postfix));
    }
}

/*
🖥️ Output:
Undo Simulation using Stack:
Typed 'World' undone!

Postfix Evaluation:
Result: 17
*/
