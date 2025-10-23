// 09_MemoryManagement/MemoryDiagramSimulation.java
// Author: Aayush Raj
// Description: Conceptual demonstration of stack and heap memory behavior.

public class MemoryDiagramSimulation {
    static class Car {
        String model;
        Car(String model) { this.model = model; }
    }

    public static void main(String[] args) {
        System.out.println("🧠 Memory Simulation Start\n");

        // Stack: references
        // Heap: actual objects
        Car car1 = new Car("BMW X5");
        Car car2 = new Car("Audi A6");

        System.out.println("🔹 car1 -> " + car1.model);
        System.out.println("🔹 car2 -> " + car2.model);

        // Changing reference
        car1 = car2; // Old BMW object becomes unreferenced
        System.out.println("\n🔁 car1 now refers to the same object as car2");

        System.out.println("🔹 car1 -> " + car1.model);
        System.out.println("🔹 car2 -> " + car2.model);

        System.out.println("\n🏁 End of simulation (BMW object eligible for GC)");
    }
}

/*
🖥️ Output:
🧠 Memory Simulation Start

🔹 car1 -> BMW X5
🔹 car2 -> Audi A6

🔁 car1 now refers to the same object as car2
🔹 car1 -> Audi A6
🔹 car2 -> Audi A6

🏁 End of simulation (BMW object eligible for GC)
*/
