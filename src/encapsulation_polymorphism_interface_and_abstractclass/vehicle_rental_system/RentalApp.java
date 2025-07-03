package encapsulation_polymorphism_interface_and_abstractclass.vehicle_rental_system;

import java.util.ArrayList;

public class RentalApp {
    public static void main(String[] args) {
        // Create vehicles
        Vehicle v1 = new Car("MH12AB1234", 1500, "CARPOL123456");
        Vehicle v2 = new Bike("MH14CD5678", 500, "BIKEPOL654321");
        Vehicle v3 = new Truck("MH20EF9012", 3000, "TRUCKPOL789012");

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(v1);
        vehicles.add(v2);
        vehicles.add(v3);

        int days = 5;

        // Polymorphism demonstration
        for (Vehicle v : vehicles) {
            v.displayDetails();
            double rental = v.calculateRentalCost(days);
            System.out.println("Rental Cost  : ₹" + rental + " for " + days + " days");

            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                System.out.println("Insurance    : ₹" + ins.calculateInsurance());
                System.out.println(ins.getInsuranceDetails());
            }

            System.out.println("------------------------------------");
        }
    }
}