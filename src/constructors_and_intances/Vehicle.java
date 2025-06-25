package constructors_and_intances;

public class Vehicle {
	private String ownerName;
	private String vehicleType;
	
	private static double registrationFee = 0.0;
	
	public Vehicle(String ownerName, String vehicleType) {
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
	}
	
	//  Instance Method to display Vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }
    
    // Class Method to update registration name
    public static void updateRegistrationFee(double fee) {
    	registrationFee = fee;
    }
	
    public static void main(String[] args) {
    	//Update Registration fee
    	Vehicle.updateRegistrationFee(200000.00);
    	
    	//Create course
    	Vehicle v1 = new Vehicle("Mohan", "two-wheeler");
    	v1.displayVehicleDetails();
    }
}
