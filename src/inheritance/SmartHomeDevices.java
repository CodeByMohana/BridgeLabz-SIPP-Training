package inheritance;

//Superclass
class Device {
	String deviceId;
	String status; // e.g., "ON", "OFF"

	public Device(String deviceId, String status) {
		this.deviceId = deviceId;
		this.status = status;
	}
}

//Subclass
class Thermostat extends Device {
	double temperatureSetting; // in Celsius

	public Thermostat(String deviceId, String status, double temperatureSetting) {
		super(deviceId, status);
		this.temperatureSetting = temperatureSetting;
	}

	// Method to display current status
	public void displayStatus() {
		System.out.println("Device ID: " + deviceId);
		System.out.println("Status: " + status);
		System.out.println("Temperature Setting: " + temperatureSetting + "°C");
	}
}

//Main class
public class SmartHomeDevices {
	public static void main(String[] args) {
		Thermostat t1 = new Thermostat("THERMO_01", "ON", 23.5);
		t1.displayStatus();
	}
}