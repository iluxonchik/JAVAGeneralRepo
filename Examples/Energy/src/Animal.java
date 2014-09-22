
public abstract class Animal implements PredatorState, Runnable, Sleepable{
	
	// Instance variables
	protected String name;
	protected int energy;
	protected boolean isAlive;
	PredatorState state;
	
	// States
	PredatorState AliveAnimal;
	PredatorState DeadAnimal;

	public final int INIT_ENERGY = 0;
	public final int RUN_ENERGY = 0;
	
	public void attackCat(Cat cat){
		// Default implementation
		throw new UnsupportedOperationException("This animal cannot attack cats.");
	}
	
	public abstract void attack(Object o);
	
	
	// Getters
	public String getName(){
		return this.name;
	}
	
	public int getRunEnergy(){
		return this.RUN_ENERGY;
	}
	
	public PredatorState getAliveState(){
		return this.AliveAnimal;
	}
	
	public PredatorState getDeadState(){
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
	
	public void setState(PredatorState state){
		this.state = state;
	}
	
	
	// Overrides
	public String toString (){
			return ("\nName: " + this.getName() + "\nEnergy: " + this.getEnergy());
	}
	
}
