package inheritance;

//Superclass
class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

//Subclass: Teacher
class Teacher extends Person {
	String subject;

	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	public void displayRole() {
		System.out.println("Role: Teacher");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Subject: " + subject);
		System.out.println();
	}
}

//Subclass: Student
class Student extends Person {
	String grade;

	public Student(String name, int age, String grade) {
		super(name, age);
		this.grade = grade;
	}

	public void displayRole() {
		System.out.println("Role: Student");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Grade: " + grade);
		System.out.println();
	}
}

//Subclass: Staff
class Staff extends Person {
	String department;

	public Staff(String name, int age, String department) {
		super(name, age);
		this.department = department;
	}

	public void displayRole() {
		System.out.println("Role: Staff");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Department: " + department);
		System.out.println();
	}
}

//Main class
public class SchoolSystem {
	public static void main(String[] args) {
		Teacher teacher = new Teacher("Mr. Sharma", 40, "Mathematics");
		Student student = new Student("Anita", 16, "10th Grade");
		Staff staff = new Staff("Ravi", 35, "Administration");

		teacher.displayRole();
		student.displayRole();
		staff.displayRole();
	}
}