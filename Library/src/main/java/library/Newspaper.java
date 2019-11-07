package library;

public class Newspaper extends LibraryItem implements Readable {

	private String paperName;
	private String editor;
	private String date;
	private String location;

	public Newspaper(int iD, boolean checkedOut, String paperName, String editor, String date, String location) {
		super(iD, checkedOut);
		this.paperName = paperName;
		this.editor = editor;
		this.date = date;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Newspapper [ID: " + getiD() + ", Is it Checked out: " + isCheckedOut() + ", Newsaper: " + paperName
				+ ", Date: " + date + ", Location: " + location + "]";

	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public String getPaperName() {
		return paperName;
	}

	public void setPaperName(String paperName) {
		this.paperName = paperName;
	}

	public void readable() {
		System.out.println("this Book is readable");
	}

}