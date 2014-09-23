
public class Bird extends Prey{

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

}