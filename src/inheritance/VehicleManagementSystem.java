package inheritance;

class VehicleType {
	int maxSpeed;
	String model;

	public VehicleType(String model, int maxSpeed) {
		this.model = model;

		this.maxSpeed = maxSpeed;
	}

	public void displayInfo() {
		System.out.println("Model: " + model);
		System.out.println("Max Speed: " + maxSpeed + " km/h");
	}
}

interface Refuelable {
	void refuel();
}

class ElectricVehicle extends VehicleType {
	double batteryCapacity;

	public ElectricVehicle(String model, int maxSpeed, double batteryCapacity) {
		super(model, maxSpeed);
		this.batteryCapacity = batteryCapacity;
	}

	public void charge() {
		System.out.println("Charging electric vehicle with " + batteryCapacity + " kWh battery.");
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
	}
}

class PetrolVehicle extends VehicleType implements Refuelable {
	double fuelCapacity;

	public PetrolVehicle(String model, int maxSpeed, double fuelCapacity) {
		super(model, maxSpeed);
		this.fuelCapacity = fuelCapacity;
	}

	@Override
	public void refuel() {
		System.out.println("Refueling petrol vehicle with " + fuelCapacity + " liters.");
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
	}
}

public class VehicleManagementSystem {
	public static void main(String[] args) {
		PetrolVehicle petrolCar = new PetrolVehicle("Honda City", 180, 40);
		ElectricVehicle electricCar = new ElectricVehicle("Tesla Model 3", 250, 75);

		System.out.println("---- Petrol Vehicle ----");
		petrolCar.displayInfo();
		petrolCar.refuel();

		System.out.println("\n---- Electric Vehicle ----");
		electricCar.displayInfo();
		electricCar.charge();
	}
}
