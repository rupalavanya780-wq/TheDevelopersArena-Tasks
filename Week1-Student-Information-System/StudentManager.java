import java.util.ArrayList;
public class StudentManager {
  ArrayList<Student> std = new ArrayList<>();


  public void addStudent(Student students) {
    std.add(students);
  }
  

  public void viewStudent() {
    if (std.isEmpty()) {
        System.out.println("No student is available");
        return;
    }

    System.out.println("\n=== ALL STUDENTS ===");
    System.out.printf("%-15s %-20s %-8s %-8s %-20s%n",
            "Student ID", "Name", "Age", "Grade", "Contact");

    System.out.println("--------------------------------------------------------------------------");

    for (Student x : std) {
        System.out.printf("%-15s %-20s %-8d %-8.2f %-20s%n",
                x.getStudentId(),
                x.getName(),
                x.getAge(),
                x.getGrade(),
                x.getContact());
     /* System.out.println("Name: " + x.getName());
      System.out.println("Age: " + x.getAge());
      System.out.println("Grade: " + x.getGrade());
      System.out.println("Student ID: " + x.getStudentId());
      System.out.println("Contact: " + x.getContact());*/
  }
  }



  public boolean isStudentIdExists(String studentId) {
    for (Student x : std) {
        if (x.getStudentId().equals(studentId)) {
            return true;
        }
    }
    return false;
}


  public void deleteStudentId(String studentId) {
    boolean found = false;
    for(Student x : std) {
      if(x.getStudentId().equals(studentId)) {
        found = true;
        std.remove(x);
        break;
      } 
    }
      if(!found) {
        System.out.println("No such student Id");
    }
  }

  public void searchStudentId(String studentId) {
    boolean found = false;
    for(Student x : std) {
      if(x.getStudentId().equals(studentId)) {
        found = true;
      System.out.println("Name: " + x.getName());
      System.out.println("Age: " + x.getAge());
      System.out.println("Grade: " + x.getGrade());
      System.out.println("Student ID: " + x.getStudentId());
      System.out.println("Contact: " + x.getContact());
      break;
      }
    } if(!found) {
      System.out.println("No such student Id");
    }
  }

  public void editStudent(String studentId, int age, double grade, String name, String contact) {
    boolean found = false;
    for(Student x : std) {
      if(x.getStudentId().equals(studentId)) {
        found = true;
        x.setName("Name: " + name);
        x.setAge( age);
        x.setGrade(grade);
        x.setContact("Contact: " + contact);
      break;
        }
    
      if(!found) {
        System.out.println("No such that student");
      break;
    
      }}
  }
  }