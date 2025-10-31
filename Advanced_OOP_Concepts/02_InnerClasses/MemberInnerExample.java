class Outer {
    private int value = 10;
    class Inner {
        void show() {
            System.out.println("Outer value = " + value);
        }
    }
}

public class MemberInnerExample {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.show();
    }
}
/*
🖥️ Output:
Outer value = 10
*/
