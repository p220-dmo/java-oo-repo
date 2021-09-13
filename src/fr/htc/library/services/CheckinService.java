package fr.htc.library.services;

import fr.htc.library.entity.Book;

public class CheckinService {
	

	public Book CheckinBook(String cote){
		
		boolean found = false;
		
		boolean success = false;
		
		for (Book book : BookService.findAllBooks()){
			
		    if (book.getCote().equals(cote)) {
		    	
			found = true;
	
			
			if (!book.isCheckin()  ){
				
			    book.checkin();
			    
			    System.out.println("You successfully borrowed " + cote);
			    
			    success = true;
			    break;
			}
		    }
		}
		if (!found){
		    System.out.println("Sorry, this book is not in our catalog");
		}
		else if (!success){
		    System.out.println("Sorry, this book is already borrowed");
		}
		return null;
	}


	
//	public void addCheckin() {
//		
//		Member m = findMemberByMaatricule();
//		Book b = findBookByCote();
//		
//		if(m.getNbMaxCheckin()> m.getNbCheckin()) {
//			CheckinService checkinBook = new CheckinService();
//			checkinBook.addCheckin();
//	
//			//ajouter le prêt 
//			b.getListCheckin().add(b);
//		}	
//	}
//
//	private Member findMemberByMaatricule() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	private Book findBookByCote() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	
}
	

