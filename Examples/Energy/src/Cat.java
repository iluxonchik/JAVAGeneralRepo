public class Cat extends Animal{
	
	// Constants
	public final int INIT_ENERGY = 500;
	public final int RUN_ENERGY = 25;
	
	// Constructors
	public Cat(String name){
		this.name = name;
		this.energy = INIT_ENERGY;
		this.AliveAnimal = new AliveAnimalState((Object)this);
		this.DeadAnimal = new DeadAnimalState((Object)this);
		this.setState(AliveAnimal); // make cat alive
	}
	
	
	public void run(){
		state.run();
	}
	
	
	public void attackCat(Cat cat){
		System.out.println("There is no way I'm attacking a fellow feline!");
	}


	@Override
	public void attack(Prey prey) {
		state.attack(prey);
		
	}


	@Override
	public void sleep() {
		state.sleep();
	}
	
	
	
	
}
