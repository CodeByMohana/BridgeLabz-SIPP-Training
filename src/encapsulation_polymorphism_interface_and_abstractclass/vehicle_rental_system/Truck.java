package encapsulation_polymorphism_interface_and_abstractclass.vehicle_rental_system;

public class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 500 * days; // Additional truck charge
    }

    @Override
    public double calculateInsurance() {
        return 5000.0;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy #: " + maskPolicy();
    }

    private String maskPolicy() {
        return "****" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
    }
}