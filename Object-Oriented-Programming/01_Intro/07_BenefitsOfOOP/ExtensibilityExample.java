// 07_BenefitsOfOOP/ExtensibilityExample.java
// Author: Aayush Raj
// Description: Demonstrates extensibility — adding new functionality without modifying existing code.

abstract class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    abstract double calculateArea();

    void displayInfo() {
        System.out.println("🎨 Shape: " + this.getClass().getSimpleName());
        System.out.println("Color: " + color);
        System.out.println("Area: " + calculateArea());
        System.out.println("---------------------------");
    }
}

class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double width, height;

    Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class ExtensibilityExample {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle("Red", 5.0),
            new Rectangle("Blue", 4.0, 6.0),
            new Triangle("Green", 3.0, 8.0)
        };

        for (Shape s : shapes) {
            s.displayInfo();
        }
    }
}

/*
🖥️ Output (for ExtensibilityExample.java)
🎨 Shape: Circle
Color: Red
Area: 78.53981633974483
---------------------------
🎨 Shape: Rectangle
Color: Blue
Area: 24.0
---------------------------
🎨 Shape: Triangle
Color: Green
Area: 12.0
---------------------------

🧠 Concept:
- Extensibility means new functionality can be added without modifying existing code.
- Follows Open/Closed Principle: “Open for extension, closed for modification.”
*/
