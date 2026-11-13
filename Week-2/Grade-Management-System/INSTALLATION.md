# Installation Guide

## 1. Install Java

Install JDK 8 or a newer JDK. Open Command Prompt or a terminal and check:

```bash
java -version
javac -version
```

Both commands should display a version. If `javac` is not recognized, configure the JDK `bin` directory in your system PATH.

## 2. Open the project

Extract the project ZIP file. Open the `GradeManagementSystem` folder in your preferred Java IDE, or open a terminal in that folder.

## 3. Compile

```bash
javac -d out src/*.java
```

The compiler creates an `out` folder containing the compiled `.class` files.

## 4. Run

```bash
java -cp out GradeManagementSystem
```

## 5. Stop the program

Choose menu option `7` to exit safely.
