// 16_Dynamic_Data_Structures_LinkedList/DoublyLinkedList.java
// Author: Aayush Raj
// Description: Implementation of a Doubly Linked List in Java.

public class DoublyLinkedList {
    Node head;

    class Node {
        int data;
        Node next, prev;
        Node(int data) {
            this.data = data;
            next = prev = null;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.next == null) {
            System.out.println("Deleted: " + head.data);
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        System.out.println("Deleted: " + temp.data);
        temp.prev.next = null;
    }

    public void displayForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ⇄ ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public void displayBackward() {
        Node temp = head;
        if (temp == null) return;
        while (temp.next != null)
            temp = temp.next;
        while (temp != null) {
            System.out.print(temp.data + " ⇄ ");
            temp = temp.prev;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtEnd(5);
        dll.insertAtEnd(15);
        dll.insertAtEnd(25);
        dll.displayForward();
        dll.deleteFromEnd();
        dll.displayBackward();
    }
}

/*
🖥️ Output:
5 ⇄ 15 ⇄ 25 ⇄ NULL
Deleted: 25
15 ⇄ 5 ⇄ NULL
*/
