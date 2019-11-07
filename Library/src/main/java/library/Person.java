package library;

import java.util.ArrayList;

public class Person {
	
	String name;
	int age;
	ArrayList<LibraryItem> booksCheckedOut = new ArrayList<LibraryItem>();
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public boolean addItem(LibraryItem item) {
		return this.booksCheckedOut.add(item);
	}

	public void removeItemByIndex(int number) {
		for (LibraryItem i : booksCheckedOut) {
			if (i.getiD() == number) {
				this.booksCheckedOut.remove(i);
				return;
			}
		}
	}
	
	public void printItems(String name) {
		System.out.println("Items currently with" + name + ": ");
		for (LibraryItem i : booksCheckedOut) {
			System.out.println(i);
		}
	}
	
}
