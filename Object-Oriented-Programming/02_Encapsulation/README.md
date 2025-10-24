# 🧩 Topic: Encapsulation in Java

## 🎯 Objective
To understand how **Encapsulation** protects data by restricting direct access and providing controlled interfaces through methods.

---

## 📘 Key Concepts

| Concept | Description |
|----------|--------------|
| **Encapsulation** | Bundling data and methods in a single unit (class). |
| **Access Modifiers** | Define visibility: `private`, `protected`, `public`. |
| **JavaBean** | Follows naming conventions and provides reusability. |
| **Immutable Class** | Once created, its data cannot be changed. |

---

## 🔒 Access Modifiers Summary

| Modifier | Scope |
|-----------|--------|
| `private` | Accessible only within the same class |
| `default` | Accessible within the same package |
| `protected` | Accessible within the same package and subclasses |
| `public` | Accessible from anywhere |

---

## 💡 Why Encapsulation Matters

- Protects internal object data from unauthorized modification  
- Provides controlled access via getters/setters  
- Enables **data hiding** and **security**  
- Promotes **reusability** and **maintainability**

---

## 📂 Files Included

| File | Concept Demonstrated |
|------|----------------------|
| `AccessModifierDemo.java` | Demonstrates visibility using access modifiers |
| `EncapsulationExample.java` | Core example using private fields and methods |
| `JavaBeanExample.java` | JavaBeans standard for reusable components |
| `ImmutableClassExample.java` | Creating immutable (read-only) classes |

---

## 🧠 Takeaways

✅ Encapsulation = data hiding + controlled access  
✅ Access modifiers protect internal state  
✅ JavaBeans make encapsulation reusable  
✅ Immutable classes ensure complete data security  

---

## 🏁 Run Instructions

```bash
javac AccessModifierDemo.java
java AccessModifierDemo

javac EncapsulationExample.java
java EncapsulationExample

javac JavaBeanExample.java
java JavaBeanExample

javac ImmutableClassExample.java
java ImmutableClassExample
