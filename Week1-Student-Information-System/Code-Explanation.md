# Code Explanation – Student Information System

## 1. Project Architecture

The application is organized into three Java classes. Each class has a separate responsibility.

## 2. Student.java

The 'Student' class represents an individual student.

### Responsibilities

- Stores the student's name, age, grade, Student ID, and contact information.
- Uses private fields to support encapsulation.
- Provides a constructor to initialize student objects.
- Provides getter methods to retrieve field values.
- Provides setter methods to update values and validate input.
- Allows student information to be accessed through methods.

## 3. StudentManager.java

The 'StudentManager' class manages student records.

### Responsibilities

- Maintains an 'ArrayList<Student>' to store student objects.
- Adds new student records.
- Displays all student records in a formatted table.
- Searches for students using Student ID.
- Updates existing student details.
- Deletes student records.
- Checks whether a Student ID already exists.

## 4. Main.java

The 'Main' class provides the user interface.

### Responsibilities

- Creates a 'Scanner' object to accept keyboard input.
- Displays the menu options.
- Uses conditional statements to process the selected option.
- Calls the appropriate 'StudentManager' methods.
- Repeats the menu until the user selects Exit.

## 5. Concepts Used

### Encapsulation

Private fields protect student data from direct access. Public getter and setter methods provide controlled access.

### Classes and Objects

The 'Student' class defines student data, and each 'Student' object represents an individual student.

### ArrayList

'ArrayList<Student>' stores multiple student objects and allows records to be added and removed dynamically.

### Loops and Conditional Statements

Loops process menu choices and student records. Conditional statements validate input and determine whether a student exists.

### Exception and Input Handling

The application checks user input and displays messages for invalid information. Numeric input handling can be improved further by catching exceptions such as 'InputMismatchException'.

## 6. Data Flow

1. The user selects an option in 'Main.java'.
2. 'Main.java' collects the required input.
3. 'StudentManager.java' performs the requested operation.
4. 'Student.java' stores or updates the student's information.
5. The result is displayed in the console.

## 7. Current Limitation

Student records are stored in memory using an ArrayList. They are lost when the application terminates because file or database persistence has not been implemented.
