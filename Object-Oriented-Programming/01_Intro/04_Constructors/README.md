# 🧩 Topic: Constructors in Java

## 🎯 Objective
To understand how constructors are used to initialize objects and provide flexibility during object creation.

---

## 📘 Types of Constructors

| Type | Description |
|------|--------------|
| Default Constructor | Automatically called; sets default values |
| Parameterized Constructor | Accepts arguments to initialize values |
| Constructor Overloading | Multiple constructors with different parameters |
| Copy Constructor | Copies data from an existing object (user-defined in Java) |

---

## 💡 Key Rules
- Constructor name = Class name  
- No return type (not even `void`)  
- Can be **overloaded**, but **cannot be inherited**  
- Called automatically when an object is created  

---

## 📂 Files Included
| File | Concept Demonstrated |
|------|----------------------|
| `DefaultConstructorExample.java` | Default constructor |
| `ParameterizedConstructorExample.java` | Parameterized constructor |
| `ConstructorOverloadingExample.java` | Constructor overloading |
| `CopyConstructorExample.java` | Manual copy constructor |

---

## 🧠 Takeaways
✅ Constructors initialize objects automatically  
✅ You can overload constructors for flexibility  
✅ Use `this()` to call one constructor from another  
✅ Copy constructors help duplicate objects safely  

---

## 🏁 Run Instructions
```bash
javac DefaultConstructorExample.java
java DefaultConstructorExample

javac ParameterizedConstructorExample.java
java ParameterizedConstructorExample

javac ConstructorOverloadingExample.java
java ConstructorOverloadingExample

javac CopyConstructorExample.java
java CopyConstructorExample
