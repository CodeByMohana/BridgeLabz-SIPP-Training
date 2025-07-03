package encapsulation_polymorphism_interface_and_abstractclass.vehicle_rental_system;

public class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 1000.0;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy #: " + maskPolicy();
    }

    private String maskPolicy() {
        return "****" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
    }
}