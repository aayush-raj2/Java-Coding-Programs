class Vehicle {}
class Car extends Vehicle {}

public class GetClassExample {
    public static void main(String[] args) {
        Vehicle v = new Car();
        System.out.println("Runtime class: " + v.getClass().getName());
    }
}
/*
🖥️ Output:
Runtime class: Car
*/
