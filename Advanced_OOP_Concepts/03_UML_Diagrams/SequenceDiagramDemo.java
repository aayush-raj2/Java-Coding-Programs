// 03_UML_Diagrams/SequenceDiagramDemo.java
// Author: Aayush Raj
// Description: Demonstrates UML Sequence Diagram — message flow between objects

import java.util.*;

class SeqProduct {
    private String name;
    private double price;
    private int stock;

    public SeqProduct(String name, double price, int stock) {
        this.name = name; this.price = price; this.stock = stock;
    }

    public double getPrice() { return price; }
    public void updateStock(int qty) {
        stock -= qty;
        System.out.println("🛒 Stock updated for " + name + " → " + stock + " left");
    }
}

class SeqOrderItem {
    private SeqProduct product;
    private int qty;
    public SeqOrderItem(SeqProduct product, int qty) {
        this.product = product; this.qty = qty;
    }
    public double getSubtotal() { return product.getPrice() * qty; }
    public void reduceStock() { product.updateStock(qty); }
}

class SeqOrder {
    private List<SeqOrderItem> items = new ArrayList<>();
    public void addItem(SeqOrderItem item) {
        items.add(item);
        System.out.println("📦 Added item to order.");
    }
    public double calculateTotal() {
        System.out.println("💰 Calculating total...");
        return items.stream().mapToDouble(SeqOrderItem::getSubtotal).sum();
    }
    public void finalizeOrder() {
        for (SeqOrderItem i : items) i.reduceStock();
        System.out.println("✅ Order confirmed!");
    }
}

class SeqCustomer {
    public void placeOrder(SeqOrder order) {
        System.out.println("👤 Customer placing order...");
        double total = order.calculateTotal();
        order.finalizeOrder();
        System.out.println("🧾 Order total: $" + total);
    }
}

public class SequenceDiagramDemo {
    public static void main(String[] args) {
        SeqProduct phone = new SeqProduct("Smartphone", 899.99, 10);
        SeqOrder order = new SeqOrder();
        SeqOrderItem item = new SeqOrderItem(phone, 2);

        order.addItem(item);

        SeqCustomer customer = new SeqCustomer();
        customer.placeOrder(order);
    }
}

/*
🖥️ OUTPUT:
📦 Added item to order.
👤 Customer placing order...
💰 Calculating total...
🛒 Stock updated for Smartphone → 8 left
✅ Order confirmed!
🧾 Order total: $1799.98
*/
