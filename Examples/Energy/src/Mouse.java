
public class Mouse extends Prey{
	
	protected final int INIT_ENERGY = 50; 
	protected final int RUN_ENERGY = 2;
	
	public Mouse(){
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
		return ("Mouse ifo | Energy = " + this.getEnergy());
	}

}
