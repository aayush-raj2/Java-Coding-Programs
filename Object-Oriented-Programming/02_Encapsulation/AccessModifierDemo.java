// 10_Encapsulation/AccessModifierDemo.java
// Author: Aayush Raj
// Description: Demonstrates the use of access modifiers in Java.

package encapsulation;

class Vehicle {
    private String model;   // accessible only within this class
    protected int speed;    // accessible within package and subclasses
    public String color;    // accessible everywhere

    public Vehicle(String model, int speed, String color) {
        this.model = model;
        this.speed = speed;
        this.color = color;
    }

    private void showModel() {
        System.out.println("🔒 Private Model: " + model);
    }

    protected void showSpeed() {
        System.out.println("⚙️ Protected Speed: " + speed + " km/h");
    }

    public void showColor() {
        System.out.println("🎨 Public Color: " + color);
    }

    public void displayAll() {
        showModel();
        showSpeed();
        showColor();
    }
}

public class AccessModifierDemo {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("Tesla Model 3", 200, "White");
        car.displayAll();
        car.showColor(); // accessible publicly
    }
}

/*
🖥️ Output (for AccessModifierDemo.java)

🔒 Private Model: Tesla Model 3
⚙️ Protected Speed: 200 km/h
🎨 Public Color: White
🎨 Public Color: White

🧠 Concept:
Access Modifiers define where a member (field or method) can be accessed.
- private → same class only
- protected → same package + subclasses
- public → accessible everywhere
*/
