package this_static_final_instanceof;

public class Product {
	//Static variables
	private static double discount;
	
	//Instance variables
	private String productName;
	private double price;
	private int quantity;
	
	
	// Final instance variable (cannot be changed once set)
	private final int productId;
	
	//Constructor
	public Product(String productName, double price, int quantity, int productId) {
		this.productName = productName;
		this.price  = price;
		this.quantity = quantity;
		this.productId = productId;
	}
	
	//Static method to update discount
	public static void updateDiscount(double newDiscount) {
		discount = newDiscount;
	}
	
	
	// Method using instanceof to display details
    public void displayDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productId);
            System.out.println("Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("----------------");

        }
    }

    // Main method to test
    public static void main(String[] args) {
        Product p1 = new Product("Pen", 10.0, 5, 101);
        Product p2 = new Product("Notebook", 50.0, 2, 102);

        p1.displayDetails();
        p2.displayDetails();

        Product.updateDiscount(10.02); // Update discount for all products
        System.out.println("After updating discount:");
        p1.displayDetails();
    }
}