// 01_Stack/StackArray.java
// Author: Aayush Raj
// Description: Demonstrates Array-based Stack implementation in Java

public class StackArray {
    private int top;
    private int[] stack;

    public StackArray(int size) {
        stack = new int[size];
        top = -1;
    }

    public void push(int value) {
        if (top == stack.length - 1)
            System.out.println("⚠️ Stack Overflow!");
        else
            stack[++top] = value;
    }

    public void pop() {
        if (top == -1)
            System.out.println("⚠️ Stack Underflow!");
        else
            System.out.println("Popped: " + stack[top--]);
    }

    public void peek() {
        if (top == -1)
            System.out.println("Stack is empty!");
        else
            System.out.println("Top element: " + stack[top]);
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        StackArray s = new StackArray(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.peek();    // 30
        s.pop();     // Popped: 30
        s.pop();     // Popped: 20
        s.pop();     // Popped: 10
        s.pop();     // Underflow
    }
}

/*
🖥️ Output:
Top element: 30
Popped: 30
Popped: 20
Popped: 10
⚠️ Stack Underflow!
*/
