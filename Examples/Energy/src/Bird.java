
public class Bird extends Prey{

	protected final int INIT_ENERGY = 20; 
	protected final int RUN_ENERGY = 5;
	
	public Bird(){
		this.energy = INIT_ENERGY;
		AlivePrey = new AlivePreyState(this);
		DeadPrey = new DeadPreyState(this);
		this.setEnergy(this.INIT_ENERGY);
		this.setState(AlivePrey);
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
	public String toString() {
		return ("Bird ifo | Energy = " + this.getEnergy());
	}

}
