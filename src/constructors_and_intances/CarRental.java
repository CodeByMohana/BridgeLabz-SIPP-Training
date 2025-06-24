package constructors_and_intances;

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    // Constructor 1: Default
    public CarRental() {
        customerName = "Unknown";
        carModel = "Standard";
        rentalDays = 1;
        System.out.println("Default rental created.");
    }

    // Constructor 2: Parameterized
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        System.out.println("Rental details initialized.");
    }

    // Constructor 3: Copy constructor
    public CarRental(CarRental other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
        System.out.println("Copy of rental created.");
    }

    // Method to calculate total cost based on car model
    public double calculateTotalCost() {
        double ratePerDay;

        // Example pricing
        switch (carModel.toLowerCase()) {
            case "suv":
                ratePerDay = 80.0;
                break;
            case "sedan":
                ratePerDay = 60.0;
                break;
            case "hatchback":
                ratePerDay = 40.0;
                break;
            default:
                ratePerDay = 50.0; // Standard
        }

        return ratePerDay * rentalDays;
    }

    // Display method
    public void displayRentalDetails() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.println("Total Cost    : ₹" + calculateTotalCost());
        System.out.println("------------------------------------");
    }

    // Main method to test
    public static void main(String[] args) {
        CarRental rental1 = new CarRental(); // Default
        CarRental rental2 = new CarRental("John Doe", "SUV", 3); // Parameterized
        CarRental rental3 = new CarRental(rental2); // Copy

        rental1.displayRentalDetails();
        rental2.displayRentalDetails();
        rental3.displayRentalDetails();
    }
}