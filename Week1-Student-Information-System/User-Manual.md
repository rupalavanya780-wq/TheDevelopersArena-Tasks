# User Manual – Student Information System

## 1. Introduction

The Student Information System is a menu-driven Java console application that helps users manage student records.

## 2. Starting the Application

Run the application using:

java Main

The menu displays the available operations.

## 3. Menu Options

### Option 1: Add Student

- Enter the student's name, age, grade, Student ID, and contact number.
- The application validates the entered information.
- Duplicate Student IDs are rejected.
- A student is added after the required information passes validation.

### Option 2: View Student Details

- Displays all stored students in a formatted table.
- Shows Student ID, name, age, grade, and contact information.
- Displays a message if no students are available.

### Option 3: Search Student

- Enter the Student ID to search.
- The application displays the student's details if found.
- Otherwise, it displays a not-found message.

### Option 4: Edit Student Details

- Enter the Student ID of the student to update.
- If the student exists, enter the new details.
- If the ID does not exist, the application displays a not-found message.

### Option 5: Remove Student

- Enter the Student ID of the student to remove.
- The student is deleted if found.
- Otherwise, the application displays a not-found message.

### Option 6: Exit

- Exits the application.

## 4. Input Validation

The application validates student information, including age, grade, contact number, and duplicate Student IDs.

- Age must be greater than zero.
- Grade must be within the range 0–100.
- Contact numbers must contain exactly 10 digits.
- Student IDs must be unique.

## 5. Data Storage

Student records are stored in an 'ArrayList' while the application is running. The records are not permanently saved to a file or database.

## 6. Tips for Users

- Enter the correct Student ID when searching, editing, or deleting a student.
- Follow the validation messages when entering information.
- Use the Exit option to close the application.
