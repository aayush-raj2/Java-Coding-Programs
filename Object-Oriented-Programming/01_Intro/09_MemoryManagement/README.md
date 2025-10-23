# 🧩 Topic: Memory Management in Java

## 🎯 Objective
To understand how Java handles **object memory allocation**, **references**, and **garbage collection** automatically using the JVM.

---

## 📘 Key Concepts

| Concept | Description |
|----------|--------------|
| **Stack Memory** | Stores local variables and method call information |
| **Heap Memory** | Stores objects created using `new` |
| **Garbage Collection (GC)** | Automatic process that reclaims memory of objects no longer referenced |
| **finalize()** | Deprecated method once used for cleanup before object destruction |

---

## 🧠 How Memory Works in Java

1. When a new object is created → stored in **Heap**.  
2. Reference variable (pointer) is stored in **Stack**.  
3. If the reference is reassigned or goes out of scope → object becomes **unreachable**.  
4. JVM automatically reclaims that memory via **Garbage Collector**.  

---

## ⚙️ Code Summary

| File | Concept Demonstrated |
|------|----------------------|
| `ObjectLifecycleExample.java` | Object creation, nullification, GC lifecycle |
| `ReferenceBehaviorExample.java` | Shared references and independent variables |
| `MemoryDiagramSimulation.java` | Stack vs Heap behavior |
| `GarbageCollectionDemo.java` | Temporary object destruction after scope end |

---

## 🧩 Visualization

**Stack (references) Heap (objects)**

- Car car1 ---> [Object@1 - "BMW X5"]
- Car car2 ---> [Object@2 - "Audi A6"]

* car1 = car2
- Now both point to [Object@2 - "Audi A6"]
- Object@1 becomes eligible for GC


---

## 💡 Why It Matters

- 🧹 Java manages memory **automatically** — no manual `free()` required.  
- ⚙️ Prevents memory leaks and crashes.  
- 🧩 Supports safe and efficient runtime behavior.  
- 💀 Ensures unused objects don’t consume resources.

---

## ✅ Takeaways

✅ Stack → References & method calls  
✅ Heap → Actual object data  
✅ GC → Frees unreferenced objects  
✅ finalize() → Deprecated; avoid using  
✅ JVM decides when GC runs  

---

## 🏁 Run Instructions

```bash
javac ObjectLifecycleExample.java
java ObjectLifecycleExample

javac ReferenceBehaviorExample.java
java ReferenceBehaviorExample

javac MemoryDiagramSimulation.java
java MemoryDiagramSimulation

javac GarbageCollectionDemo.java
java GarbageCollectionDemo
