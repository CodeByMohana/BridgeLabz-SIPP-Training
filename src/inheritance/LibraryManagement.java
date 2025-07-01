package inheritance;

class Book {
	String title;
	int publicationYear;

	// Constructor
	public Book(String title, int publicationYear) {
		this.title = title;
		this.publicationYear = publicationYear;
	}
}

class Author extends Book {
	String name;
	String bio;

	public Author(String title, int publicationYear, String name, String bio) {
		super(title, publicationYear);
		this.name = name;
		this.bio = bio;
	}

	public void displayInfo() {
		System.out.println("Book Title: " + title);
		System.out.println("Publication Year: " + publicationYear);
		System.out.println("Author Name: " + name);
		System.out.println("Author Bio: " + bio);
	}
}

public class LibraryManagement {
    public static void main(String[] args) {
        Author author = new Author(
            "The Silent Observer",
            2022,
            "Aarav Mehta",
            "Aarav is an Indian novelist known for contemporary fiction and short stories."
        );

        author.displayInfo();
    }
}