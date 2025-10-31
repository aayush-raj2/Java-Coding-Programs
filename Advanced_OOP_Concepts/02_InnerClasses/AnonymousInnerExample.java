interface Greeting {
    void sayHello();
}

public class AnonymousInnerExample {
    public static void main(String[] args) {
        Greeting greet = new Greeting() {
            public void sayHello() {
                System.out.println("Hello from anonymous inner class!");
            }
        };
        greet.sayHello();
    }
}
/*
🖥️ Output:
Hello from anonymous inner class!
*/
