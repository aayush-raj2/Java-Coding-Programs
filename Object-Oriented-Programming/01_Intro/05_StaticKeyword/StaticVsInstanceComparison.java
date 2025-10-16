// 05_StaticKeyword/StaticVsInstanceComparison.java
// Author: Aayush Raj
// Description: Compares static and instance variables behavior.

public class StaticVsInstanceComparison {
    int instanceCount = 0;      // Each object gets its own copy
    static int staticCount = 0; // Shared among all objects

    StaticVsInstanceComparison() {
        instanceCount++;
        staticCount++;
    }

    void displayCounts() {
        System.out.println("📦 Instance Count: " + instanceCount + " | 🌐 Static Count: " + staticCount);
    }

    public static void main(String[] args) {
        StaticVsInstanceComparison obj1 = new StaticVsInstanceComparison();
        obj1.displayCounts();

        StaticVsInstanceComparison obj2 = new StaticVsInstanceComparison();
        obj2.displayCounts();

        StaticVsInstanceComparison obj3 = new StaticVsInstanceComparison();
        obj3.displayCounts();
    }
}

/*
🖥️ Output (for StaticVsInstanceComparison.java)
📦 Instance Count: 1 | 🌐 Static Count: 1
📦 Instance Count: 1 | 🌐 Static Count: 2
📦 Instance Count: 1 | 🌐 Static Count: 3

🧠 Concept:
- Instance variables are separate for each object.
- Static variables are shared and incremented across all objects.
*/
