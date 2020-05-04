package in.cg.demo.models;

public class Book {
	private int bookId;
	private String name;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", name=" + name + "]";
	}
	public Book(int bookId, String name) {
		super();
		this.bookId = bookId;
		this.name = name;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
