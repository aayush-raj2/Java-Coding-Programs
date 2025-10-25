# 🧩 Topic: Inheritance in Java

## 🎯 Objective
To understand how one class can inherit fields and methods from another, promoting **code reusability** and **polymorphism**.

---

## 📘 Key Concepts

| Concept | Description |
|----------|--------------|
| **Inheritance** | Mechanism where one class acquires properties of another. |
| **extends** | Used to inherit a parent class. |
| **super** | Used to access parent class constructors or methods. |
| **Method Overriding** | Redefining a parent method in a child class. |
| **Constructor Chaining** | When subclass constructors call superclass constructors automatically. |

---

## 🧱 Types of Inheritance (Supported in Java)

| Type | Description |
|------|-------------|
| **Single Inheritance** | One class inherits from another (Vehicle → Car). |
| **Multilevel Inheritance** | Inheritance chain of multiple classes (Vehicle → Car → ElectricCar). |
| **Hierarchical Inheritance** | Multiple subclasses inherit from one parent (Vehicle → Car & Bike). |

> ⚠️ Java does **not** support multiple inheritance with classes — only via **interfaces**.

---

## 🧠 Important Keywords

| Keyword | Use |
|----------|-----|
| `extends` | Defines inheritance relationship |
| `super` | Calls parent class constructor or method |
| `@Override` | Informs compiler that a method overrides parent one |

---

## 🔄 Constructor Chaining

Constructors are called top-down:

Parent → Child → Sub-child


Example Output:
- Vehicle constructor
- Car constructor
- ElectricCar constructor

---

## 🧩 Method Overriding & Polymorphism

- Allows **different implementations** of the same method in different classes.  
- Enables **runtime polymorphism** (dynamic method dispatch).

Example:
- Vehicle v = new ElectricCar();
- v.start(); // Calls ElectricCar’s start()

---

## 🧱 Access Modifiers with Inheritance

| Modifier | Accessible in Child? | Description |
|-----------|----------------------|--------------|
| `private` | ❌ | Within same class only |
| `default` | ✅ (same package) | Package-level |
| `protected` | ✅ | Package + Subclass |
| `public` | ✅ | Everywhere |

---

## 📂 Files Included

| File | Concept Demonstrated |
|------|----------------------|
| `SingleInheritanceDemo.java` | Basic inheritance |
| `MultilevelInheritanceDemo.java` | Multi-level chain |
| `HierarchicalInheritanceDemo.java` | Multiple subclasses |
| `SuperKeywordDemo.java` | Using extends & super |
| `ConstructorChainingDemo.java` | Constructor sequence |
| `MethodOverridingDemo.java` | Dynamic method dispatch |
| `PolymorphismWithInheritance.java` | Polymorphism in action |
| `AccessModifiersInheritance.java` | Visibility and scope |

---

## 🏁 Run Instructions

    ```bash
    javac SingleInheritanceDemo.java
    java SingleInheritanceDemo

---

## 🌟 Summary

- ✅ Inheritance enables code reusability
- ✅ Promotes hierarchical classification
- ✅ Supports method overriding & polymorphism
- ✅ Reduces redundancy in code
- ✅ Forms the foundation for frameworks like Spring and Hibernate
>✨ Inheritance is not about copying code — it’s about extending behavior while preserving structure.
