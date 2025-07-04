package linked_list.movie_management;

public class MovieManagement {
	MovieNode head;
	MovieNode tail;

	class MovieNode {
		String movieTitle;
		String director;
		String yearOfRelease;
		double rating;
		MovieNode previous;
		MovieNode next;

		public MovieNode(String movieTitle, String director, String yearOfRelease, double rating) {
			this.movieTitle = movieTitle;
			this.director = director;
			this.yearOfRelease = yearOfRelease;
			this.rating = rating;
			this.previous = null;
			this.next = null;
		}
	}

	public void addMovie(String movieTitle, String director, String yearOfRelease, double rating) {
		MovieNode newMovie = new MovieNode(movieTitle, director, yearOfRelease, rating);

		if (head == null) {
			head = newMovie;
			tail = newMovie;
		} else {
			tail.next = newMovie;
			newMovie.previous = tail;
			tail = newMovie;
		}
	}

	public void addMovieBeginning(String movieTitle, String director, String yearOfRelease, double rating) {
		MovieNode newMovie = new MovieNode(movieTitle, director, yearOfRelease, rating);
		if (head == null) {
			head = newMovie;
			tail = newMovie;
		} else {
			newMovie.next = head;
			head.previous = newMovie;
			head = newMovie;
		}
	}

	public void addMovieAtPosition(String movieTitle, String director, String yearOfRelease, double rating,
			int position) {
		MovieNode newMovie = new MovieNode(movieTitle, director, yearOfRelease, rating);
		if (position < 0) {
			System.out.println("Invalid position");
		} else {
			if (position == 0) {
				addMovieBeginning(movieTitle, director, yearOfRelease, rating);
			} else {
				MovieNode temp = head;
				int index = 0;
				while (temp != null && index < position - 1) {
					temp = temp.next;
					index++;
				}
				if (temp == null) {
					// If position is beyond current length, add at end
					System.out.println("Position out of bounds, adding at end.");
					addMovie(movieTitle, director, yearOfRelease, rating);
					return;
				}
				newMovie.next = temp.next;
				newMovie.previous = temp;

				if (temp.next != null) {
					temp.next.previous = newMovie;
				} else {
					// If inserted at the end, update tail
					tail = newMovie;
				}

				temp.next = newMovie;
			}
		}
	}

	public void displayMoviesForward() {
		MovieNode current = head;
		while (current != null) {
			System.out.println("Title: " + current.movieTitle + ", Director: " + current.director + ", Year: "
					+ current.yearOfRelease + ", Rating: " + current.rating);
			current = current.next;
		}
	}

	public void displayMoviesBackward() {
		MovieNode current = tail;
		while (current != null) {
			System.out.println("Title: " + current.movieTitle + ", Director: " + current.director + ", Year: "
					+ current.yearOfRelease + ", Rating: " + current.rating);
			current = current.previous;
		}
	}

	public static void main(String[] args) {
		MovieManagement movies = new MovieManagement();
		movies.addMovie("Asura", "----", "2020", 3.5);
		movies.addMovie("Romeo", "----", "2024", 4.2);
		movies.displayMoviesForward();
		movies.addMovieBeginning("Kalki", "null", "2024", 4.5);
		movies.displayMoviesForward();
		System.out.println("-----------------------------");
		movies.addMovieAtPosition("Leo", "null", "2023", 4.3, 2);
		movies.displayMoviesForward();
		System.out.println("-----------------------------");
		movies.displayMoviesBackward();

	}
}
