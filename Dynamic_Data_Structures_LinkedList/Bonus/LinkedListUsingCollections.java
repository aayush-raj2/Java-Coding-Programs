// 16_Dynamic_Data_Structures_LinkedList/Bonus/LinkedListUsingCollections.java
// Author: Aayush Raj
// Description: Demonstrates built-in LinkedList operations from Java Collections Framework.

import java.util.LinkedList;

public class LinkedListUsingCollections {

    public static void main(String[] args) {

        // Create a LinkedList of Integers
        LinkedList<Integer> list = new LinkedList<>();

        System.out.println("🔹 Adding Elements:");
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("List: " + list);

        System.out.println("\n🔹 Inserting at First and Last:");
        list.addFirst(5);
        list.addLast(40);
        System.out.println("List after insertion: " + list);

        System.out.println("\n🔹 Accessing Elements:");
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());
        System.out.println("Element at Index 2: " + list.get(2));

        System.out.println("\n🔹 Removing Elements:");
        list.removeFirst();
        list.removeLast();
        list.remove(Integer.valueOf(20));
        System.out.println("List after removals: " + list);

        System.out.println("\n🔹 Checking Size and Elements:");
        System.out.println("Size: " + list.size());
        System.out.println("Contains 10? " + list.contains(10));
        System.out.println("Contains 99? " + list.contains(99));

        System.out.println("\n🔹 Iterating using for-each loop:");
        for (int val : list) {
            System.out.println("Value: " + val);
        }

        System.out.println("\n✅ Demonstration Complete — Java LinkedList supports dynamic insertion, deletion, and traversal efficiently.");
    }
}

/*
🖥️ OUTPUT:

🔹 Adding Elements:
List: [10, 20, 30]

🔹 Inserting at First and Last:
List after insertion: [5, 10, 20, 30, 40]

🔹 Accessing Elements:
First Element: 5
Last Element: 40
Element at Index 2: 20

🔹 Removing Elements:
List after removals: [10, 30]

🔹 Checking Size and Elements:
Size: 2
Contains 10? true
Contains 99? false

🔹 Iterating using for-each loop:
Value: 10
Value: 30

✅ Demonstration Complete — Java LinkedList supports dynamic insertion, deletion, and traversal efficiently.
*/
