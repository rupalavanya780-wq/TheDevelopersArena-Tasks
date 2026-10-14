import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        StudentManager sm = new StudentManager();

        System.out.println("========Student Information System========");
        System.out.println("1. Add Student");
        System.out.println("2. View Student Details");
        System.out.println("3. Search by student Id");
        System.out.println("4. Edit the Student details");
        System.out.println("5. Remove the Student");
        System.out.println("6. Exit");

        System.out.print("Enter you Choice: ");

        while(true) {
          int number = sc.nextInt();
          if(number == 1) {
            System.out.println();
            System.out.println("====Adding====");
            sc.nextLine();
            System.out.print("Enter the student name: ");
        String name = sc.nextLine();
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        System.out.print("Enter the student grade(1-10): ");
        double grade = sc.nextDouble();


         while (grade > 10 || grade < 1) {
          System.out.print("Grade must and should between 1 and 10.");
          System.out.print("Please enter a correct Grade(1-10):");
          grade = sc.nextDouble();
        }


        System.out.print("Enter the student Id: ");
        String studentId = sc.next();


        while (sm.isStudentIdExists(studentId)) {
    System.out.print("Student ID " + studentId + " already exists.");
    System.out.print("Please enter a different Student ID:");
    studentId = sc.next();
}


        System.out.print("Enter the student contact number: ");
        String contact = sc.next();
        

        while (!contact.matches("\\d{10}")) {
    System.out.println("Invalid contact number. It must contain exactly 10 digits.");
    System.out.print("Enter the student contact number again: ");
    contact = sc.next();
}

        
        Student obj = new Student(name, age, grade, studentId, contact);
        sm.addStudent(obj);
        System.out.println("Adding new student was Successfully completed");

        System.out.println();
        System.out.println("1. Add Student");
        System.out.println("2. View Student Details");
        System.out.println("3. Search by student Id");
        System.out.println("4. Edit the Student details");
        System.out.println("5. Remove the Student");
        System.out.println("6. Exit");
 System.out.print("Enter you Choice: ");
          }


          else if(number == 2) {
            System.out.println();
            System.out.println("====Viewing====");
            sm.viewStudent();
System.out.println();
            System.out.println("1. Add Student");
        System.out.println("2. View Student Details");
        System.out.println("3. Search by student Id");
        System.out.println("4. Edit the Student details");
        System.out.println("5. Remove the Student");
        System.out.println("6. Exit");
         System.out.print("Enter you Choice: ");
          }


          else if(number == 3) {
            System.out.println();
            System.out.println("====Searching====");
            System.out.print("Enter student Id: ");
            String studentId = sc.next();
            sm.searchStudentId(studentId);
            System.out.println();
            System.out.println("1. Add Student");
        System.out.println("2. View Student Details");
        System.out.println("3. Search by student Id");
        System.out.println("4. Edit the Student details");
        System.out.println("5. Remove the Student");
        System.out.println("6. Exit");
         System.out.print("Enter you Choice: ");
          }


          else if(number == 4) {
            System.out.println();
            System.out.println("====Editing====");
            System.out.print("Enter the student Id: ");
            String studentId = sc.next();
            sc.nextLine(); 
             System.out.print("Enter the student name: ");
        String name = sc.nextLine();
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        System.out.print("Enter the student grade: ");
        double grade = sc.nextDouble();
        System.out.print("Enter the student contact number: ");
        String contact = sc.next();




         if (contact.matches("\\d{10}")) {
          sm.editStudent(studentId, age, grade, name, contact);
        System.out.println("Successfully updated student details!");
    } else {
        System.out.println("Invalid contact number. It must contain exactly 10 digits.");
    }

System.out.println();

             System.out.println("1. Add Student");
        System.out.println("2. View Student Details");
        System.out.println("3. Search by student Id");
        System.out.println("4. Edit the Student details");
        System.out.println("5. Remove the Student");
        System.out.println("6. Exit");
         System.out.print("Enter you Choice: ");
          }

          else if(number == 5) {
            System.out.println();
            System.out.println("====Deleting====");
            System.out.print("Enter the student Id for removing: ");
            String studentId = sc.next();
            sm.deleteStudentId(studentId);
            System.out.println("Successfully deleted");
            System.out.println();
            System.out.println("1. Add Student");
        System.out.println("2. View Student Details");
        System.out.println("3. Search by student Id");
        System.out.println("4. Edit the Student details");
        System.out.println("5. Remove the Student");
        System.out.println("6. Exit");
         System.out.print("Enter you Choice: ");
          }

          else if(number == 6) {
            break;
          }

          else {
            System.out.println("You must select from 1 - 6 only");
            System.out.println();
            System.out.println("1. Add Student");
        System.out.println("2. View Student Details");
        System.out.println("3. Search by student Id");
        System.out.println("4. Edit the Student details");
        System.out.println("5. Remove the Student");
        System.out.println("6. Exit");
         System.out.print("Enter you Choice: ");
          }
        }
    }
}