
public class AliveAnimalState implements State{
	
	Animal animal;
	
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
}
