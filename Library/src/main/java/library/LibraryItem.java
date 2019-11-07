package library;

public abstract class LibraryItem {

	private int iD;
	private boolean checkedOut;
	
	public void checkOut() {
		this.setCheckedOut(true);
	}

	public void checkIn() {
		this.setCheckedOut(false);
	}

	public LibraryItem(int iD, boolean checkedOut) {
		super();
		this.iD = iD;
		this.checkedOut = checkedOut;
	}

	@Override
	public String toString() {
		return "Item [ID= " + iD + ", Is it Checked out: " + checkedOut + "]";
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public boolean isCheckedOut() {
		return checkedOut;
	}

	public void setCheckedOut(boolean checkedOut) {
		this.checkedOut = checkedOut;
	}

}
