# 🧩 Topic: The `static` Keyword

## 🎯 Objective
To understand how **static members** belong to a class rather than an instance.

---

## 📘 Key Concepts

| Concept | Description |
|----------|--------------|
| `static` variable | Shared across all objects of a class |
| `static` method | Can be called without creating an object |
| `static` block | Executes once when the class is loaded |
| Instance vs Static | Instance → unique per object, Static → shared globally |

---

## 💡 Why Use `static`?
- ✅ Saves memory by sharing data across objects  
- ✅ Useful for utility methods (e.g., `Math.pow()`)  
- ✅ Enables pre-initialization (via static blocks)  
- ✅ Common in helper classes, constants, and factory patterns  

---

## 📂 Files Included
| File | Concept Demonstrated |
|------|----------------------|
| `StaticVariableExample.java` | Shared class variable |
| `StaticMethodExample.java` | Class-level methods |
| `StaticBlockExample.java` | Static initialization block |
| `StaticVsInstanceComparison.java` | Difference between static and instance data |

---

## 🧠 Takeaways
✅ Static = shared, Instance = unique  
✅ Static methods don’t need objects  
✅ Static blocks run once during class load  
✅ Great for constants and utilities  

---

## 🏁 Run Instructions
```bash
javac StaticVariableExample.java
java StaticVariableExample

javac StaticMethodExample.java
java StaticMethodExample

javac StaticBlockExample.java
java StaticBlockExample

javac StaticVsInstanceComparison.java
java StaticVsInstanceComparison
