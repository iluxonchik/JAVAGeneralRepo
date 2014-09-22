
public abstract class Animal implements State{
	
	// Instance variables
	protected String name;
	protected int energy;
	protected boolean isAlive;
	State state;
	
	// States
	State AliveAnimal;
	State DeadAnimal;

	public final int INIT_ENERGY = 0;
	public final int RUN_ENERGY = 0;
	
	protected final int DOG_ENERGY = 1000;
	protected final int MOUSE_ENERGY = 50;
	protected final int BIRD_ENERGY = 20;
	
	public void attackCat(Cat cat){
		// Default implementation
		throw new UnsupportedOperationException("This animal cannot attack cats.");
	}
	
	public abstract void run();
	public abstract void attack(Object o);
	
	public void sleep(){
		System.out.println("Zzzzz...\n");
		this.setEnergy(INIT_ENERGY);
	}
	
	// Getters
	public String getName(){
		return this.name;
	}
	
	public int getRunEnergy(){
		return this.RUN_ENERGY;
	}
	
	public State getAliveState(){
		return this.AliveAnimal;
	}
	
	public State getDeadState(){
		return this.DeadAnimal;
	}
	
	public int getEnergy(){
		return this.energy;
	}
	
	public boolean isAlive(){
		return this.isAlive;
	}
	
	// Setters
	public void setEnergy(int value){
		this.energy = value;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setState(State state){
		this.state = state;
	}
	
	
	// Overrides
	public String toString (){
			return ("\nName: " + this.getName() + "\nEnergy: " + this.getEnergy());
	}
	
}
