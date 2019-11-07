package librarytest;

import static org.junit.Assert.*;

import org.junit.Test;

import library.Book;
import library.Library;
import library.MapItem;
import library.Newspaper;
import library.Person;


public class LibraryTest {

	
	private Library input = new Library();
	private Book testBook;
	private MapItem testMap;
	private Newspaper testNewspaper;
	private Person nick;
	
		
	@Test
	public void addBookTest() {
		System.out.println("[Test 1/x: addBookTest] ");
		testBook = new Book(1155, false, "Reality is not what it seems", "Carlo Rovelli", "science");
		System.out.println(testBook);
		assertEquals("failed to add a book to the library", true, input.addItem(testBook));
	}
		
	@Test
	public void addMapTest() {
		System.out.println("[Test 2/x: addMapTest] ");
		testMap = new MapItem(2324, false, "Manchester", "25:1");
		System.out.println(testMap);
		assertEquals("failed to add a Map to the library", true, input.addItem(testMap));
	}
	
	@Test
	public void addNewspaperTest() {
		System.out.println("[Test 3/x: addNewspaper] ");
		testNewspaper = new Newspaper(3536, false, "Daily Express", "Daily express editor man", "15th Jan 2018", "UK");
		System.out.println(testNewspaper);
		assertEquals("failed to add a Newspaper to the library", true, input.addItem(testNewspaper));
	}
	
	@Test
	public void removeBookTest() {
		System.out.println("[Test 4/x: removeBookTest] ");
		testBook = new Book(1155, false, "Reality is not what it seems", "Carlo Rovelli", "science");
		input.addItem(testBook);
		input.removeItemByIndex(1155);
		assertNull("failed to remove a book from the library", input.findItemByIndex(1155));
	}
	
	@Test
	public void removeMapTest() {
		System.out.println("[Test 5/x: removeMapTest] ");
		testMap = new MapItem(2324, false, "Manchester", "25:1");
		input.addItem(testMap);
		input.removeItemByIndex(2324);
		assertNull("failed to remove a Map from the library", input.findItemByIndex(2324));
	}
	
	@Test
	public void removeNewspaperTest() {
		System.out.println("[Test 6/x: removeNewspaperTest] ");
		testNewspaper = new Newspaper(3536, false, "Daily Express", "Daily express editor man", "15th Jan 2018", "UK");
		input.addItem(testNewspaper);
		input.removeItemByIndex(3536);
		assertNull("failed to remove a Newspaper from the library", input.findItemByIndex(3536));
	}
	
	@Test
	public void checkOutTest() {
		System.out.println("[Test 7/x: CheckOutBookTest] ");
		testBook = new Book(1155, false, "Reality is not what it seems", "Carlo Rovelli", "science");
		nick = new Person("Nick", 66);
		input.addItem(testBook);
		input.checkOut(1155, nick);
		assertEquals("failed to Check out a book in the library", true, input.checkIfItemIsCheckedOutByIndex(1155));
	}
	
	@Test
	public void checkInTest() {
		System.out.println("[Test 8/x: CheckInBookTest] ");
		testBook = new Book(1155, false, "Reality is not what it seems", "Carlo Rovelli", "science");
		nick = new Person("Nick", 66);
		input.addItem(testBook);
		input.checkOut(1155, nick);
		input.checkIn(1155, nick);
		assertEquals("failed to Check In a book in the library", false, input.checkIfItemIsCheckedOutByIndex(1155));
	}
	
	@Test
	public void editTest() {
		System.out.println("[Test 9/x: editBookTest] ");
		testBook = new Book(1155, false, "Reality is not what it seems", "Carlo Rovelli", "science");
		input.addItem(testBook);
		input.editBookTitle(1155, "stupid book");
		assertEquals("failed to edit a book in the library", "stupid book", input.checkBookTitleByIndex(1155));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
