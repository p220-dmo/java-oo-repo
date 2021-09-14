package fr.htc.java.entity;

public class HabitationIndividuelle extends Habitation {

	private int nbPieces;
	private boolean piscine;

//	Le calcul de l’impôt d’une maison individuelle est diff´erent de celui d’une habitation,
//	il se calcule en fonction de la surface habitable, du nombre de pieces et de la presence
//	ou non d’une piscine.
//	On compte 100 €/pi`ece et 500 € suppl´ementaire en cas de presence d’une piscine.

	public double impot() {
		return super.impot() + (nbPieces * 100) + (isPiscine() ? 500 : 0);
	}

	public void affiche() {
		super.affiche();
		System.out.println("le nombre de piece est :" + nbPieces + " Pièce(s)");
		System.out.println("piscine :" + (piscine ? " Oui" : " Non"));
		System.out.println("impot :" + impot() + " €");

	}

	public HabitationIndividuelle(String nomProp, String adresse, double surface, int nbPieces, boolean piscine) {
		super(nomProp, adresse, surface);
		this.nbPieces = nbPieces;
		this.piscine = piscine;
	}

	public int getNbPieces() {
		return nbPieces;
	}

	public void setNbPieces(int nbPieces) {
		this.nbPieces = nbPieces;
	}

	public boolean isPiscine() {
		return piscine;
	}

	public void setPiscine(boolean piscine) {
		this.piscine = piscine;
	}

}