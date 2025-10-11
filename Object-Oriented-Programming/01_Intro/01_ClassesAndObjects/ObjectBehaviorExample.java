// 01_ClassesAndObjects/ObjectBehaviorExample.java
// Author: Aayush Raj
// Description: Shows how object behavior is independent for each instance.

public class ObjectBehaviorExample {
    public static void main(String[] args) {
        ClassExample phone1 = new ClassExample("Google", "Pixel 8");
        ClassExample phone2 = new ClassExample("OnePlus", "11R");

        System.out.println("=== Before Use ===");
        phone1.showDetails();
        phone2.showDetails();

        // Simulate battery usage on phone1
        System.out.println("\n=== Using Phone1 ===");
        phone1.batteryLevel -= 30;

        System.out.println("\n=== After Use ===");
        phone1.showDetails();
        phone2.showDetails();
    }
}

/*
🧠 Concept:
Each object maintains its own state.
Changes in one object do not affect others.

🖥️ Output (for ObjectBehaviorExample)
=== Before Use ===
📱 Device Info:
Brand: Google
Model: Pixel 8
Battery: 100%

📱 Device Info:
Brand: OnePlus
Model: 11R
Battery: 100%

=== Using Phone1 ===

=== After Use ===
📱 Device Info:
Brand: Google
Model: Pixel 8
Battery: 70%

📱 Device Info:
Brand: OnePlus
Model: 11R
Battery: 100%
*/
