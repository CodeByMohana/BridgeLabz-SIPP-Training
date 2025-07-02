package inheritance;

class RestaurantPerson {
	String name;
	int id;
	
	//Constructor
	public RestaurantPerson(String name, int id) {
		this.name = name;
		this.id = id;
	}
}

interface Worker{
	void performDuties();
}

class Chef extends RestaurantPerson implements Worker {
	String speciality;
	
	public Chef(String name, int id, String speciality) {
		super(name, id);
		this.speciality = speciality;
	}
	
	public void performDuties() {
		System.out.println(name + " is preparing " + speciality + " dishes.");
	}
}

class Waiter extends RestaurantPerson implements Worker {
	String section;
	
	public Waiter(String name, int id, String section) {
		super(name, id);
		this.section = section;
	}
	
	public void performDuties() {
		System.out.println(name + " is serving customers in the " + section + " section.");
	}
}	

public class RestaurantManagementSystem {
	public static void main(String[] args) {
		Chef chef = new Chef("Raj", 101, "Indian Cuisine");
		Waiter waiter = new Waiter("Aisha", 102, "Main Dining");
		
		chef.performDuties();
		waiter.performDuties();
	}
}
