
public class AlivePreyState implements PreyState{
	
	Prey prey;
	
	public AlivePreyState(Prey prey){
		this.prey = prey;
	}
	
	// Overrides
	public void run() {
		prey.setEnergy(prey.getEnergy() - prey.RUN_ENERGY);
		if (prey.getEnergy() < 0){
			prey.setState(prey.getAliveState());
		}
		else{
			// Prey died
			prey.setState(prey.getDeadState());
		
		}
	}

	public void escape() {
		prey.setEnergy(prey.getEnergy() + prey.BONUS_ENERGY);
	}

	@Override
	public void sleep() {
		// Sleeping adds the preys initial energy to it's current energy
		prey.setEnergy(prey.getEnergy() + prey.INIT_ENERGY);
	}
	
}