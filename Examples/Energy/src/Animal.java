
public abstract class Animal {
	
	protected int energy;
	boolean isAlive;

	protected final int DOG_ENERGY = 1000;
	protected final int MOUSE_ENERGY = 50;
	protected final int BIRD_ENERGY = 20;
	
	private boolean testDeath(){
		return (this.energy < 1) ? true : false;
	}
	
	public int getEnergy(){
		return this.energy;
	}
	

}
