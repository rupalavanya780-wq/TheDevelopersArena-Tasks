# Technical Details

## Architecture

The application is separated into three Java classes:

- `GradeManagementSystem`: program entry point, arrays, menu, input validation, student entry, display, and search.
- `GradeCalculator`: reusable methods for average, highest mark, lowest mark, and grade calculation.
- `ReportGenerator`: creates the class performance report.

## Data structures

- `String[] studentNames` stores up to 100 student names.
- `double[][] studentMarks` stores five marks for each student.
- `String[] SUBJECTS` stores the five subject names.
- `studentCount` tracks how many student records have been entered.

The row index in `studentMarks` matches the index in `studentNames`. For example, `studentMarks[0]` contains the marks belonging to `studentNames[0]`.

## Main algorithms

### Average

Add all subject marks and divide the sum by the number of subjects.

### Highest and lowest

Start with the first mark, then compare each remaining mark to update the highest or lowest value.

### Grade

Compare the student's average against the grade boundaries documented in the README.

### Top performer

Calculate each student's average and keep the index of the student with the largest average.

### Search

Compare the entered name with each stored name using `equalsIgnoreCase()`.

## Concepts demonstrated

Arrays, two-dimensional arrays, `for` loops, `while` loops, `switch`, conditional statements, methods, parameters, return values, strings, formatted output, and exception handling with `try-catch`.

## Complexity

For `n` students and `s` subjects:

- Add one student: O(s).
- Display all students: O(n × s).
- Search by name: O(n).
- Generate the report: O(n × s).
- Calculate one student's average/highest/lowest: O(s).
