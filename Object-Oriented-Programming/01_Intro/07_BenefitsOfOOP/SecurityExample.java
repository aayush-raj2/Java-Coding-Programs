// 07_BenefitsOfOOP/SecurityExample.java
// Author: Aayush Raj
// Description: Demonstrates encapsulation (data security) using private variables and getters/setters.

class BankAccount {
    private String accountNumber;
    private double balance;

    BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Public method to safely deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("💰 Deposited: ₹" + amount + " | New Balance: ₹" + balance);
        } else {
            System.out.println("❌ Invalid deposit amount!");
        }
    }

    // Public method to safely withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("💸 Withdrawn: ₹" + amount + " | Remaining Balance: ₹" + balance);
        } else {
            System.out.println("⚠️ Insufficient funds or invalid amount!");
        }
    }

    // Read-only access to balance
    public double getBalance() {
        return balance;
    }
}

public class SecurityExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("ACC12345", 10000);

        account.deposit(2000);
        account.withdraw(5000);
        System.out.println("📊 Final Balance: ₹" + account.getBalance());
    }
}

/*
🖥️ Output (for SecurityExample.java)
💰 Deposited: ₹2000.0 | New Balance: ₹12000.0
💸 Withdrawn: ₹5000.0 | Remaining Balance: ₹7000.0
📊 Final Balance: ₹7000.0

🧠 Concept:
- Encapsulation hides internal details and exposes only necessary operations.
- Protects data from unauthorized or invalid access.
*/
