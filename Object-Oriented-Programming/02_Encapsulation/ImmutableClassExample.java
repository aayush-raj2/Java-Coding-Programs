// 10_Encapsulation/ImmutableClassExample.java
// Author: Aayush Raj
// Description: Demonstrates creating an immutable class in Java.

final class Employee {
    private final int id;
    private final String name;
    private final String department;

    // Parameterized constructor to initialize final fields
    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Getters only (no setters)
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
}

public class ImmutableClassExample {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Aayush Raj", "Software Development");

        System.out.println("👨‍💻 Employee Details:");
        System.out.println("🆔 ID: " + e1.getId());
        System.out.println("👤 Name: " + e1.getName());
        System.out.println("🏢 Department: " + e1.getDepartment());

        // e1.name = "Riddhima"; // ❌ Not allowed, class is immutable
    }
}

/*
🖥️ Output (for ImmutableClassExample.java)
👨‍💻 Employee Details:
🆔 ID: 101
👤 Name: Aayush Raj
🏢 Department: Software Development

🧠 Concept:
Immutable classes ensure data security — once created, their state cannot change.
Rules:
- Class marked as final
- All fields private & final
- No setters, only getters
*/
