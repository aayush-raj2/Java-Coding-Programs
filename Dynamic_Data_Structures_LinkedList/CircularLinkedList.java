// 16_Dynamic_Data_Structures_LinkedList/CircularLinkedList.java
// Author: Aayush Raj
// Description: Demonstrates Circular Linked List implementation in Java.

public class CircularLinkedList {
    Node head, tail;

    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(Back to Head)");
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insert(11);
        cll.insert(22);
        cll.insert(33);
        cll.display();
    }
}

/*
🖥️ Output:
11 → 22 → 33 → (Back to Head)
*/
