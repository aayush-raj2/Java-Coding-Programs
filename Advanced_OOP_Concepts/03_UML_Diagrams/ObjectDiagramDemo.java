// 03_UML_Diagrams/ObjectDiagramDemo.java
// Author: Aayush Raj
// Description: Demonstrates UML Object Diagram — runtime snapshot of system instances

import java.util.*;

public class ObjectDiagramDemo {
    public static void main(String[] args) {
        Customer alice = new Customer(101, "Alice", "alice@mail.com");
        Product phone = new Product(201, "Smartphone", 899.99, 8);
        Product charger = new Product(202, "Fast Charger", 49.99, 25);

        Order order = new Order(3001, new Date());
        OrderItem item1 = new OrderItem(phone, 1);
        OrderItem item2 = new OrderItem(charger, 2);
        order.addItem(item1);
        order.addItem(item2);

        alice.placeOrder(order);

        System.out.println("\n📦 Runtime Objects Snapshot:");
        System.out.println(alice);
        System.out.println(order);
        System.out.println(item1);
        System.out.println(item2);
    }
}

/*
🖥️ OUTPUT:
🛒 Updated stock for Smartphone: 7 remaining
🛒 Updated stock for Fast Charger: 23 remaining
✅ Order #3001 confirmed!
📦 Alice placed a new order.

📦 Runtime Objects Snapshot:
Customer{id=101, name='Alice', email='alice@mail.com'}
Order{id=3001, date=Fri Oct 10 22:00:00 IST 2025, status=Confirmed, total=999.97}
Product{id=201, name='Smartphone', price=899.99, stock=7}, Quantity: 1, Subtotal: 899.99
Product{id=202, name='Fast Charger', price=49.99, stock=23}, Quantity: 2, Subtotal: 99.98
*/
