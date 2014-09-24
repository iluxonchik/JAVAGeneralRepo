
public class Dog extends Animal {
	
	public final int INIT_ENERGY = 1000;
	public final int RUN_ENERGY = 50;
	
	
	public Dog(String name){
		this.name = name;
		AliveAnimal = new AliveAnimalState((Object)this);
		DeadAnimal = new DeadAnimalState((Object)this);
		this.setEnergy(INIT_ENERGY);
		this.setState(AliveAnimal); // make dog alive
	}
	
	@Override
	public void run() {
		state.run();
	}

	@Override
	public void sleep() {
		state.sleep();		
	}

	@Override
	public void attack(Prey p) {
		state.attack(p);
	}
	
	@Override
	public void attack(Cat cat){
		state.attack(cat);
	}
	
	@Override
	public int getRunEnergy(){
		return this.RUN_ENERGY;
	}
	
	@Override
	public int getInitEnergy(){
		return this.INIT_ENERGY;
	}

}
