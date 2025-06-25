package constructors_and_intances;

public class Product {
	//Instance Variable
	private String productName;
	private double price;
	
	//Class Variable 
	private static int totalProducts = 0;
	
	public Product(String productName, double price) {
		this.productName = productName;
		this.price = price;
        totalProducts++; // Increment when a new product is created
	}
	
    // Instance method to display product details
	public void displayProductDetails() {
		System.out.println("Product Name: " + productName);
		System.out.println("Price: " + price);
	}
	
    // Class method to display total number of products
	public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
	
	// Main method to test the class
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 59999.99);
        Product p2 = new Product("Smartphone", 24999.50);

        p1.displayProductDetails();
        System.out.println();

        p2.displayProductDetails();
        System.out.println();

        Product.displayTotalProducts();
    }	
}
