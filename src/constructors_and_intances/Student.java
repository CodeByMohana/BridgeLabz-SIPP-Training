package constructors_and_intances;

public class Student {
	public int rollNumber;
	protected String name;
	private double CGPA;
	
	public Student(int rollNumber, String name, double CGPA) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.CGPA = CGPA;
	}
	
	// Getter
	public double getCGPA() {
		return CGPA;
	}
	
	// Public method to set CGPA
	public void setCGPA(double CGPA) {
		if(CGPA >= 0.0 && CGPA <= 10.0) {
			this.CGPA = CGPA;
		} else {
			System.out.println("Invalid CGPA");
		}
	}
	
	// Display details
	public void displayStudentInfo() {
		System.out.println("Roll Number: " + rollNumber);
		System.out.println("Name: " + name);
		System.out.println("CGPA: " + CGPA);
	}
}

//Subclass: PostGraduateStudent
class postgraduateStudent extends Student {
	private String specialization;

    public postgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    // Display postgrad-specific info and access protected name from superclass
    public void displayPostgradInfo() {
        System.out.println("Postgraduate Student:");
        System.out.println("Name: " + name); // Accessing protected member
        System.out.println("Specialization: " + specialization);
    }
	
}
