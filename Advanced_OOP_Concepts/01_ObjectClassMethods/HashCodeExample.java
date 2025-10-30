import java.util.Objects;

// Author: Aayush Raj
// Demonstrates hashCode() relation to equals()

class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee)) return false;
        Employee e = (Employee) obj;
        return id == e.id && name.equals(e.name);
    }
}

public class HashCodeExample {
    public static void main(String[] args) {
        Employee e1 = new Employee("Aayush", 501);
        Employee e2 = new Employee("Aayush", 501);
        System.out.println("e1 hashCode: " + e1.hashCode());
        System.out.println("e2 hashCode: " + e2.hashCode());
        System.out.println("e1 equals e2: " + e1.equals(e2));
    }
}
/*
🖥️ Output:
e1 hashCode: 1848398479
e2 hashCode: 1848398479
e1 equals e2: true
*/
