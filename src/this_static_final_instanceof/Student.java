package this_static_final_instanceof;

public class Student {
    // Static variable shared by all students
    private static String universityName = "ABC University";
    private static int totalStudents = 0;

    // Final variable - cannot be changed
    private final int rollNumber;

    // Instance variables
    private String name;
    private char grade;

    // Constructor using 'this'
    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    // Static method to display total students
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // Method to display student details using instanceof
    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
            System.out.println("-----------");

        }
    }

    // Method to update grade if object is a Student
    public void updateGrade(char newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated for " + name + " to " + grade);
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101, 'A');
        Student s2 = new Student("Bob", 102, 'B');

        s1.displayStudentDetails();
        s2.displayStudentDetails();

        s2.updateGrade('A');

        displayTotalStudents();
    }
}