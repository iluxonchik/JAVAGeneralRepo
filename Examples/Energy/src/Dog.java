
public class Dog extends Animal{
	
	public final int INIT_ENERGY = 1000;
	public final int RUN_ENERGY = 50;
	
	public Dog(String name){
		this.name = name;
		AliveAnimal = new AliveAnimalState((Object)this);
		DeadAnimal = new DeadAnimalState((Object)this);
		this.setState(AliveAnimal); // make dog alive
	}
	
	@Override
	public void run() {
		state.run();
	}

	@Override
	public void sleep() {
		state.run();		
	}

	@Override
	public void attack(Prey p) {
		state.run();
	}

}
