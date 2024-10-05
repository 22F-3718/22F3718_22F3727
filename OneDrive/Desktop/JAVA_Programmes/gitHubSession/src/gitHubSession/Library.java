package gitHubSession;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private List<String> books=new ArrayList<>();
	
	public void addBook(String bookName)
	{
		books.add(bookName);
		System.out.println(bookName+" Added to Library" );
	}
	
	
	public void listBooks()
	{
		System.out.println("\nBooks in Library"+books);
	}
	
	
	public boolean searchBooks(String bookName)
	{
		return books.contains(bookName);
	}

}
