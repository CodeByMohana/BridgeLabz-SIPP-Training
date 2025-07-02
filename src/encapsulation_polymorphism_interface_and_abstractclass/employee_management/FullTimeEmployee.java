package encapsulation_polymorphism_interface_and_abstractclass.employee_management;

public class FullTimeEmployee extends Employee implements IDepartment {
	private String department;
	private double bonus;
	
	 public FullTimeEmployee(int employeeId, String name, double baseSalary, double bonus) {
	        super(employeeId, name, baseSalary);
	        this.bonus = bonus;
	  }
	
	@Override
	public double calculateSalary() {
		return getBaseSalary() + bonus;
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
