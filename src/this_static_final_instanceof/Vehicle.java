package this_static_final_instanceof;

public class Vehicle {
    // Static variable common for all vehicles
    static double registrationFee = 5000.0;

    // Final variable - unique and cannot be changed
    final String registrationNumber;

    // Instance variables
    String ownerName;
    String vehicleType;

    // Constructor using 'this'
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Updated Registration Fee: ₹" + registrationFee);
    }

    // Method to display registration details using instanceof
    public void displayRegistrationDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: ₹" + registrationFee);
            System.out.println("-------------------------");

        } else {
            System.out.println("Invalid vehicle object.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Ravi Kumar", "Car", "TN01AB1234");
        Vehicle v2 = new Vehicle("Sneha Reddy", "Bike", "AP09CD5678");

        v1.displayRegistrationDetails();
        v2.displayRegistrationDetails();

        updateRegistrationFee(5500.0); // Updating fee for all vehicles
        v1.displayRegistrationDetails(); // Fee reflected in all instances
    }
}