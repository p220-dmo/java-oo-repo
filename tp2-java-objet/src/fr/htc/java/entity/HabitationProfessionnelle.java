package fr.htc.java.entity;

public class HabitationProfessionnelle extends Habitation {

	private int nbEmployes;
	

	public void affiche() {
		super.affiche();
		System.out.println("le nombre d'employé(e)s est  : " +nbEmployes+ " personnes");

	}
	
	public HabitationProfessionnelle(String nomProp, String adresse, double surface, int nbEmployes) {
		super(nomProp, adresse, surface);
		this.nbEmployes = nbEmployes;
	}

	public int getNbEmployes() {
		return nbEmployes;
	}

	public void setNbEmployes(int nbEmployes) {
		this.nbEmployes = nbEmployes;
	}
	

};