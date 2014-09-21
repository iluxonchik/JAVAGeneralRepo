public class Cat extends Animal{
	
	// Constants
	private final int CAT_ENERGY = 500;
	private final int CAT_RUN_ENERGY = 25;

	
	private String name;
	
	// Constructors
	public Cat(String name){
		this.name = name;
		this.energy = CAT_ENERGY;
	}
	
	// Getters
	public String getName(){
		return this.name;
	}
	
	// Setters
	public void setName(String name){
		this.name = name;
	}
	
	public void run(){
		System.out.println(this.getName() + "is running...\n");
		
	}
	
	// Overrides
	public String toString (){
		return ("\nName: " + this.getName() + "\nEnergy: " + this.getEnergy());
	}
	
}
