
public class LibraryBook implements Book {
	
	private String isbn;
	private String title;
	private String author;
	private int year;
	private boolean available;

	LibraryBook(Book book) {
		// 생성자
		this.isbn = book.getIsbn();
		this.title = book.getTitle();
		this.author = book.getAuthor();
		this.year = book.getYear();
		this.available = true;
	}

	LibraryBook(String isbn, String title, String author, int year) {
	    // 생성자
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.year = year;
		this.available = true;
	}

	public String getIsbn() {
		return isbn;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getYear() {
		return year;
	}
	public boolean isAvailable() {
		return this.available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
}
