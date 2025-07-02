package workshop;
import java.util.Scanner;

public class StudentGradingSystem {
    static final int MAX_SUBJECTS = 5; // example: 5 subjects
    static final int MAX_STUDENTS = 3; // example: 3 students

    static class Student {
        String name;
        String id;
        Integer[] grades = new Integer[MAX_SUBJECTS];

        Student(String name, String id) {
            this.name = name;
            this.id = id;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[MAX_STUDENTS];

        // Input student details and grades
        for (int i = 0; i < MAX_STUDENTS; i++) {
            System.out.println("Enter details for Student " + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("ID: ");
            String id = sc.nextLine();
            Student student = new Student(name, id);

            for (int j = 0; j < MAX_SUBJECTS; j++) {
                System.out.print("Enter grade for Subject " + (j + 1) + ": ");
                try {
                    String input = sc.nextLine();
                    if (input.isEmpty()) {
                        student.grades[j] = null; // mark as incomplete
                    } else {
                        int grade = Integer.parseInt(input);
                        if (grade < 0 || grade > 100) {
                            throw new IllegalArgumentException("Grade must be between 0 and 100.");
                        }
                        student.grades[j] = grade;
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input: " + e.getMessage());
                    j--; // repeat the same subject
                }
            }

            students[i] = student;
        }

        // Calculations
        calculateStudentTotals(students);
        calculateHighestPerSubject(students);
        calculateClassAverage(students);
    }

    static void calculateStudentTotals(Student[] students) {
        System.out.println("\nTotal and Average Grade per Student:");
        for (Student student : students) {
            int total = 0;
            int count = 0;
            for (Integer grade : student.grades) {
                if (grade != null) {
                    total += grade;
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(student.name + " (" + student.id + "): No grades entered.");
            } else {
                double avg = (double) total / count;
                System.out.printf("%s (%s): Total = %d, Average = %.2f\n", student.name, student.id, total, avg);
            }
        }
    }

    static void calculateHighestPerSubject(Student[] students) {
        System.out.println("\nHighest Grade per Subject:");
        for (int i = 0; i < MAX_SUBJECTS; i++) {
            int maxGrade = -1;
            boolean found = false;
            for (Student student : students) {
                if (student.grades[i] != null) {
                    maxGrade = Math.max(maxGrade, student.grades[i]);
                    found = true;
                }
            }
            if (found) {
                System.out.println("Subject " + (i + 1) + ": " + maxGrade);
            } else {
                System.out.println("Subject " + (i + 1) + ": No grades available.");
            }
        }
    }

    static void calculateClassAverage(Student[] students) {
        System.out.println("\nClass Average:");
        int total = 0;
        int count = 0;
        for (Student student : students) {
            for (Integer grade : student.grades) {
                if (grade != null) {
                    total += grade;
                    count++;
                }
            }
        }

        if (count == 0) {
            System.out.println("No grades to calculate class average.");
        } else {
            double avg = (double) total / count;
            System.out.printf("Overall Class Average: %.2f\n", avg);
        }
    }
}