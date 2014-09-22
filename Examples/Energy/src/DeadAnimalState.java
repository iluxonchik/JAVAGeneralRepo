
public class DeadAnimalState implements State{

	Animal animal;
	
	public DeadAnimalState(Object animal){
		if (animal instanceof Cat)
			this.animal = (Cat)animal;
		else if (animal instanceof Dog)
			this.animal = (Dog)animal;
	}
	
	public void run(){
		printDeadMessage();
	}
	
	public void sleep(){
		printDeadMessage();
	}
	
	private void printDeadMessage(){
		System.out.println("The animal is dead.\n");
	}
}
