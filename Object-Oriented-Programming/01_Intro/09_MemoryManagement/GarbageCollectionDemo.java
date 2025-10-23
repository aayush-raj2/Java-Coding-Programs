// 09_MemoryManagement/GarbageCollectionDemo.java
// Author: Aayush Raj
// Description: Demonstrates when objects become eligible for garbage collection.

public class GarbageCollectionDemo {
    static void createObject() {
        ObjectLifecycleExample temp = new ObjectLifecycleExample("TemporaryObject");
    }

    public static void main(String[] args) {
        System.out.println("🚀 Garbage Collection Demo Start");

        createObject(); // temp reference lost after method ends
        System.gc(); // Request GC

        System.out.println("🏁 Demo complete — object eligible for GC after method ends.");
    }
}

/*
🖥️ Output:
🚀 Garbage Collection Demo Start
🆕 Object created: TemporaryObject
💀 Object destroyed by Garbage Collector: TemporaryObject
🏁 Demo complete — object eligible for GC after method ends.
*/
