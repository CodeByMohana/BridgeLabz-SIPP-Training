package constructors_and_intances;

public class Book {
	String title;
	String author;
	double price;
	
	//Default Constructor
	public Book() {
		title = "";
		author = "";
		price = 0.0;
	}
	
	//Parameterized Constructor
	public Book(String title, String author,double price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	//Getter
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public double getPrice() {
		return price;
	}
	
	//Setter
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	//Display Method
	public void displayInfo() {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : $" + price);
    }
	
	public static void main(String[] args) {
        Book b1 = new Book(); // Default constructor
        b1.setTitle("Java for Beginners");
        b1.setAuthor("John Doe");
        b1.setPrice(299.99);
        b1.displayInfo();

        System.out.println();

        Book b2 = new Book("Clean Code", "Robert C. Martin", 499.50); // Parameterized
        b2.displayInfo();
    }
}
