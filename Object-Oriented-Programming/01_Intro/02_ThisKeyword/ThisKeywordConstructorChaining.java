// 02_ThisKeyword/ThisKeywordConstructorChaining.java
// Author: Aayush Raj
// Description: Demonstrates constructor chaining using 'this()' keyword.

public class ThisKeywordConstructorChaining {
    String brand;
    String model;
    int price;

    // Default constructor
    public ThisKeywordConstructorChaining() {
        this("Unknown", "Unknown", 0); // Calls parameterized constructor
    }

    // Parameterized constructor
    public ThisKeywordConstructorChaining(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display object info
    public void display() {
        System.out.println("📱 Brand: " + brand + ", Model: " + model + ", Price: ₹" + price);
    }

    public static void main(String[] args) {
        ThisKeywordConstructorChaining defaultPhone = new ThisKeywordConstructorChaining();
        ThisKeywordConstructorChaining customPhone = new ThisKeywordConstructorChaining("Apple", "iPhone 15", 120000);

        defaultPhone.display();
        customPhone.display();
    }
}

/*
🖥️ Output (for ThisKeywordConstructorChaining.java):
📱 Brand: Unknown, Model: Unknown, Price: ₹0
📱 Brand: Apple, Model: iPhone 15, Price: ₹120000

🧠 Concept:
'this()' can be used to call another constructor of the same class.
It helps avoid code duplication and maintains consistency.
*/
