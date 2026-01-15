# Java Member Inner Class – Car and Engine Example Program

This repository contains a Java program that demonstrates the use of a **member inner class** using a car and engine example.  
It is intended for beginners who are learning inner classes and how they help model strong relationships between objects in Java.

---

## 📌 Program Overview

The program models a **Car–Engine relationship**, where an engine is an inseparable part of a car.  
The `Engine` class is defined as a **member inner class** inside the `Car` class, showing that an engine cannot exist independently without a car.

This example closely represents a real-world scenario.

---

## 🧪 Code Functionality

- Defines an outer class `Car` that:
  - Stores car model information
  - Maintains engine state (`on` / `off`)
- Defines a **member inner class** `Engine` that:
  - Starts and stops the engine
  - Directly accesses private members of the `Car` class
- Creates the inner class object using an outer class instance.
- Demonstrates how inner classes can control and modify outer class state.
- Displays engine status messages on the console.

---

## 🖥️ Output

The program output is shown below:

![Program Output](output.png)

---

## 📂 File Information

- `Car.java` — Outer class with member inner class `Engine`
- `Test3.java` — Main test class
- `output.png` — Screenshot of the program output
- `README.md` — Project documentation

---

## 👨‍💻 Author

**Tejas Halvankar**  
📧 Email: `tejashalvankar0@gmail.com`  
🌐 GitHub: [Tejas-H01](https://github.com/Tejas-H01)

