package fr.htc.library.services;

import java.util.ArrayList;
import java.util.List;

import fr.htc.library.dao.LibraryDatabase;
import fr.htc.library.entity.Book;

public class CheckoutService {

	boolean found = false;
	
	boolean success = false;
  
	public void returnBook(String cote){

	for (Book b : BookService.findAllBooks()){
		
	    if (b.getCote().equals(cote)){
		
	    	found = true;
		
		if (b.isCheckin()){
		    
			b.isCheckin();

		    System.out.println("You successfully returned " + cote);
		    
		    success = true;
		    break;
		}
	    }
	}
	if (!found){
	    System.out.println("Sorry, this book is not in our catalog");
	}
	else if (!success){
	    System.out.println("Please check whether this book is borrowed from our library");
	}
    }

    
}
