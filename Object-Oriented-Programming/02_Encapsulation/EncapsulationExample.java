// 10_Encapsulation/EncapsulationExample.java
// Author: Aayush Raj
// Description: Demonstrates encapsulation using private fields with getters and setters.

class BankAccount {
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter and Setter methods (controlled access)
    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("💰 Deposited: ₹" + amount + " | New Balance: ₹" + balance);
        } else {
            System.out.println("❌ Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("💸 Withdrawn: ₹" + amount + " | Remaining Balance: ₹" + balance);
        } else {
            System.out.println("⚠️ Invalid withdrawal or insufficient funds!");
        }
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Aayush Raj", 10000);
        System.out.println("👤 Account Holder: " + account.getAccountHolder());
        System.out.println("💵 Initial Balance: ₹" + account.getBalance());

        account.deposit(2500);
        account.withdraw(4000);
    }
}

/*
🖥️ Output (for EncapsulationExample.java)
👤 Account Holder: Aayush Raj
💵 Initial Balance: ₹10000.0
💰 Deposited: ₹2500.0 | New Balance: ₹12500.0
💸 Withdrawn: ₹4000.0 | Remaining Balance: ₹8500.0

🧠 Concept:
Encapsulation = Binding data (fields) + methods into one unit (class).
Private fields protect data, and getters/setters provide controlled access.
*/
