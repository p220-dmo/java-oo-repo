package fr.htc.cours.exemples.expl2;

public class RunIt {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		a.meth(); // Salut
		b.meth(); // Hello
		a = b;  // a r�f�re � un objet de classe B
		a.meth(); // Hello. M�me si la r�f�rence est de classe A, l�objet est de classe B

	}

}
