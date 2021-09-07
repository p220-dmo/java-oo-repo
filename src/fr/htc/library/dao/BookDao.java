package fr.htc.library.dao;

import java.util.ArrayList;
import java.util.List;

import fr.htc.library.entity.Book;

public class BookDao {
	
	
	public void save(Book book) {
		
		LibraryDatabase.getBookTable().put(book.getCote(), book);
	}
	
	
	public Book getBookByCote(String cote) {
		
		Book findBook = LibraryDatabase.getBookTable().get(cote);
		
		return findBook;
	}
	
	
	public List<Book> getAllBook() {
		return new ArrayList<Book>(LibraryDatabase.getBookTable().values());
	}
	
	
	public void delete(Book book) {
		this.delete(book.getCote());
	}
	
	public void delete(String cote) {
		LibraryDatabase.getBookTable().remove(cote);
	}
	
	
	

}
