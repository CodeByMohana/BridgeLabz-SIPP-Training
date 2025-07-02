package encapsulation_polymorphism_interface_and_abstractclass.employee_management;

public abstract class Employee {
	private int employeeId;
	private String name;
	private double baseSalary;
	
	public Employee(int employeeId, String name, double baseSalary) {
		this.employeeId = employeeId;
		this.name = name;
		this.baseSalary = baseSalary;
	}

	public String getName() {
		return name;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public abstract double calculateSalary();
	
	public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: ₹" + baseSalary);
        System.out.println("Final Salary: ₹" + calculateSalary());
    }
	
}
