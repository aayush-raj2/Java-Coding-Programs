// 02_Queue/QueueArray.java
// Author: Aayush Raj
// Description: Simple array-based queue implementation

public class QueueArray {
    private int[] queue;
    private int front, rear, size;

    public QueueArray(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int val) {
        if (size == queue.length)
            System.out.println("⚠️ Queue Full!");
        else {
            rear = (rear + 1) % queue.length;
            queue[rear] = val;
            size++;
        }
    }

    public void dequeue() {
        if (size == 0)
            System.out.println("⚠️ Queue Empty!");
        else {
            System.out.println("Dequeued: " + queue[front]);
            front = (front + 1) % queue.length;
            size--;
        }
    }

    public void peek() {
        if (size == 0)
            System.out.println("Queue is empty!");
        else
            System.out.println("Front: " + queue[front]);
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray(3);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.dequeue();
        q.peek();
    }
}

/*
🖥️ Output:
Dequeued: 10
Front: 20
*/
