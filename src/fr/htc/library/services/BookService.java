package fr.htc.library.services;

import java.util.ArrayList;
import java.util.List;

import fr.htc.library.dao.BookDao;
import fr.htc.library.entity.Book;
import fr.htc.library.entity.Member;

public class BookService {

	private static BookDao bookDao = new BookDao();

	public Book save(String title, String author, int editionYear) {
		
		if (title == null) {
			System.out.println("Save book aborted : Title is mandatory!!! : " + title.toString());
			return null;
		}
		if (author == null) {
			System.out.println("Save book aborted : Author is mandatory!!! : " + author);
			return null;
		}
		if (editionYear < 1800) {
			System.out.println("Save book aborted : Edition year is mandatory!!! : " + editionYear);
			return null;
		}
		//Arrivee ici: je peut enfin creer un livre
		
		Book book = new Book(title, author, editionYear);
		
		Book savedBook = bookDao.save(book);
				
		return savedBook;
	}

	public static List<Book> findAllBooks() {
		ArrayList<Book> bookList = new ArrayList<>(bookDao.getAllBook());
		return bookList;
	}

	public void close() {
		// TODO Auto-generated method stub
		
	}



}
