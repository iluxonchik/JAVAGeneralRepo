
public class DeadPreyState implements PreyState{
	
	/* NOTE: In practice the "prey" reference is never used here,
	 * it was only added since it's a convention. */

	Prey prey; // reference to the object whose behaviour is wrapped 
			   // (Useless in this case, read note above)
	
	public DeadPreyState(Prey prey){
		this.prey = prey;
	}
	
	@Override
	public void run() {
		printDeadMessage();
	}

	@Override
	public void escape() {
		printDeadMessage();		
	}

	@Override
	public void sleep() {
		printDeadMessage();
	}

	public void printDeadMessage(){
		System.out.println("This prey is dead.\n");
	}
}
