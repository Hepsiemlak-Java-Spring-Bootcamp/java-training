package hafta1;

import hafta1.model.Gayrimenkul;

public class OOPBasic {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		// Polimorfizim
		// Encapsulation
		// Inheritance

		// D
		// A
		// C & B

		C c1 = new D();
		c1.add();

		B b1 = new D(); // D is a B
		b1.add(); // B has a add method
		// b1.add();

		D d1 = new D();
		d1.add();
		d1.sum(5);

		// Polimorfizim : Bir objenin başka bir obje gibi davranışı.
		// Yapabilmemize olanak sağlayan kavram Inheritance.

		((B) d1).add(); // Casting

		((D) b1).sum(); // Casting

	}


}
