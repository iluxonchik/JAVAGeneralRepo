
public abstract class Prey implements Runnable, Sleepable{
	
	protected final int INIT_ENERGY = 0;
	protected final int BONUS_ENERGY = 0;
	
	public int energy = 0;
	protected boolean isAlive = true;
	
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
	
	// Setters
	public void setEnergy(int energy){
		this.energy = energy;
	}
	

	// Overrides
	public void run() {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
