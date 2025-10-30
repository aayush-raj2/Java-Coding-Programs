// Author: Aayush Raj
// Demonstrates toString() and equals() methods

class Student {
    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', rollNo=" + rollNo + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student s = (Student) obj;
        return rollNo == s.rollNo && name.equals(s.name);
    }
}

public class ToStringEqualsDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Aayush", 101);
        Student s2 = new Student("Aayush", 101);
        Student s3 = new Student("Raj", 102);

        System.out.println(s1);
        System.out.println("s1 equals s2 → " + s1.equals(s2));
        System.out.println("s1 equals s3 → " + s1.equals(s3));
    }
}
/*
🖥️ Output:
Student{name='Aayush', rollNo=101}
s1 equals s2 → true
s1 equals s3 → false
*/
