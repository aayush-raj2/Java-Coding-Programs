# 🧩 Topic: The `final` Keyword

## 🎯 Objective
To understand how the **`final` keyword** is used to restrict modification in Java programs.

---

## 📘 Key Uses of `final`

| Type | Description |
|------|--------------|
| `final` variable | Declares a constant (cannot be reassigned) |
| `final` method | Prevents method overriding in subclasses |
| `final` class | Prevents inheritance (cannot be extended) |

---

## 💡 Why Use `final`?
- ✅ To create constants (e.g., `final double PI = 3.14`)
- ✅ To preserve method behavior across all subclasses  
- ✅ To secure classes from unintended modifications  
- ✅ To improve readability and reliability of APIs  

---

## 📂 Files Included
| File | Concept Demonstrated |
|------|----------------------|
| `FinalVariableExample.java` | Constant using `final` variable |
| `FinalMethodExample.java` | Preventing overriding using `final` method |
| `FinalClassExample.java` | Restricting inheritance using `final` class |

---

## 🧠 Takeaways
✅ `final` variable → Constant  
✅ `final` method → Cannot be overridden  
✅ `final` class → Cannot be inherited  
✅ Increases security and consistency  

---

## 🏁 Run Instructions
```bash
javac FinalVariableExample.java
java FinalVariableExample

javac FinalMethodExample.java
java FinalMethodExample

javac FinalClassExample.java
java FinalClassExample
