package fr.htc.library.core;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import fr.htc.library.entity.Book;
import fr.htc.library.entity.Member;
import fr.htc.library.services.BookService;

public class MyLibraryLuncher {
	
	private static BookService bookService= new BookService(); 
	public static void main(String[] args) {
		
	
        List<Book> book = new LinkedList<Book>();

		Book book1 = new Book("Ce que le jour doit à la nuit", "Rachid", 2005);
		Book book2 = new Book("Demain est un autre jour", "Lori Nelson Spielman", 2005);
		Book book3 = new Book("Les Hauts de Hurlevent ", "Emily Brontë", 1847);
		Book book4 = new Book("L'Étranger", "Albert Camu", 1887);
		Book book5 = new Book("Voyage au bout de la nuit", "Louis-Ferdinand Céline", 1932);
            		
		book
		.add(book1);
		book.add(book2);
		book.add(book3);
		book.add(book4);
		book.add(book5);
		
        List<Member>  member = new LinkedList<Member>();
        
		Member member1 = new Member("Djamel", "MOUCHENE", 33);
		Member member2 = new Member("Hollande", "François",65);
		Member member3 = new Member("Jean", "Pierre",44);
		Member member4 = new Member("jean", "Pierre",44);
		Member member5 = new Member("Jean", "Pierre",44);
		
		member.add(member1);
		member.add(member2);
		member.add(member3);
		member.add(member4);
		member.add(member5);
		
		Iterator<Member> memberList = member.iterator();
		Iterator<Book> bookList = book.iterator();
	
		while (bookList.hasNext()) {
            System.out.println(bookList.next());
            System.out.println("-------------------------------------------");    
        }
		
		while (memberList.hasNext()) {
            System.out.println(memberList.next());
        System.out.println("-------------------------------------------"); 

		}

	}

}
