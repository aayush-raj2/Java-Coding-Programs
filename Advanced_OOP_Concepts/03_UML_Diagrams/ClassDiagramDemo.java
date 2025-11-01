// 03_UML_Diagrams/ClassDiagramDemo.java
// Author: Aayush Raj
// Description: Demonstrates UML Class Diagram relationships (Association, Composition, Aggregation)

import java.util.*;

// -------------------- Product Class (Independent Entity) --------------------
class Product {
    private int productId;
    private String name;
    private double price;
    private int stock;

    public Product(int productId, String name, double price, int stock) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public double getPrice() { return price; }

    public void updateStock(int quantity) {
        if (quantity > stock)
            System.out.println("⚠️ Insufficient stock for " + name);
        else {
            stock -= quantity;
            System.out.println("🛒 Updated stock for " + name + ": " + stock + " remaining");
        }
    }

    @Override
    public String toString() {
        return "Product{id=" + productId + ", name='" + name + "', price=" + price + ", stock=" + stock + "}";
    }
}

// -------------------- OrderItem Class (Composed inside Order) --------------------
class OrderItem {
    private Product product;
    private int quantity;

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getSubtotal() { return product.getPrice() * quantity; }

    public void updateStock() { product.updateStock(quantity); }

    @Override
    public String toString() {
        return product + ", Quantity: " + quantity + ", Subtotal: " + getSubtotal();
    }
}

// -------------------- Order Class (Composition with OrderItem) --------------------
class Order {
    private int orderId;
    private Date orderDate;
    private List<OrderItem> items = new ArrayList<>();
    private String status;

    public Order(int orderId, Date orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.status = "Pending";
    }

    public void addItem(OrderItem item) { items.add(item); }

    public double calculateTotal() {
        return items.stream().mapToDouble(OrderItem::getSubtotal).sum();
    }

    public void confirmOrder() {
        for (OrderItem item : items) item.updateStock();
        status = "Confirmed";
        System.out.println("✅ Order #" + orderId + " confirmed!");
    }

    @Override
    public String toString() {
        return "Order{id=" + orderId + ", date=" + orderDate + ", status=" + status + ", total=" + calculateTotal() + "}";
    }
}

// -------------------- Customer Class (Association with Order) --------------------
class Customer {
    private int id;
    private String name;
    private String email;
    private List<Order> orders = new ArrayList<>();

    public Customer(int id, String name, String email) {
        this.id = id; this.name = name; this.email = email;
    }

    public void placeOrder(Order order) {
        orders.add(order);
        order.confirmOrder();
        System.out.println("📦 " + name + " placed a new order.");
    }

    @Override
    public String toString() {
        return "Customer{id=" + id + ", name='" + name + "', email='" + email + "'}";
    }
}

// -------------------- Main Program --------------------
public class ClassDiagramDemo {
    public static void main(String[] args) {
        Product laptop = new Product(101, "Gaming Laptop", 1200.00, 5);
        Product mouse = new Product(102, "Wireless Mouse", 25.99, 50);

        Customer customer = new Customer(1, "Aayush Raj", "aayush@example.com");
        Order order = new Order(5001, new Date());

        OrderItem item1 = new OrderItem(laptop, 1);
        OrderItem item2 = new OrderItem(mouse, 2);
        order.addItem(item1);
        order.addItem(item2);

        customer.placeOrder(order);

        System.out.println("\n🧾 Order Summary:");
        System.out.println(order);
        System.out.println("\n👤 Customer Info:");
        System.out.println(customer);
    }
}

/*
🖥️ OUTPUT:

🛒 Updated stock for Gaming Laptop: 4 remaining
🛒 Updated stock for Wireless Mouse: 48 remaining
✅ Order #5001 confirmed!
📦 Aayush Raj placed a new order.

🧾 Order Summary:
Order{id=5001, date=Fri Oct 10 22:00:00 IST 2025, status=Confirmed, total=1251.98}

👤 Customer Info:
Customer{id=1, name='Aayush Raj', email='aayush@example.com'}
*/
