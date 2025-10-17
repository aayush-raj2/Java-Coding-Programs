# 🧩 Topic: `instanceof` and Type Casting in Java

## 🎯 Objective
To understand how Java handles **type relationships** between classes and data types.

---

## 📘 Key Concepts

| Concept | Description |
|----------|--------------|
| `instanceof` | Checks the runtime type of an object |
| Upcasting | Child object → Parent reference (safe & implicit) |
| Downcasting | Parent reference → Child type (explicit & risky) |
| Widening | Automatic primitive conversion (int → double) |
| Narrowing | Manual primitive conversion (double → int) |

---

## 💡 Why It Matters
- Ensures **type safety** at runtime  
- Prevents **ClassCastException**  
- Helps work with **polymorphism** correctly  
- Enables data conversion between types  

---

## 📂 Files Included
| File | Concept Demonstrated |
|------|----------------------|
| `InstanceOfExample.java` | Runtime type checking |
| `UpcastingExample.java` | Safe upcasting demo |
| `DowncastingExample.java` | Safe downcasting with instanceof |
| `PrimitiveTypeCastingExample.java` | Widening & narrowing primitive casts |

---

## 🧠 Takeaways
✅ Use `instanceof` before downcasting  
✅ Upcasting = automatic, safe  
✅ Downcasting = explicit, risky  
✅ Widening = automatic  
✅ Narrowing = manual  
✅ Type casting supports flexibility in polymorphism  

---

## 🏁 Run Instructions
```bash
javac InstanceOfExample.java
java InstanceOfExample

javac UpcastingExample.java
java UpcastingExample

javac DowncastingExample.java
java DowncastingExample

javac PrimitiveTypeCastingExample.java
java PrimitiveTypeCastingExample
