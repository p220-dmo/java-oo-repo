package fr.htc.cours.exemples.expl1;

public class TestIt {

	public static void main(String[] args) {
		// Dans une m�thode
		Ellipse e = new Ellipse(2.0, 4.0);
		Circle c = new Circle(2.0);
		System.out.println("Aire de e: " + e.area() + ", Aire de c: " + c.area());
		System.out.println((e instanceof Circle)); // false
		System.out.println((e instanceof Ellipse)); // true
		System.out.println((c instanceof Circle)); // true
		System.out.println((c instanceof Ellipse)); // true (car Circle d�rive  de Ellipse)
		e = c;
		System.out.println((e instanceof Circle)); // true
		System.out.println((e instanceof Ellipse)); // true
		
		
		
		//double r = e.getRadius(); // ==>  erreur: m�thode getRadius n�est pas trouv�e  dans la classe Ellipse
		
		
		//c = e; // ==> erreur: type incompatible pour = Doit utiliser un cast  explicite

	}

}
