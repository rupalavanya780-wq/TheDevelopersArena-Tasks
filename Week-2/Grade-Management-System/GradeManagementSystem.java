import java.util.Scanner;

public class GradeManagementSystem {

    private static final int MAX_STUDENTS = 100;
    private static final String[] SUBJECTS = {
        "Mathematics", "Science", "English", "History", "Computer"
    };

    // Parallel arrays store each student's name and subject marks.
    private static final String[] studentNames = new String[MAX_STUDENTS];
    private static final double[][] studentMarks =
            new double[MAX_STUDENTS][SUBJECTS.length];

    private static int studentCount = 0;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        System.out.println("Welcome to the Grade Management System!");

        while (running) {
            displayMenu();
            int choice = readInt("Enter your choice: ", 1, 7);

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewAllStudents();
                    break;
                case 3:
                    showStudentAverages();
                    break;
                case 4:
                    showTopPerformer();
                    break;
                case 5:
                    searchStudent();
                    break;
                case 6:
                    ReportGenerator.generateReport(
                            studentNames, studentMarks, studentCount, SUBJECTS);
                    break;
                case 7:
                    running = false;
                    System.out.println("Thank you for using the system. Goodbye!");
                    break;
                default:
                    // readInt() already restricts the choice to 1-7.
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\n========== GRADE MANAGEMENT SYSTEM ==========");
        System.out.println("1. Add student marks");
        System.out.println("2. View all students");
        System.out.println("3. Calculate student averages and grades");
        System.out.println("4. Find top performer");
        System.out.println("5. Search student");
        System.out.println("6. Generate performance report");
        System.out.println("7. Exit");
        System.out.println("=============================================");
    }

    private static void addStudent() {
        if (studentCount >= MAX_STUDENTS) {
            System.out.println("The maximum limit of 100 students has been reached.");
            return;
        }

        System.out.print("Enter student name: ");
        String name = scanner.nextLine().trim();

        while (name.isEmpty()) {
            System.out.print("Name cannot be empty. Enter student name: ");
            name = scanner.nextLine().trim();
        }

        studentNames[studentCount] = name;

        System.out.println("Enter marks from 0 to 100:");
        for (int subject = 0; subject < SUBJECTS.length; subject++) {
            studentMarks[studentCount][subject] =
                    readMark(SUBJECTS[subject] + " marks: ");
        }

        studentCount++;
        System.out.println("Student marks added successfully!");
    }

    private static void viewAllStudents() {
        if (!hasStudents()) {
            return;
        }

        System.out.printf("%-20s", "Student Name");
        for (String subject : SUBJECTS) {
            System.out.printf("%-14s", subject);
        }
        System.out.printf("%-10s%n", "Average");

        for (int student = 0; student < studentCount; student++) {
            System.out.printf("%-20s", studentNames[student]);

            for (int subject = 0; subject < SUBJECTS.length; subject++) {
                System.out.printf("%-14.2f", studentMarks[student][subject]);
            }

            double average =
                    GradeCalculator.calculateAverage(studentMarks[student]);
            System.out.printf("%-10.2f%n", average);
        }
    }

    private static void showStudentAverages() {
        if (!hasStudents()) {
            return;
        }

        System.out.println("\nSTUDENT AVERAGES");
        for (int student = 0; student < studentCount; student++) {
            double average =
                    GradeCalculator.calculateAverage(studentMarks[student]);

            System.out.printf("%s | Average: %.2f | Highest: %.2f"
                            + " | Lowest: %.2f | Grade: %s%n",
                    studentNames[student],
                    average,
                    GradeCalculator.findHighest(studentMarks[student]),
                    GradeCalculator.findLowest(studentMarks[student]),
                    GradeCalculator.getGrade(average));
        }
    }

    private static void showTopPerformer() {
        if (!hasStudents()) {
            return;
        }

        int topIndex = 0;
        for (int student = 1; student < studentCount; student++) {
            if (GradeCalculator.calculateAverage(studentMarks[student])
                    > GradeCalculator.calculateAverage(studentMarks[topIndex])) {
                topIndex = student;
            }
        }

        double average = GradeCalculator.calculateAverage(studentMarks[topIndex]);
        System.out.printf("Top performer: %s | Average: %.2f | Grade: %s%n",
                studentNames[topIndex], average,
                GradeCalculator.getGrade(average));
    }

    private static void searchStudent() {
        if (!hasStudents()) {
            return;
        }

        System.out.print("Enter the student name to search: ");
        String searchName = scanner.nextLine().trim();

        boolean found = false;
        for (int student = 0; student < studentCount; student++) {
            if (studentNames[student].equalsIgnoreCase(searchName)) {
                found = true;
                double average =
                        GradeCalculator.calculateAverage(studentMarks[student]);

                System.out.println("\nStudent found: " + studentNames[student]);
                for (int subject = 0; subject < SUBJECTS.length; subject++) {
                    System.out.printf("%-15s : %.2f%n",
                            SUBJECTS[subject], studentMarks[student][subject]);
                }
                System.out.printf("Average         : %.2f%n", average);
                System.out.printf("Highest mark    : %.2f%n",
                        GradeCalculator.findHighest(studentMarks[student]));
                System.out.printf("Lowest mark     : %.2f%n",
                        GradeCalculator.findLowest(studentMarks[student]));
                System.out.println("Grade           : "
                        + GradeCalculator.getGrade(average));
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }

    private static boolean hasStudents() {
        if (studentCount == 0) {
            System.out.println("No student records found. Add a student first.");
            return false;
        }
        return true;
    }

    private static int readInt(String prompt, int min, int max) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            try {
                int value = Integer.parseInt(input);
                if (value >= min && value <= max) {
                    return value;
                }
                System.out.printf("Enter a number between %d and %d.%n", min, max);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a whole number.");
            }
        }
    }

    private static double readMark(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            try {
                double mark = Double.parseDouble(input);
                if (Double.isFinite(mark) && mark >= 0 && mark <= 100) {
                    return mark;
                }
                System.out.println("Marks must be between 0 and 100.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid mark. Please enter a numeric value.");
            }
        }
    }
}
