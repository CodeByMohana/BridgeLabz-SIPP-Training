package encapsulation_polymorphism_interface_and_abstractclass.vehicle_rental_system;

public class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 3000.0;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy #: " + maskPolicy();
    }

    // Encapsulation: mask policy number
    private String maskPolicy() {
        return "****" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
    }
}