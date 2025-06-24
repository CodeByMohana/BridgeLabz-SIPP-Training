package constructors_and_intances;

public class LibraryBook {
	 private String title;
	 private String author;
	 private double price;
	 private boolean available;
	 
	 //Parameterized Constructor
	 public LibraryBook(String title, String author, double price, boolean available) {
		 this.title = title;
		 this.author = author;
		 this.price = price;
		 this.available = available;
		 
	 }
	// Borrow method
	    public void borrowBook() {
	        if (available) {
	            available = false;
	            System.out.println("You have borrowed: " + title);
	        } else {
	            System.out.println("Sorry, " + title + " is already borrowed.");
	        }
	    }

	    // Display method
	    public void displayBookInfo() {
	        System.out.println("Title     : " + title);
	        System.out.println("Author    : " + author);
	        System.out.println("Price     : ₹" + price);
	        System.out.println("Available : " + (available ? "Yes" : "No"));
	        System.out.println("-----------------------------");
	    }

	    // Main method to test
	    public static void main(String[] args) {
	        LibraryBook b1 = new LibraryBook("The Power of Now", "Eckhart Tolle", 350.0, true);
	        LibraryBook b2 = new LibraryBook("Wings of Fire", "A.P.J. Abdul Kalam", 250.0, false);

	        b1.displayBookInfo();
	        b2.displayBookInfo();

	        b1.borrowBook(); // Should succeed
	        b2.borrowBook(); // Should fail

	        b1.displayBookInfo();
	        b2.displayBookInfo();
	    }
}
