package fr.htc.java.entity;

import java.util.List;

public class Habitation {

	private String nomProp;
	private String adresse;
	private double surface; // permet de calculet le montant de l'impot 
	
	
	//double Impot() qui permet de calculer le montant de l’impôt que doit payer le propriétaire de
	//l’habitation `a raison de 2F par m2.

	public double impot() {
		return surface*2 ;
	}
	
	//void Affiche() qui permet d’afficher les trois attributs de la classe Habitation.
	public void affiche() {
		System.out.println("le nom du propriétaire est :" + nomProp);
		System.out.println("l'adresse du propriétaire est :" + adresse);
		System.out.println("la surface est :" +surface+ " m²");
	}
	
	
	public Habitation(String nomProp, String adresse, double surface) {
		this.nomProp = nomProp;
		this.adresse = adresse;
		this.surface = surface;
	}
	
	public String getNomProp() {
		return nomProp;
	}

	public void setNomProp(String nomProp) {
		this.nomProp = nomProp;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public double getSurface() {
		return surface;
	}

	public void setSurface(double surface) {
		this.surface = surface;
	}
	
}
