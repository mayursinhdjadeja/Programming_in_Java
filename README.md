# ☕ Programming in Java

A well-organized collection of **Java practical programs** for BCA Semester 3.  
This repository contains 50 practicals covering core Java concepts, OOP, exception handling, multithreading, and JDBC — neatly arranged in unit-wise folders.

---

## 📌 About This Repository

This repo is my personal practical work for **Programming in Java**.  
The goal is simple: keep all Java practicals in one place, properly organized, and easy to run.

### ✨ Highlights

- 📂 Unit-wise folder structure
- 🧠 Beginner-friendly Java programs
- 🧵 Covers OOP, Exception Handling, Multithreading & JDBC
- 🗄️ Includes database connectivity practicals

---

## 📁 Repository Structure

```text
Programming_in_Java/
├── Unit-1/        # Java basics, OOP, arrays, loops, conditions
├── Unit-2/        # Inheritance, interfaces, packages
├── Unit-3/        # Exception handling, inner classes, date/calendar
├── Unit-4/        # Multithreading
├── Unit-5/        # JDBC / Database connectivity
└── README.md
```

---

## 🚀 Getting Started

### Prerequisites

Make sure you have:

- **Java JDK 8+** installed
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code, BlueJ)  
  **OR** a terminal to compile and run manually

Check Java installation:

```bash
java -version
javac -version
```

---

### Clone the Repository

```bash
git clone https://github.com/mayursinhdjadeja/Programming_in_Java.git
cd Programming_in_Java
```

---

### ▶️ How to Run a Program

#### Using Terminal

```bash
cd Unit-1
javac ProgramName.java
java ProgramName
```

#### Using an IDE

1. Open the repository folder in your IDE.
2. Navigate to any unit folder.
3. Open the desired `.java` file.
4. Run the program.

---

## 🗄️ JDBC Practicals Note

The **Unit-5** programs use **JDBC** to connect Java with a database.

To run them, you may need:

- Oracle Database installed and running
- `ojdbc` driver `.jar` added to the project classpath
- Correct database URL, username, and password in the source file

Example:

```java
Connection con = DriverManager.getConnection(
    "jdbc:oracle:thin:@localhost:1521:xe",
    "username",
    "password"
);
```

> Update the connection details before running JDBC programs.

---

## 🛠️ Tech Stack

- **Language:** Java
- **Concepts:** OOP, Exception Handling, Multithreading, JDBC
- **Tools:** JDK, IDE / Terminal

---

## 🤝 Contributing

This repository is mainly for my academic practicals, but suggestions are always welcome.

If you find a bug or want to improve a program:

1. Fork the repo
2. Create a new branch
3. Make your changes
4. Open a pull request

---

## 👨‍💻 Author

**Mayursinh D. Jadeja**

- GitHub: [@mayursinhdjadeja](https://github.com/mayursinhdjadeja)

---

## ⭐ Support

If this repository helped you, consider giving it a **⭐ star**.  
It motivates me to keep improving and sharing.

---

## 📄 License

This repository is created for **educational purposes**.  
You are free to use and learn from the code.
