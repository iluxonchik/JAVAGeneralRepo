/*
Modele e implemente uma classe que represente uma versão muito simples do conceito Gato.

Um Gato tem como características o nome, a idade e o peso.

Implemente o método de comparação (equals), por forma a considerar que dois gatos são iguais se as 
suas características forem iguais.

Implemente o método de apresentação (toString), por forma a produzir uma cadeia de caracteres onde seja 
apresentado o nome, a idade e o peso do gato.

Implemente métodos de acesso às variáveis internas do gato.

Implemente um programa ("main") que ilustre a utilização dos métodos anteriores.

 */


package simplecat;

public class Cat {
	
	private String name;
	private int age;
	private double weight;
	
	// Constructors
	public Cat(String name, int age, double weight){
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	
	// Getters
	public String getName(){
		return this.name;
	}

	public int getAge(){
		return this.age;
	}

	public double getWeight(){
		return this.weight;
	}
	
	// Setters
	public void setName(String name){
		this.name = name;
	}

	public void setAge(int age){
		this.age = age;
	}
	
	public void setWeight(double weight){
		this.weight = weight;
	}
	
	
	// Overrides
	public boolean equals (Object o){
		if (o instanceof Cat){
			Cat otherCat = (Cat)o;
			return (this.getName() == otherCat.getName() && this.getAge() == otherCat.getAge() 
					&& this.getWeight() == otherCat.getWeight());
		}
		return false;
	}
	
	public String toString (){
		return ("\nName: " + this.getName() + "\nAge: " + this.getAge() + "\nWeight: " + this.getWeight());
	}

}
