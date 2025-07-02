package workshop;

import java.util.ArrayList;

class Product {
	String name;
	String category;
	double price;
	int quantity;
	
	// Constructor
	public Product(String name, String category, double price, int quantity) {
		this.name = name; 
		this.category = category;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product name: " + name + ", category: " + category + ", price: " + price + ", quantity: " + quantity;
	}
}

public class ProductCatalog{
	// List to hold products
	ArrayList<Product> products = new ArrayList<>();;
	
	// Methods to manage products
	public void addProduct(String name, String category, double price, int quantity) {
		Product product = new Product(name, category, price, quantity);
		products.add(product);
	}
	
	// Method to remove a product by name
	public void removeProduct(String name) {
		products.removeIf(product -> product.name.equals(name));
	}
	
	// Methods to retrieve products
	public Product getProduct(String name) {
		for (Product product : products) {
			if (product.name.equals(name)) {
				return product;
			}
		}
		return null; // or throw an exception
	}
	
	// Method to get products by category
	public ArrayList<Product> getProductsByCategory(String category) {
		ArrayList<Product> categoryProducts = new ArrayList<>();
		for (Product product : products) {
			if (product.category.equals(category)) {
				categoryProducts.add(product);
			}
		}
		return categoryProducts;
	}
	
	// Method to display all products
	public void displayProducts() {
		for (Product product : products) {
			System.out.println(product.toString());
		}
	}
	
	// Method to set the quantity of a product by name
	public void setProductQuantity(String name, int quantity) {
		for(Product product : products) {
			if(product.name.equals(name)) {
				if(quantity < 0) {
					System.out.println("Quantity cannot be negative.");
				}else {
					product.quantity = quantity;
				}
			}
		}
	}
	
	// Main method to demonstrate functionality
	public static void main(String[] args) {
		
		ProductCatalog catalog = new ProductCatalog();
		catalog.addProduct("Laptop", "Electronics", 1200.00, 10);
		catalog.addProduct("Smartphone", "Electronics", 800.00, 20);
		catalog.addProduct("Coffee Maker", "Home Appliances", 150.00, 5);
		
		System.out.println("All Products:");
		catalog.displayProducts();
		
		System.out.println("\nProducts in Electronics:");
		ArrayList<Product> electronics = catalog.getProductsByCategory("Electronics");
		
		for (Product product : electronics) {
			System.out.println(product.toString());
		}
		
		System.out.println("\nRemoving Laptop...");
		catalog.removeProduct("Laptop");
		
		System.out.println("\nAll Products after removal:");
		catalog.displayProducts();
		
		System.out.println("\nSetting quantity of Smartphone to 15...");
		catalog.setProductQuantity("Smartphone", 15);
		
		System.out.println("\nAll Products after updating quantity:");
		catalog.displayProducts();
	}
	
}