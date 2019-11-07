package library;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private List<LibraryItem> library = new ArrayList<LibraryItem>();

	public Library() {
		super();
	}

	public boolean addItem(LibraryItem item) {
		return this.library.add(item);
	}

	public LibraryItem findItemByIndex(int number) {
		for (LibraryItem i : library) {
			if (i.getiD() == number) {
				return i;
			}
		}
		return null;
	}
	
	public boolean checkIfItemIsCheckedOutByIndex(int number) {
		boolean b = false;
		for (LibraryItem i : library) {
			if (i.getiD() == number) {
				return i.isCheckedOut();
			}
		}
		return b;

		
	}
	
	public String checkBookTitleByIndex(int number) {
		String s = null;
		for (LibraryItem i : library) {
			if (i.getiD() == number) {
				s = ((Book) i).getTitle();
			}
		}
		return s;
	}
	
	public void removeItemByIndex(int number) {
		for (LibraryItem i : library) {
			if (i.getiD() == number) {
				this.library.remove(i);
				return;
			}
		}
	}

	public void checkIn(int number, Person name) {
		for (LibraryItem i : library) {
			if (i.getiD() == number) {
				name.removeItemByIndex(number);
				i.checkIn();
			}
		}
	}

	public void checkOut(int number, Person name) {
		for (LibraryItem i : library) {
			if (i.getiD() == number) {
				name.addItem(i);
				i.checkOut();
			}
		}
	}

	public void editID(int number, int newNumber) {
		for (LibraryItem i : library) {
			if (i.getiD() == number) {
				i.setiD(newNumber);
			}
		}
	}

	public void editBookTitle(int number, String newTitle) {
		for (LibraryItem i : library) {
			if (i.getiD() == number) {
				((Book) i).setTitle(newTitle);
			}
		}
	}

	public void editBookAuther(int number, String newAuther) {
		for (LibraryItem i : library) {
			if (i.getiD() == number) {
				((Book) i).setAuther(newAuther);
			}
		}
	}

	public void editBookType(int number, String newType) {
		for (LibraryItem i : library) {
			if (i.getiD() == number) {
				((Book) i).setType(newType);
			}
		}
	}

	public void editMapLocation(int number, String newLocation) {
		for (LibraryItem i : library) {
			if (i.getiD() == number) {
				((MapItem) i).setLocation(newLocation);
			}
		}
	}

	public void editMapScale(int number, String newScale) {
		for (LibraryItem i : library) {
			if (i.getiD() == number) {
				((MapItem) i).setScale(newScale);
			}
		}
	}

	public void editNewspaperLocation(int number, String newLocation) {
		for (LibraryItem i : library) {
			if (i.getiD() == number) {
				((Newspaper) i).setLocation(newLocation);
			}
		}
	}

	public void editNewspaperName(int number, String newName) {
		for (LibraryItem i : library) {
			if (i.getiD() == number) {
				((Newspaper) i).setPaperName(newName);
			}
		}
	}

	public void editNewspaperEditor(int number, String newEditor) {
		for (LibraryItem i : library) {
			if (i.getiD() == number) {
				((Newspaper) i).setEditor(newEditor);
			}
		}
	}

	public void editNewspaperDate(int number, String newDate) {
		for (LibraryItem i : library) {
			if (i.getiD() == number) {
				((Newspaper) i).setDate(newDate);
			}
		}
	}

	public void removeItemByType(Class<?> clazz) {
		List<LibraryItem> toRemove = new ArrayList<LibraryItem>();
		for (LibraryItem i : library) {
			if (i.getClass() == clazz) {
				toRemove.add(i);
			}
		}
		library.removeAll(toRemove);
	}

	public void printItems() {
		System.out.println("Items currently in Library: ");
		for (LibraryItem i : library) {
			System.out.println(i);
		}
	}

}
