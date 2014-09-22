import java.util.Random;


public class AliveAnimalState implements PredatorState{
	
	Animal animal;
	
	protected final int CAT_BIRD_RATIO = 10;
	protected final int CAT_MOUSE_RATIO = 5;
	protected final int DOG_MOUSE_RATIO = 25;
	
	public AliveAnimalState(Object animal){
		if (animal instanceof Cat)
			this.animal = (Cat)animal;
		else if (animal instanceof Dog)
			this.animal = (Dog)animal;
	}
	
	public void run(){
		if ((animal.getEnergy() - animal.RUN_ENERGY) > 0){
			System.out.println(animal.getName() + "is running! He just spent " + animal.getRunEnergy() + "energy.");
			animal.setEnergy(animal.getEnergy() - animal.RUN_ENERGY);
		}
		else{
			// Animal died
			animal.setEnergy(0);
			animal.setState(animal.getDeadState());
		}
	}
	
	private void performAttack(Animal animal, Prey prey, int ratio){
		// A helper function. Recieves the entities involved in an attack
		// as well as the success ratio and performs the attack.
		Random rand = new Random();
		
		if (rand.nextInt(ratio) == 0)
			animal.setEnergy(animal.getEnergy() + prey.kill());
		else{
			prey.escape();
		}
	}
	
	public void attack(Prey prey){
		int ratio = 0; // ratio of success 10 == 10%
		
		if (animal instanceof Cat){
			// Animal is a Cat
			if (prey instanceof Bird){
				prey = (Bird)prey;
				ratio = CAT_BIRD_RATIO;
				animal.run();
				
				performAttack(animal, prey, ratio);
			}
			else if (prey instanceof Mouse){
				prey = (Mouse)prey;
				ratio = CAT_MOUSE_RATIO;
				animal.run();
				
				performAttack(animal, prey, ratio);
			}	
		}
		else if (animal instanceof Dog){
			// Animal is a Dog
			if (prey instanceof Mouse){
				prey = (Mouse)prey;
				ratio = DOG_MOUSE_RATIO;
				animal.run();
				
				performAttack(animal, prey, ratio);
			}
			
		}
	}
	
	public void attack(Cat cat){
		// TODO
	}
}
