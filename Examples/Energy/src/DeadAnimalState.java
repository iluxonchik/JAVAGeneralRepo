
public class DeadAnimalState implements PredatorState{

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

	@Override
	public void attack(Object o) {
		// TODO Auto-generated method stub
		
	}
}
