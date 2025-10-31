class Address {
    String city;
    public Address(String city) { this.city = city; }
}

class Person implements Cloneable {
    String name;
    Address address;
    public Person(String name, Address address) {
        this.name = name; this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow copy
    }
}

public class ShallowCopyExample {
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
After: Mumbai | Mumbai
(⚠️ Shallow copy)
*/
