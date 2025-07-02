package encapsulation_polymorphism_interface_and_abstractclass.employee_management;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create employees
        FullTimeEmployee alice = new FullTimeEmployee(123,"Alice", 12000, 10000);
        alice.assignDepartment("Human Resources");

        PartTimeEmployee bob = new PartTimeEmployee(102, "Bob", 500, 40);
        bob.assignDepartment("Tech Support");

        // Polymorphic list of employees
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(alice);
        employeeList.add(bob);

        // Display details
        for (Employee emp : employeeList) {
            emp.displayDetails();
            if (emp instanceof IDepartment) {
                IDepartment dept = (IDepartment) emp;
                System.out.println(dept.getDepartmentDetails());
            }
            System.out.println("-------------------------------");
        }
    }
}