package fr.htc.library.services;

import fr.htc.library.entity.Book;

public class ReturnBook {

	public void returnBook(String cote) {
		boolean found = false;
		boolean success = false;
		for (Book b : BookService.findAllBooks()) {
			
			
		if (b.getCote().equals(cote)) {
		
			found = true;
			
			if (b.isStatus()) {
			
				b.returne();
				
				System.out.println("You successfully returned " + cote);
				
				success = true;
				
				break;
				}
			}
		}
		if (!found) {
			System.out.println("Sorry, this book is not in our catalog");
		} else if (!success) {
			System.out.println("Please check whether this book is borrowed from our library");
		}
	}

}
