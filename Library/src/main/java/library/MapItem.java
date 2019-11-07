package library;

public class MapItem extends LibraryItem {

	private String location;
	private String scale;

	public MapItem(int iD, boolean checkedOut, String location, String scale) {
		super(iD, checkedOut);
		this.location = location;
		this.scale = scale;
	}

	@Override
	public String toString() {
		return "Map        [ID: " + getiD() + ", Is it Checked out: " + isCheckedOut() + ", Location: " + location + ", scale: " + scale + "]";
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getScale() {
		return scale;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}

}
