// 04_Constructors/ConstructorOverloadingExample.java
// Author: Aayush Raj
// Description: Demonstrates constructor overloading in Java.

public class ConstructorOverloadingExample {
    String carBrand;
    String carModel;
    int year;

    // Constructor 1: No parameters
    public ConstructorOverloadingExample() {
        this("Unknown", "Base Model", 2000);
    }

    // Constructor 2: Two parameters
    public ConstructorOverloadingExample(String carBrand, String carModel) {
        this(carBrand, carModel, 2024);
    }

    // Constructor 3: Three parameters
    public ConstructorOverloadingExample(String carBrand, String carModel, int year) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.year = year;
    }

    void display() {
        System.out.println("🚗 Car Brand: " + carBrand + ", Model: " + carModel + ", Year: " + year);
    }

    public static void main(String[] args) {
        ConstructorOverloadingExample car1 = new ConstructorOverloadingExample();
        ConstructorOverloadingExample car2 = new ConstructorOverloadingExample("Tesla", "Model 3");
        ConstructorOverloadingExample car3 = new ConstructorOverloadingExample("BMW", "X5", 2022);

        car1.display();
        car2.display();
        car3.display();
    }
}

/*
🖥️ Output (for ConstructorOverloadingExample.java)
🚗 Car Brand: Unknown, Model: Base Model, Year: 2000
🚗 Car Brand: Tesla, Model: Model 3, Year: 2024
🚗 Car Brand: BMW, Model: X5, Year: 2022

🧠 Concept:
Constructor overloading = Multiple constructors with different parameter lists.
It provides flexibility while creating objects.
*/
