// 12_Polymorphism/RuntimePolymorphismDemo.java
// Author: Aayush Raj
// Description: Demonstrates runtime polymorphism using method overriding.

class Payment {
    public String pay(double amount) {
        return "💳 Paying ₹" + amount + " via generic method";
    }
}

class UpiPayment extends Payment {
    @Override
    public String pay(double amount) {
        return "📱 Paying ₹" + amount + " via UPI";
    }
}

class CardPayment extends Payment {
    @Override
    public String pay(double amount) {
        return "💳 Paying ₹" + amount + " via Card";
    }
}

public class RuntimePolymorphismDemo {
    public static void main(String[] args) {
        Payment p1 = new Payment();
        Payment p2 = new UpiPayment();   // upcasting
        Payment p3 = new CardPayment();  // upcasting

        System.out.println(p1.pay(500));
        System.out.println(p2.pay(750));
        System.out.println(p3.pay(1200));
    }
}

/*
🖥️ Output:
💳 Paying ₹500.0 via generic method
📱 Paying ₹750.0 via UPI
💳 Paying ₹1200.0 via Card
*/
