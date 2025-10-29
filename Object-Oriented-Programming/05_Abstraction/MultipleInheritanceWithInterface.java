// 05_Abstraction/MultipleInheritanceWithInterface.java
// Author: Aayush Raj
// Description: Demonstrates multiple inheritance using interfaces.

interface Bank {
    void provideLoan();
}

interface SBIBank extends Bank {
    void sbiInterestRate();
}

interface HDFCBank extends Bank {
    void hdfcInterestRate();
}

class MyBank implements SBIBank, HDFCBank {
    @Override
    public void provideLoan() {
        System.out.println("🏦 MyBank provides loan facility.");
    }

    @Override
    public void sbiInterestRate() {
        System.out.println("💰 SBI Interest Rate: 7%");
    }

    @Override
    public void hdfcInterestRate() {
        System.out.println("💸 HDFC Interest Rate: 8%");
    }
}

public class MultipleInheritanceWithInterface {
    public static void main(String[] args) {
        MyBank bank = new MyBank();
        bank.provideLoan();
        bank.sbiInterestRate();
        bank.hdfcInterestRate();
    }
}

/*
🖥️ Output:
🏦 MyBank provides loan facility.
💰 SBI Interest Rate: 7%
💸 HDFC Interest Rate: 8%
*/
