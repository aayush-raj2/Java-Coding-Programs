# 🧩 Topic: The `this` Keyword

## 🎯 Objective
To understand how the **`this` keyword** helps refer to the current object and its uses in Java.

---

## 📘 Key Uses of `this`

| Use Case | Description |
|-----------|--------------|
| 1️⃣ Referring to current object | Accesses instance variables when shadowed by parameters |
| 2️⃣ Calling another constructor | Enables constructor chaining using `this()` |
| 3️⃣ Passing as argument | Passes the current object to another method or constructor |

---

## 💡 Why It Matters
Without `this`, you can easily get naming conflicts between local and instance variables.  
It also helps in **code reusability** and **avoiding redundancy** in constructors.

---

## 📂 Files Included
| File | Concept Demonstrated |
|------|----------------------|
| `ThisKeywordExample.java` | Resolving variable shadowing |
| `ThisKeywordConstructorChaining.java` | Constructor chaining using `this()` |
| `ThisAsMethodArgument.java` | Passing current object as argument |

---

## 🧠 Takeaways
✅ `this` → refers to the current object  
✅ `this()` → calls another constructor in the same class  
✅ Avoids variable shadowing  
✅ Improves code clarity and reusability  

---

## 🏁 Run Instructions
```bash
javac ThisKeywordExample.java
java ThisKeywordExample

javac ThisKeywordConstructorChaining.java
java ThisKeywordConstructorChaining

javac ThisAsMethodArgument.java
java ThisAsMethodArgument
