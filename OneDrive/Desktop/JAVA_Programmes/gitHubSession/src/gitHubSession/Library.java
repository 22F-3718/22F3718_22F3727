package gitHubSession;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private List<String> books = new ArrayList<>();

	public void addBook(String bookName) {
		books.add(bookName);
		System.out.println(bookName + " Added to Library");
	}

	public void listBooks() {
		System.out.println("\nBooks in Library" + books);
	}

	public void removeBook(String bookName) {
		if (books.remove(bookName)) {
			System.out.println(bookName + "removed from library");
		} else {
			System.out.println(bookName + "not found in library");
		}
	}

	public static void main(String[] args) {

	}

}
