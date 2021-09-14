package fr.htc.java.core;
import fr.htc.java.entity.Habitation;
import fr.htc.java.entity.HabitationIndividuelle;
import fr.htc.java.entity.HabitationProfessionnelle;

public class TestHabitation {

	public static void main(String[] args) {
				
				Habitation habitation = new Habitation("Jean", "METZ", 120);				
				habitation.impot();				
				habitation.affiche();
				System.out.println("----------------------------------");

				HabitationIndividuelle habitationIndividuelle = new HabitationIndividuelle("salwa", "saint ouen", 11, 1, false);
				habitationIndividuelle.impot();
				habitationIndividuelle.affiche();
				System.out.println("----------------------------------");
				
				HabitationProfessionnelle habitationProfessionnelle = new HabitationProfessionnelle("ImportExport", "METZ", 2500, 130);
				habitationProfessionnelle.impot();
				habitationProfessionnelle.affiche();
				System.out.println("----------------------------------");
	}

}
