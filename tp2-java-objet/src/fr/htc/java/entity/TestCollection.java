package fr.htc.java.entity;

public class TestCollection {

	public static void main(String[] args) {
			Habitation[] TableauHabitation;
		
		// creation d’un tableau contenant 5 habitations 
		 TableauHabitation = new Habitation[5];
		
		// Initialisation des elements du tableau
		 TableauHabitation[0] = new HabitationProfessionnelle("ImportExport", "METZ", 2500, 130);
		 TableauHabitation[1] = new HabitationProfessionnelle("Export", "METZ", 250, 10);
		 TableauHabitation[2] = new HabitationIndividuelle("Paul", "METZ", 100, 5, false);
		 TableauHabitation[3] = new HabitationProfessionnelle("Import", "METZ", 1200, 90);
		 TableauHabitation[4] = new HabitationIndividuelle("Jean", "METZ", 130, 6, true);
		
		// affichage des attributs de chaque ´el´ement du tableau
			
			for (int i = 0; i < 5; i++) {
			TableauHabitation[i].affiche();
			TableauHabitation[i].impot();

			}
	
	}

}
