// 16_Dynamic_Data_Structures_LinkedList/SinglyLinkedList.java
// Author: Aayush Raj
// Description: Implementation of a Singly Linked List with insertion, deletion, and traversal.

public class SinglyLinkedList {
    Node head;

    // Node structure
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // Insert node at beginning
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Delete node from beginning
    public void deleteAtHead() {
        if (head == null) {
            System.out.println("List is empty. Deletion not possible.");
            return;
        }
        System.out.println("Deleted: " + head.data);
        head = head.next;
    }

    // Display list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.display();
        list.deleteAtHead();
        list.display();
    }
}

/*
🖥️ Output:
30 → 20 → 10 → NULL
Deleted: 30
20 → 10 → NULL
*/
