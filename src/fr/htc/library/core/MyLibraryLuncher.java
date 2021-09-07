package fr.htc.library.core;


import fr.htc.library.entity.Book;
import fr.htc.library.entity.Member;

public class MyLibraryLuncher {

	public static void main(String[] args) {
		
		Book book = new Book("Ce que le jour doit à la nuit", "Rachid", 2005);
		Book book2 = new Book("Ce que le jour doit à la nuit", "Rachid", 2005);
		
		
		System.out.println(book);
		System.out.println(book2);
		
		Member member1 = new Member("Djamel", "MOUCHENE", 33);
		Member member2 = new Member("Djamel", "MOUCHENE", 33);
		Member member3 = new Member("Djamel", "MOUCHENE", 33);
		
		
		System.out.println(member1);
		System.out.println(member2);
		System.out.println(member3);

	}

}
