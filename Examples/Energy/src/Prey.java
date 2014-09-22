
public class Prey implements Runnable{
	
	protected final int INIT_ENERGY = 0;
	protected final int BONUS_ENERGY = 0;
	
	public int energy = 0;
	protected boolean isAlive = true;
	
	public int kill(){
		int temp = this.energy;
		this.energy = 0;
		this.isAlive = false;
		return temp;
	}
	
	// Getters
	public int getEnergy(){
		return this.energy;
	}
	
	public void escape(){
		this.energy += BONUS_ENERGY;
	}

	// Overrides
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	
}
