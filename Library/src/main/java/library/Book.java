package library;

public class Book extends LibraryItem implements Readable {

	private String title;
	private String auther;
	private String type;

	public Book(int iD, boolean checkedOut, String title, String auther, String type) {
		super(iD, checkedOut);
		this.title = title;
		this.auther = auther;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Book       [ID: " + getiD() + ", Is it Checked out: " + isCheckedOut() + ", Book name: " + title
				+ ", Auther: " + auther + ", Type of book: " + type + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void readable() {
		System.out.println("this Book is readable");
	}

}
