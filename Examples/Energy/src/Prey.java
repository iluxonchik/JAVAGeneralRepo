
public abstract class Prey implements PreyState, Runnable, Sleepable{
	
	protected final int INIT_ENERGY = 100; 
	protected final int RUN_ENERGY = 5;
	protected final int BONUS_ENERGY = 5;
	
	protected int energy;
	protected boolean isAlive;
	protected PreyState state;
	
	// State variables
	PreyState AlivePrey;
	PreyState DeadPrey;
	
	public abstract void sleep();
	
	public int kill(){
		int temp = this.energy;
		this.energy = 0;
		this.isAlive = false;
		return temp;
	}
	
	public void escape(){
		this.energy += BONUS_ENERGY;
	}
	
	// Getters
	public int getEnergy(){
		return this.energy;
	}
	
	public PreyState getAliveState(){
		return this.AlivePrey;
	}
	
	public PreyState getDeadState(){
		return this.DeadPrey;
	}

	
	// Setters
	public void setEnergy(int energy){
		this.energy = energy;
	}
	
	public void setState(PreyState state){
		this.state = state;
	}
	
	
	
}