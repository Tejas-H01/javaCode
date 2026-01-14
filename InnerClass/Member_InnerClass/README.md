# Java Member Inner Class – Concept & Practice Guide

This folder contains Java programs that demonstrate the concept of **Member Inner Classes**.  
It is intended for beginners who are learning how inner classes work and how they are used to model strong relationships between classes in Java.

---

## 📌 Program Overview

A **Member Inner Class** is a class that is defined **inside another class**, but outside of any method.  
It is called a *member* inner class because it behaves like a member (field or method) of the outer class.

Member inner classes are used when:
- One class **logically belongs** to another class
- The inner class needs **direct access** to the outer class’s data

Examples used in this folder include:
- Bank account and transactions
- Course and student enrollment

---

## 🧠 What is a Member Inner Class? (Beginner Explanation)

In simple words:

> A member inner class represents something that **cannot exist on its own** without the outer class.

Examples:
- A **Transaction** cannot exist without a **Bank Account**
- An **Enrollment** cannot exist without a **Course**

Because of this relationship:
- The inner class can access **private variables** of the outer class
- The inner class object is created using an **outer class object**

---

## 🧪 Code Functionality

The programs in this folder demonstrate:

- Definition of a **member inner class**
- Creation of inner class objects using:
  - `OuterClass.InnerClass obj = outerObj.new InnerClass()`
- Access to private members of the outer class from the inner class
- Use of constructors in both outer and inner classes
- Real-world modeling using class relationships

These examples show why member inner classes are useful and when they should be preferred.

---

## 🖥️ Output

Each program prints output to the console showing:
- Data from the outer class
- Data from the inner class
- How both work together during execution

Output screenshots are included in individual program folders.

---

## 📂 File Information

This folder contains multiple examples demonstrating **member inner classes**.  
Each example includes:
- Java source files
- A dedicated `README.md`
- Output screenshots for reference

---

## 👨‍💻 Author

**Tejas Halvankar**  
📧 Email: `tejashalvankar0@gmail.com`  
🌐 GitHub: [Tejas-H01](https://github.com/Tejas-H01)

