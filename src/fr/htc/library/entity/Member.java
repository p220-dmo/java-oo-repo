package fr.htc.library.entity;

public class Member {

	private static int cpt = 100;
	private String matricule;
	private String nom;
	private String prenom;
	private int age;

	public Member(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.matricule = generateMatricule();
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

	public void setAge(int age) {
		this.age = age;
	}

	public String getMatricule() {
		return matricule;
	}

	@Override
	public String toString() {
		return "Member [matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	
	

}
