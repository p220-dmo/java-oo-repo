package fr.htc.library.core;
import java.io.PrintWriter; // Step 1
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.List;

import fr.htc.library.entity.Book;
import fr.htc.library.entity.Member;
import fr.htc.library.services.BookService;
import fr.htc.library.services.MemberService;

public class MyLibraryLuncher {
	
	private static BookService bookService = new BookService();
	private static MemberService memberService = new MemberService();
	
	public static void main(String[] args) throws FileNotFoundException {
		
        PrintWriter out = new PrintWriter("file.txt"); 

		//testSaveBook();

		initDatabase();

		System.out.println("Voici la liste des livre enregistrés en base : ");

		List<Book> books = bookService.findAllBooks();
		for (Book book : books) {
			System.out.println(book);
		}

		System.out.println("\nVoici la liste des membres enregistrés en base : ");
		
		List<Member> members = memberService.findAllMembers();
		for(Member member : members) {
			System.out.println(member);
		}
	}
	
		
	private static void initDatabase() {
		insertMemberData();
		insertBookData();
	
	}

	private static void insertMemberData() {
		// TODO Auto-generated method stub
		memberService.save("Rébecca", "Armand", 24, 2);
		memberService.save("Aimée", "Hebert", 36, 2);
		memberService.save("Marielle", "Ribeiro", 27, 0);
		memberService.save("Hilaire", "Savary", 58, 0);
		memberService.save("Rébecca", "Armand", 24, 0);
		memberService.save("Aimée", "Hebert", 36, 0);
		memberService.save("Marielle", "Ribeiro", 27,1);
		memberService.save("Hilaire", "Savary", 58,4);
		memberService.save("Rébecca", "Armand", 24,5);
		memberService.save("Aimée", "Hebert", 36,2);
		memberService.save("Marielle", "Ribeiro", 27,2);
		memberService.save("Hilaire", "Savary", 58,5);
		memberService.save("Rébecca", "Armand", 24,1);
		memberService.save("Aimée", "Hebert", 12,3);
		memberService.save("Marielle", "Ribeiro", 27,0);
		memberService.save("Hilaire", "Savary", 58,0);
		memberService.save("Rébecca", "Armand", 24,2);
		
        memberService.close();

	}
		
private static void insertBookData() {
		bookService.save("Titre_200a", "Auteur_principal_qualificatif_700c", 2011);
		bookService.save("L'eau des anges", "Eg�mar B�atrice", 2011);
		bookService.save("Quand on parle du loup", "Harrison Lisi", 2011);
		bookService.save("�tang aux libellules (L')", "Ibbotson Eva", 2011);
		bookService.save("Avant les t�n�bres", "Cluzeau Nicolas", 2009);
		bookService.save("La boussole du Club des cinq", "Blyton Enid", 2009);
		bookService.save("Momo", "Ende Michael", 2011);
		bookService.save("Je m'appelle pas Ben Laden !", "Chambaz Bernard", 2011);
		bookService.save("Ogres, brigands et compagnie", "Ungerer Tomi", 2003);
		bookService.save("Gauchos de Patagonie", "Bourseiller Philippe", 2011);
		bookService.save("A minuit", "M�rike Eduard", 2011);
		bookService.save("Les cinq m�nent l'enqu�te", "Voilier Claude", 2010);
		bookService.save("Jeanne", "Cassabois Jacques", 2004);
		bookService.save("Radio Nouba", "Bonneval Gwen de", 2007);
		bookService.save("Emile et les d�tectives", "K�stner Erich", 2004);
		bookService.save("On voyage", "Helft Claude", 2011);
		bookService.save("Nous les filles !", "Delmege Sarah", 2004);
		bookService.save("Radio Nouba", "Bonneval Gwen de", 2011);
		bookService.save("Nous les gar�ons !", "Crossick Matt", 2004);
		bookService.save("On prend des m�dicaments", "Helft Claude", 2004);
		bookService.save("Profession, pirate !", "Aubrun Claudine", 2004);
		bookService.save("La mer", "B�lineau Nathalie", 2004);
		bookService.save("La ligne de front", "Larcenet Manu", 2004);
		bookService.save("J'apprends � dessiner la vie quotidienne", "Legendre-Kvater Philippe", 2004);
		bookService.save("Collages de serviettes pour le jardin et la maison", "Enderlen-Debuisson Marie", 2003);
		bookService.save("Argile au tour", "Tardio-Brise Liliane", 2003);
		bookService.save("Petite histoire de la France au 20e si�cle", "Prost Antoine", 2002);
		bookService.save("Les chev�ches aux yeux d'or", "Haroux-M�tayer Eliane", 2004);
		bookService.save("On r�ve d'avoir un chat", "Helft Claude", 2004);
		bookService.save("Les grands explorateurs", "Platt Richard", 2004);
		bookService.save("Mythes et monstres", "Buller Laura", 2004);
		bookService.save("Les gladiateurs", "Malam John", 2015);
		bookService.save("Mirages", "Robillard Anne", 2013);
		bookService.save("ABC d'Albert Jacquard pour changer le monde (L')", "Jacquard Albert", 2014);
		bookService.save("arc-en-ciel des familles (L')", "Douru Muriel", 2015);
		bookService.save("I like Europe", "Gillet Caroline", 2010);
		bookService.save("fables de La Fontaine pour r�fl�chir (Les)", "Pelisse Laetitia", 1987);
		bookService.save("Vieux metiers et pratiques oubliees en Bourgogne, Nivernais-Morvan, autrefois",
				"Bertheau Georges", 2013);
		bookService.save("changelin (Le)", "Lindhom Per August", 19);
		bookService.save("Meurtre au champagne", "Christie Agatha", 2005);
	   
        bookService.close();

	}
	

	private static void testSaveBook() {
		// Test : Cas nominal : OK
		Book savedBook = bookService.save("Ce que le jour doit � la nuit", "Rachid", 2005);
		if (savedBook != null) {
			System.out.println("Book created successfully...");
		} else {
			System.out.println("Book not created yet...");
		}

		// Test : Cas title == null : KO
		Book savedBook2 = bookService.save(null, "Rachid", 2005);
		if (savedBook2 != null) {
			System.out.println("Book created successfully...");
		} else {
			System.out.println("Book not created yet...");
		}

		// Test : Cas title == null : KO
		Book savedBook3 = bookService.save("Ce que le jour doit � la nuit", null, 2005);
		if (savedBook3 != null) {
			System.out.println("Book created successfully...");
		} else {
			System.out.println("Book not created yet...");
		}

		// Test : Cas year = 0 : KO
		Book savedBook4 = bookService.save("Ce que le jour doit � la nuit", "Rachid", 1801);
		if (savedBook4 != null) {
			System.out.println("Book created successfully...");
		} else {
			System.out.println("Book not created yet...");
		}
	}
	
		private static void testSaveMember() {
		
		//test : cas nom ==null 
		
		Member savedMember = memberService.save("Hilaire", "Savary", 58,0);
		
		if (savedMember != null) {
		
			System.out.println("Member created successfully...");
		} 
		else {
			System.out.println("Member not created yet...");
		}
		}
		//test : cas prenom == null 
		
		
		//test : cas age <18
		//test : par numéro de cote 
	
		private static void testCheckinBook() {
			
		}
		}

			//test : par numéro de matricule 



