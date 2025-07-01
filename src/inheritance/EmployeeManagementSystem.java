package inheritance;

class Employee {
	String name;
	String id;
	int salary;
	
	// Constructor
	public Employee(String name, String id, int salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: ₹" + salary);
    }
}

class Manager extends Employee{
	int teamSize;
	
	public Manager(String name, String id, int salary, int teamSize) {
		super(name, id, salary);
		this.teamSize = teamSize;
	}
	
	@Override
	 public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Manager");
        System.out.println("Team Size: " + teamSize);
        System.out.println();
    }
}

class Developer extends Employee {
	String programmingLanguage;
	
	public Developer(String name, String id, int salary, String programmingLanguage) {
		super(name, id, salary);
		this.programmingLanguage = programmingLanguage;
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Role: Developer");
		System.out.println("Programming Language: " + programmingLanguage);
		System.out.println();
	}
}

class Intern extends Employee {
	String university;
	
	public Intern(String name, String id, int salary, String university) {
		super(name, id, salary);
		this.university = university;
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Role: Intern");
		System.out.println("University: " + university);
		System.out.println();
	}
}

public class EmployeeManagementSystem {
	public static void main(String[] args) {
		Employee manager = new Manager("Alice", "M001", 80000, 10);
		Employee developer = new Developer("Bob", "D002", 60000, "Java");
		Employee intern = new Intern("Charlie", "I003", 20000, "XYZ University");

		// Demonstrate polymorphism
		manager.displayDetails();
		developer.displayDetails();
		intern.displayDetails();
	}
}