
public interface PredatorState {
	public void run();
	public void attack(Prey prey);
	public void attack(Cat cat);
	public void sleep();
}
