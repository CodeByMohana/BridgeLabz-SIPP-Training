package encapsulation_polymorphism_interface_and_abstractclass.employee_management;

public class PartTimeEmployee extends Employee implements IDepartment {
	private String department;
	private int hoursWorked;
	private double hourlyRate;
	
	 public PartTimeEmployee(int employeeId, String name, double hourlyRate, int hoursWorked) {
	        super(employeeId, name, 0); // baseSalary not used
	        this.hourlyRate = hourlyRate;
	        this.hoursWorked = hoursWorked;
	  }
	
	@Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
	
	@Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
	
}
