package this_static_final_instanceof;

public class Patient {
    // Static variable shared among all patients
    private static String hospitalName = "City Care Hospital";
    private static int totalPatients = 0;

    // Final variable - uniquely identifies each patient
    private final int patientID;

    // Instance variables
    private String name;
    private int age;
    private String ailment;

    // Constructor using 'this'
    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    // Static method to get total number of patients
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    // Method to display patient details using instanceof
    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("--------------------");

        } else {
            System.out.println("Invalid patient object.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        Patient p1 = new Patient("Rahul Sharma", 35, "Fever", 1001);
        Patient p2 = new Patient("Anjali Mehra", 28, "Fracture", 1002);

        p1.displayDetails();
        p2.displayDetails();

        getTotalPatients();
    }
}