package constructors_and_intances;

public class BookLibrarySystem {
	public String ISBN;
	protected String title;
	private String author;
	
	//Constructor
	public BookLibrarySystem(String ISBN, String title, String author) {
		this.ISBN = ISBN;
		this.title = title;
		this.author = author;
	}
	
    // Public method to set author
	public void setAuthor(String author) {
		this.author = author;
	}
	
	//Public method to get author
	public String getAuthor() {
		return author;
	}
}

class EBook extends BookLibrarySystem {
	
	//Constructor
	public EBook(String ISBN, String title, String author) {
		super(ISBN, title, author);
	}
	
	// Method to display accessible members
    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);       // Accessible: public
        System.out.println("Title: " + title);     // Accessible: protected
        // System.out.println("Author: " + author); // Not accessible: private
        System.out.println("Author: " + getAuthor()); // Accessed via public getter
    }
}
