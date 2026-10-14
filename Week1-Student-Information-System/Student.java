public class Student {

    private String name;
    private int age;
    private double grade;
    private String studentId;
    private String contact;

public Student(String name, int age, double grade, String studentId, String contact) {
    this.name = name;
    this.age = age;
    this.grade = grade;
    this.studentId = studentId;
    this.contact = contact;
}

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getGrade() {
        return grade;
    }
    public String getStudentId() {
        return studentId;
    }
    public String getContact() {
        return contact;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        } else {
            System.out.print("Age should be greater than 0");
        }
    }
    public void setGrade(double grade) {
        System.out.println("Please provide the grade between 0-10 only");
        if(grade >= 0 && grade <= 10) {
            this.grade = grade;
        } else {
            System.out.print("Grade should must be between 0 and 100");
        }
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public void setContact(String contact) {
        if(contact != null && contact.matches("\\d{10}")) {
            setContact(contact);
        } else {
            System.out.print("Your contact must be equal to 10 digits");
        }
    }


    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Student ID: " + studentId);
        System.out.println("Contact: " + contact);
    }    
}
