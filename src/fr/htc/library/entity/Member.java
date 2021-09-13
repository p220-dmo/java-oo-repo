package fr.htc.library.entity;

import java.util.List;

public class Member {

	private static int cpt = 100;
	private String matricule;
	private String nom;
	private String prenom;
	private int age;
	private int nbCheckin ;
	private int nbMaxCheckin  ;
	private int nbTotalCheckin;
	private List<Book> CollectionBook;
	
	public Member(String nom, String prenom, int age,int nbCheckin) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.matricule = generateMatricule();
		this.nbCheckin = nbCheckin;
	
	}

	private String generateMatricule() {
		return (nom.substring(0, 1) + prenom.substring(0, 1)).toUpperCase() + cpt++;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public int getNbTotalCheckin() {
		return nbTotalCheckin;
	}

	public void setNbTotalCheckin(int nbTotalCheckin) {
		this.nbTotalCheckin = nbTotalCheckin;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMatricule() {
		return matricule;
	}
	

	public int getNbCheckin() {
		return nbCheckin;
	}

	public void setNbCheckin(int nbCheckin) {
		this.nbCheckin = nbCheckin;
	}
	
	public int getNbMaxCheckin() {
		return nbMaxCheckin;
	}

	public void setNbMaxCheckin(int nbMaxCheckin) {
		this.nbMaxCheckin = nbMaxCheckin;
	}

	@Override
	public String toString() {
		return "Member [matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age
				+ ", nbCheckin=" + nbCheckin + ", nbMaxCheckin=" + nbMaxCheckin + ", nbTotalCheckin=" + nbTotalCheckin
				+ ", CollectionBook=" + CollectionBook + "]";
	}


	
	
	

}
