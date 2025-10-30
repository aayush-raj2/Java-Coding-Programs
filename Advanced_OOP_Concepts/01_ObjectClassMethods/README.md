# ☕ Object Class Methods in Java

## 🎯 Objective
To understand methods inherited from the `Object` class and how they define object identity, comparison, and representation.

---

## 📘 Common Methods

| Method | Description |
|---------|--------------|
| `toString()` | Converts object to human-readable form |
| `equals()` | Checks logical equality |
| `hashCode()` | Returns hash-based identifier |
| `getClass()` | Reveals runtime class info |
| `clone()` | Creates shallow or deep copy |
| `finalize()` | Called before GC (deprecated) |

---

## 🧠 Rules
- All classes implicitly extend `Object`.
- Override `equals()` and `hashCode()` together.
- Prefer deep cloning for immutable structures.

---

## 🧩 Practical Uses
- `equals()` → Collection comparisons  
- `hashCode()` → HashMap keys  
- `toString()` → Logging  
- `clone()` → Duplication  

---

> ✨ “Every class is an Object — know it, and you master inheritance.” ✨
