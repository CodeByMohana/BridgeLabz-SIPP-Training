package classes_and_objects;

import java.util.ArrayList;
import java.util.Iterator;

public class CartItem {
	private String itemName;
	private double price;
	private int quantity;
	
	//Constructor
	public CartItem(String itemName, double price, int quantity) {
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
	
	//Getters
	public String getItemName() {
		return itemName;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	} 
	
	//Setters
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	//Derived Getter
	public double getTotalPrice() {
		return price * quantity;
	}
}
class Cart{
	private ArrayList<CartItem> items;
	
	public Cart() {
		items = new ArrayList<>(); 
	}
	
	//Method to add an item
	public void addItem(CartItem item) {
		items.add(item);
		System.out.println(item.getItemName() + " added to cart.");
	}
	
	//Method to remove an item by name
	public void removeItem(String itemName) {
		Iterator<CartItem> iterator = items.iterator();
		boolean found = false;
		while (iterator.hasNext()) {
			CartItem item = iterator.next();
			if(item.getItemName().equalsIgnoreCase(itemName)) {
				iterator.remove();
				System.out.println(itemName + " removed from cart.");
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println(itemName + " not found in cart.");
		}
	}
	
	//Method to display total cost
	public void displayTotalCost() {
		double total = 0;
		for(CartItem item : items) {
			total += item.getTotalPrice();
		}
        System.out.println("Total cost of items in cart: ₹" + total);
	}
	
	// Optional: Display cart contents
    public void displayCartItems() {
        if (items.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }
        System.out.println("Items in Cart:");
        for (CartItem item : items) {
            System.out.println(item.getItemName() + " - ₹" + item.getPrice() + " x " + item.getQuantity());
        }
    }
}
