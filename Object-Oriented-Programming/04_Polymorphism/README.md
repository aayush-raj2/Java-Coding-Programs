# 🧩 Topic: Polymorphism in Java

## 🎯 Objective
To understand how **Polymorphism** allows one interface to represent multiple behaviors, improving flexibility, reusability, and extensibility.

---

## 📘 Key Concepts

| Concept | Description |
|----------|-------------|
| **Polymorphism** | “Many forms” — same method behaves differently depending on context. |
| **Compile-time Polymorphism** | Achieved via **method overloading**. |
| **Runtime Polymorphism** | Achieved via **method overriding**. |
| **Dynamic Method Dispatch** | Decides at runtime which overridden method to execute. |
| **Upcasting / Downcasting** | Type conversions between parent and child class references. |

---

## 🧠 1. Compile-Time Polymorphism (Method Overloading)
Occurs when multiple methods share the same name but differ in parameters.  
👉 Resolved by the compiler **at compile time**.  
Example:  
p.print(10);  
p.print("Hello");  

## ⚙️ 2. Runtime Polymorphism (Method Overriding)
When a subclass provides its own version of a parent’s method.  
👉 Resolved at runtime through **dynamic dispatch**.

## 🚀 3. Dynamic Method Dispatch
When a **parent class reference** points to a child object, the method call is resolved based on the actual object type — not the reference type.  
Example:  
Vehicle v = new Car();  
v.run(); // Calls Car's version  

## 🧩 4. Upcasting
Assigning a **subclass object to a superclass reference**.  
- Done automatically (safe)  
- Child-specific members become inaccessible  
Example:  
Animal a = new Dog(); // Upcasting  
a.sound(); // Dog’s method executes

## ⚠️ 5. Downcasting

Converting a **superclass reference back to a subclass**.  
- Done explicitly (can cause ClassCastException)  
- Always use instanceof to ensure safety  
Example:  
if (v instanceof Car) {  
    Car c = (Car) v;  
}  

---

## 📂 Files Included

| File                               | Concept Demonstrated    |
| ---------------------------------- | ----------------------- |
| `CompileTimePolymorphismDemo.java` | Method Overloading      |
| `RuntimePolymorphismDemo.java`     | Method Overriding       |
| `DynamicDispatchExample.java`      | Dynamic Method Dispatch |
| `UpcastingExample.java`            | Safe Upcasting          |
| `DowncastingExample.java`          | Safe Downcasting        |

--- 

## ✅ Takeaways

✅ One name, many behaviors  
✅ Overloading → compile-time decision  
✅ Overriding → runtime decision  
✅ Upcasting → generalization  
✅ Downcasting → specialization  

---

## 🏁 Run Instructions

javac CompileTimePolymorphismDemo.java  
java CompileTimePolymorphismDemo

javac RuntimePolymorphismDemo.java  
java RuntimePolymorphismDemo

javac DynamicDispatchExample.java  
java DynamicDispatchExample

---

## 🌟 Summary

Polymorphism is what makes OOP **dynamic, extensible, and powerful**.  
It lets objects behave according to their actual type — not their reference —  
bringing flexibility and realism into software design.  
