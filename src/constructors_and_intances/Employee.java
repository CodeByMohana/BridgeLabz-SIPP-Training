package constructors_and_intances;

public class Employee {
	public int employeeId;
	protected String department;
	private double salary;
	
	//Constructor
	public Employee(int employeeId, String department, double salary) {
		this.employeeId = employeeId;
		this.department = department;
		this.salary = salary;
	}
	
	// Public method to modify salary
	public void setSalary(double newSalary) {
		if (newSalary > 0) {
			this.salary = newSalary;
		}
	}
	
    // Public method to get salary
	public double getSalary() {
		return salary;
	}
}

class Manager extends Employee {
	public Manager(int employeeId, String department, double salary) {
		super(employeeId, department, salary);
	}
	// Method to display employee information
    public void displayManagerInfo() {
        System.out.println("Employee ID: " + employeeId);        // Accessible: public
        System.out.println("Department: " + department);         // Accessible: protected
        System.out.println("Salary: " + getSalary());            // Accessed via public getter
    }
	
}
