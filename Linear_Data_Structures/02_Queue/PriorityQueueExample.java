// Author: Aayush Raj
// Description: Demonstrates Priority Queue in Java using java.util.PriorityQueue

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30); // lower = higher priority
        pq.add(10);
        pq.add(20);

        System.out.println("🧾 Serving tasks by priority:");
        while (!pq.isEmpty()) {
            System.out.println("Processed: " + pq.poll());
        }
    }
}

/*
🖥️ Output:
🧾 Serving tasks by priority:
Processed: 10
Processed: 20
Processed: 30
*/
