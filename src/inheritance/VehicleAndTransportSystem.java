package inheritance;

class Vehicle {
	int maxSpeed;
	String fuelType;
	
	public Vehicle(int maxSpeed, String fuelType) {
		this.maxSpeed = maxSpeed;
		this.fuelType = fuelType;
	}
	
	public void displayInfo() {
		System.out.println("Max Speed: " + maxSpeed + " km/h");
		System.out.println("Fuel Type: " + fuelType);
	}
}

class Car extends Vehicle {
	int seatCapacity;
	
	public Car(int maxSpeed, String fuelType, int seatCapacity) {
		super(maxSpeed, fuelType);
		this.seatCapacity = seatCapacity;
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Number of Seats: " + seatCapacity);
		System.out.println("Vehicle Type: Car");
		System.out.println();
	}
}

class Truck extends Vehicle {
	int loadCapacity;
	
	public Truck(int maxSpeed, String fuelType, int loadCapacity) {
		super(maxSpeed, fuelType);
		this.loadCapacity = loadCapacity;
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Load Capacity: " + loadCapacity + " kg");
		System.out.println("Vehicle Type: Truck");
		System.out.println();
	}
}

class Motorcycle extends Vehicle {
	String type;
	
	public Motorcycle(int maxSpeed, String fuelType, String type) {
		super(maxSpeed, fuelType);
		this.type = type;
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Type: " + type);
		System.out.println("Vehicle Type: Motorcycle");
		System.out.println();
	}
}

public class VehicleAndTransportSystem {
	public static void main(String[] args) {
		Vehicle car = new Car(180, "Petrol", 5);
		Vehicle truck = new Truck(120, "Diesel", 10000);
		Vehicle motorcycle = new Motorcycle(150, "Petrol", "Sport");
		
		car.displayInfo();
		truck.displayInfo();
		motorcycle.displayInfo();
	}
}
