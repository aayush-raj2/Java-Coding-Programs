# 🧩 UML (Unified Modeling Language) — Concept Introduction

## 🧠 Overview
**UML (Unified Modeling Language)** is a standardized modeling language used to visualize, specify, construct, and document a system’s structure and behavior.

It provides **blueprints** for developers and designers — helping convert *ideas* into *structured, maintainable software.*

---

## 📈 Purpose
- Capture **system design** before coding.  
- Clarify **relationships** among classes and objects.  
- Improve **team communication** and reduce design errors.

---

## ⚙️ UML Relationships in Java

| Relationship | Symbol | Example | Description |
|---------------|---------|----------|--------------|
| **Association** | → | `Customer → Order` | A Customer places one or more Orders |
| **Aggregation** | ◇ | `OrderItem ◇→ Product` | An OrderItem uses an existing Product |
| **Composition** | ◆ | `Order ◆→ OrderItem` | An Order is composed of its OrderItems (lifespan dependent) |

---

## 🧱 UML Diagram Types

| Type | Focus | Example |
|------|--------|---------|
| **Class Diagram** | Static structure | Classes, attributes, methods, relationships |
| **Object Diagram** | Runtime snapshot | Instances and their links |
| **Sequence Diagram** | Message flow | Interactions over time between objects |

---

## 🛍️ Case Study — *Online Shopping System*

### Classes:
- `Customer` — places Orders  
- `Order` — contains `OrderItems`  
- `OrderItem` — references `Product`  
- `Product` — represents store items  

Relationships:
Customer → Order ◆→ OrderItem ◇→ Product  

---

## 🧩 UML-to-Code Mapping (Java)

| UML Element | Java Equivalent |
|--------------|----------------|
| Class | `class Customer { ... }` |
| Attribute | `private int id;` |
| Operation | `public void placeOrder()` |
| Association | Field or reference |
| Composition | Object creation inside parent |
| Aggregation | Object reference passed as parameter |

---

## ✅ Key Takeaways
✅ UML provides a **visual grammar** for object-oriented systems.  
✅ Helps plan before implementation.  
✅ Prevents redundant or confusing relationships.  
✅ Converts easily into maintainable Java code.

---

> ✨ “UML is not just drawing — it’s *thinking in design* before *writing in code.*” ✨
