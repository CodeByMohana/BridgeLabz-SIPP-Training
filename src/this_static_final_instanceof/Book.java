package this_static_final_instanceof;

public class Book {
	
    // Static variable shared across all instances
	static String libraryName = "ABC Library";
	
	//Instance variables
	private String title;
	private String author;
	
    // Final instance variable (cannot be changed once set)
	private final String isbn;
	
	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	
	//Static method to display library name
	public static void displayLibraryName() {
		System.out.println("Library Name : " + libraryName);
	}
	
	//Method to display Book Details
	public void displayBookDetails() {
		if(this instanceof Book) {
			System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("ISBN: " + isbn);
            System.out.println("------------------------------");
	    } else {
	    	System.out.println("Invalid book object.");
		}
	}
	
	public static void main(String[] args) {
		Book b1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "ISBN12345");
        Book b2 = new Book("1984", "George Orwell", "ISBN67890");

        Book.displayLibraryName();
        b1.displayBookDetails();
        b2.displayBookDetails();
	}

}
