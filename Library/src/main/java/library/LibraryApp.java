package library;

public class LibraryApp {

	public static void main(String[] args) {

		Library lib = new Library();
		Person john = new Person("John", 64);
		Person bill = new Person("bill", 35);
		Person fred = new Person("fred", 18);
		Person paul = new Person("paul", 62);
		
		
		//can we add a new book into the library's item list
		lib.addItem(new Book(1155, false, "Reality is not what it seems", "Carlo Rovelli", "science"));
		
		//
		lib.addItem(new MapItem(2324, false, "Manchester", "25:1"));
		lib.addItem(new Newspaper(3536, false, "Daily Express", "Daily express editor man", "15th Jan 2018", "UK"));
		lib.addItem(new Newspaper(3516, false, "Daily Mail", "Daily Mail editor man", "22nd June 2013", "UK"));
		lib.addItem(new Newspaper(3624, false,"The Sun" , "The Joker", "3rd december 2009", "UK"));
		lib.addItem(new MapItem(2654, false, "Bristol", "50:1"));
		lib.addItem(new Book(1984, false, "Harry Potter", "J.K. Rowling", "Fiction"));
		lib.addItem(new Book(1623, false, "Lord of the rings", "J.R.R. Tolkin", "Fiction"));
/*		lib.removeItemByIndex(2654);
		lib.removeItemByType(MapItem.class);*/
		lib.checkOut(3536, bill);
		lib.checkOut(3624, john);
		lib.checkOut(1623, fred);
		lib.checkOut(2654, bill);
		lib.checkIn(3624, john);
		lib.checkOut(3624, paul);
		
		
		
		
		
		lib.editBookTitle(1984, "Game of thrones");
		lib.editBookType(1984, "stupid fiction");
		lib.editBookAuther(1984, "stupd fat guy maybe named something martin");
		lib.editMapLocation(2324, "Salford");
		lib.editMapScale(2324, "1:500");
		lib.editNewspaperDate(3536, "2nd october 1995");
		lib.editNewspaperEditor(3536, "Boring guy");
		lib.editNewspaperName(3536, "Financial times");
		lib.editNewspaperLocation(3536, "UK");

		
		
		
		
		lib.printItems();
		bill.printItems("Bill");
		
		
	}

}
