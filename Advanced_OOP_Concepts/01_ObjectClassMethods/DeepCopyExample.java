class Address implements Cloneable {
    String city;
    Address(String city) { this.city = city; }
    @Override protected Object clone() throws CloneNotSupportedException { return super.clone(); }
}

class Person implements Cloneable {
    String name; Address address;
    Person(String name, Address address) { this.name = name; this.address = address; }
    @Override protected Object clone() throws CloneNotSupportedException {
        Person copy = (Person) super.clone();
        copy.address = (Address) address.clone();
        return copy;
    }
}

public class DeepCopyExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("Aayush", new Address("Delhi"));
        Person p2 = (Person) p1.clone();

        System.out.println("Before: " + p1.address.city + " | " + p2.address.city);
        p2.address.city = "Mumbai";
        System.out.println("After: " + p1.address.city + " | " + p2.address.city);
    }
}
/*
🖥️ Output:
Before: Delhi | Delhi
After: Delhi | Mumbai
(✅ Deep copy)
*/
