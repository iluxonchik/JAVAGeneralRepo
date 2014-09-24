/* 
 * This project is far from being completely done. The testing was limited,
 * this is more of a "solution sketch", rather than a complete implementation.
 *  + The commenting is almost non-existent.
 *  + Two state patterns have been used (one for the predators (A.K.A. "Cat" and "Dog")
 *    and one for preys (A.K.A. "Bird" and "Mouse").
 *    
 *   The class naming is not the best (specially the abstract ones) and the code is messy
 *   and inconsistent in various places.
 *   
 * Another proposed solution can be obtained here:
 * https://www.l2f.inesc-id.pt/~david/wiki/pt/index.php/Introdu%C3%A7%C3%A3o_aos_Objectos/Exerc%C3%ADcio_02:_Energia
 * 
  */


public class Main {
	
	public static void main(String[] args){
		
		// Main.java was copied from here: 
		// https://www.l2f.inesc-id.pt/~david/wiki/pt/index.php/Introdu%C3%A7%C3%A3o_aos_Objectos/Exerc%C3%ADcio_02:_Energia
		// (with some modifications).
		
		Dog d1 = new Dog("Piloto");
		Dog d2 = new Dog("�tila");
 
		Cat c1 = new Cat("Tareco");
		Cat c2 = new Cat("Pantufa");
		Cat c3 = new Cat("Kitty");
 
		Bird[] birds = new Bird[20];
		for (int ix = 0; ix < birds.length; ix++)
			birds[ix] = new Bird();
 
		Mouse[] mice = new Mouse[50];
		for (int ix = 0; ix < mice.length; ix++)
			mice[ix] = new Mouse();
		
		System.out.println("BEFORE");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
 
		for (int ix = 0; ix < birds.length; ix++)
			System.out.println(birds[ix]);
 
		for (int ix = 0; ix < mice.length; ix++)
			System.out.println(mice[ix]);
		
		
		// run, chase, eat, sleep, etc.
		 
		for (int ix = 0; ix < birds.length; ix++)
		birds[ix].run();
		 
		d1.run();
		d2.attack(c1);
		c2.attack(birds[2]);
		c3.attack(birds[9]);
		c3.attack(mice[0]);
		d2.attack(mice[1]);
		mice[3].run();
		
		
		// snapshot: present everything
		System.out.println("AFTER");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		 
		for (int ix = 0; ix < birds.length; ix++)
			System.out.println(birds[ix]);
		 
		for (int ix = 0; ix < mice.length; ix++)
			System.out.println(mice[ix]);
		 
		
	}
}