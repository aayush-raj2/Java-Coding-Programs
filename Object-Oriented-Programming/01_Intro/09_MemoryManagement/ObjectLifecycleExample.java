// 09_MemoryManagement/ObjectLifecycleExample.java
// Author: Aayush Raj
// Description: Demonstrates object creation and garbage collection lifecycle in Java.

public class ObjectLifecycleExample {
    String name;

    ObjectLifecycleExample(String name) {
        this.name = name;
        System.out.println("🆕 Object created: " + name);
    }

    // finalize() method is deprecated but shown here for educational purpose
    @Override
    protected void finalize() throws Throwable {
        System.out.println("💀 Object destroyed by Garbage Collector: " + name);
    }

    public static void main(String[] args) {
        System.out.println("🚀 Program started");

        ObjectLifecycleExample obj1 = new ObjectLifecycleExample("Phone");
        ObjectLifecycleExample obj2 = new ObjectLifecycleExample("Laptop");

        // Nullify references → eligible for GC
        obj1 = null;
        obj2 = null;

        // Suggest JVM to run GC
        System.gc();

        System.out.println("🏁 End of main method");
    }
}

/*
🖥️ Output (may vary):
🚀 Program started
🆕 Object created: Phone
🆕 Object created: Laptop
🏁 End of main method
💀 Object destroyed by Garbage Collector: Laptop
💀 Object destroyed by Garbage Collector: Phone
*/
