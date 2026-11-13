# Grade Management System (Java)

A console-based Java project for storing student marks, calculating averages and grades, searching student records, and generating a class performance report.

## Features

- Stores up to 100 students in arrays.
- Stores five subject marks for each student in a two-dimensional array.
- Adds and displays student records.
- Calculates average, highest mark, and lowest mark.
- Assigns grades A, B, C, D, or F.
- Finds the top performer.
- Searches for a student by name (case-insensitive).
- Generates subject averages, class average, grade distribution, and top performer.
- Validates menu choices and marks using `try-catch`.

## Requirements

- JDK 8 or later.
- A terminal/command prompt or Java IDE such as IntelliJ IDEA, Eclipse, or VS Code with Java support.

## Project structure

```text
GradeManagementSystem/
├── src/
│   ├── GradeManagementSystem.java
│   ├── GradeCalculator.java
│   └── ReportGenerator.java
├── docs/
│   ├── INSTALLATION.md
│   ├── USER_MANUAL.md
│   ├── TECHNICAL_DETAILS.md
│   └── TEST_CASES.md
├── examples/
│   ├── sample-data.csv
│   └── sample-output.txt
└── README.md
```

## Compile and run

Open a terminal in the `GradeManagementSystem` folder.

```bash
javac -d out src/*.java
java -cp out GradeManagementSystem
```

On Windows PowerShell, the same commands work when a JDK is installed and `javac` is on PATH.

## Grade boundaries

| Average | Grade |
|---|---|
| 90 to 100 | A |
| 80 to below 90 | B |
| 70 to below 80 | C |
| 60 to below 70 | D |
| Below 60 | F |

## Important note about storage

This version stores records in arrays while the program is running. Records are cleared when the application exits. The CSV file in `examples/` is sample reference data only; automatic file saving/loading is not implemented in this version.

See `docs/` for installation, usage, technical details, and test cases.
