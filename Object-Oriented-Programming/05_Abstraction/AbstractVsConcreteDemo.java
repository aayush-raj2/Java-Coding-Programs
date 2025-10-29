// 05_Abstraction/AbstractVsConcreteDemo.java
// Author: Aayush Raj
// Description: Shows difference between abstract and concrete classes.

abstract class Shape {
    abstract double area(); // abstract method (no body)
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }

    @Override
    double area() {
        return length * width;
    }
}

public class AbstractVsConcreteDemo {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rect = new Rectangle(4, 6);

        System.out.println("⚪ Circle Area: " + circle.area());
        System.out.println("🟦 Rectangle Area: " + rect.area());
    }
}

/*
🖥️ Output:
⚪ Circle Area: 78.53981633974483
🟦 Rectangle Area: 24.0
*/
