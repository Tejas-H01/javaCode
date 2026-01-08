# Java JDBC – PostgreSQL Database Example Program

This repository contains a Java program that demonstrates how to connect to a **PostgreSQL database** using **JDBC** and retrieve data from a table.  
It is intended for beginners who are learning database connectivity and basic SQL operations in Java.

---

## 📌 Program Overview

The program establishes a connection to a PostgreSQL database, executes a SQL query to fetch employee data, and displays the retrieved information on the console.

It demonstrates how Java applications interact with relational databases using JDBC APIs.

---

## 🧪 Code Functionality

- Uses JDBC classes from `java.sql` package.
- Establishes a database connection using:
  - JDBC URL
  - Username and password
- Executes a `SELECT` SQL query using a `Statement`.
- Retrieves data from the database using a `ResultSet`.
- Reads column values such as:
  - Employee ID
  - First name and last name
  - Email
  - Department
  - Salary
  - Hire date
- Displays the fetched employee details on the console.
- Closes the database connection after execution.

---

## 🖥️ Output

The program output is shown below:

![Program Output](output.png)

---

## 📂 File Information

- `Main.java` — Java source code
- `output.png` — Screenshot of the program output
- `README.md` — Project documentation

---

## 👨‍💻 Author

**Tejas Halvankar**  
📧 Email: `tejashalvankar0@gmail.com`  
🌐 GitHub: [Tejas-H01](https://github.com/Tejas-H01)

