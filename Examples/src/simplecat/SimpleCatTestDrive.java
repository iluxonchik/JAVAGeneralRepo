package simplecat;

public class SimpleCatTestDrive {

	public static void main(String[] args){
		Cat c1 = new Cat("Meowing", 1, 1);
		Cat c2 = new Cat("MeowMix",1 ,1);
		
		if (c1 == c2)
			System.out.println("Both cats are identical!");
		else
			System.out.println("They ain't the same!");

		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
	}
}
