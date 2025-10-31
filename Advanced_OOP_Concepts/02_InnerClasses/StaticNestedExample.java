class Outer {
    private static int data = 42;
    static class Nested {
        void print() {
            System.out.println("Static data = " + data);
        }
    }
}

public class StaticNestedExample {
    public static void main(String[] args) {
        Outer.Nested n = new Outer.Nested();
        n.print();
    }
}
/*
🖥️ Output:
Static data = 42
*/
