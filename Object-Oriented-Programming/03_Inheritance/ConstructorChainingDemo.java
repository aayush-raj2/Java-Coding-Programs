// 11_Inheritance/ConstructorChainingDemo.java
// Author: Aayush Raj
// Description: Demonstrates constructor chaining in an inheritance hierarchy.

class Vehicle {
    Vehicle() {
        System.out.println("🚙 Vehicle constructor");
    }
}

class Car extends Vehicle {
    Car() {
        System.out.println("🚗 Car constructor");
    }
}

class ElectricCar extends Car {
    ElectricCar() {
        System.out.println("🔋 ElectricCar constructor");
    }
}

public class ConstructorChainingDemo {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar();
    }
}

/*
🖥️ Output:
🚙 Vehicle constructor
🚗 Car constructor
🔋 ElectricCar constructor
*/
