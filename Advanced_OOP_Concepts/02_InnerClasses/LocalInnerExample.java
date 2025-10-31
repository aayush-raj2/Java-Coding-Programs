class Outer {
    void display() {
        final int num = 100;
        class LocalInner {
            void show() {
                System.out.println("Local variable = " + num);
            }
        }
        new LocalInner().show();
    }
}

public class LocalInnerExample {
    public static void main(String[] args) {
        new Outer().display();
    }
}
/*
🖥️ Output:
Local variable = 100
*/
