package fr.htc.library.services;

import fr.htc.library.entity.Book;

public class BorrowBook {

	public void returnBook(String cote) {
		boolean found = false;
		boolean success = false;
		for (Book b : BookService.findAllBooks()) {
			
			
		if (b.getCote().equals(cote)) {
		
			found = true;
			
			if (b.isStatus()) {
			
				b.borrow();
				
				System.out.println("You successfully returned " + cote);
				
				success = true;
				
				break;
				}
			}
		}
		if (!found) {
			System.out.println("Sorry, this book is not in our catalog");
		} else if (!success) {
			System.out.println("Sorry, this book is already borrowed");
		}
	}

}
