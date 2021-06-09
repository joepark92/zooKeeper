package zooKeeper.com.mammals;

public class Bat extends Mammal {
	
	public Bat() {
		energyLevel = 300;
	}
	
	public void fly() {
		System.out.println("Bat is flying! -50 Energy");
		energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println("Bat eats a human! +25 Energy");
		energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("Bat attacks a Town! The Town is on fire! -100 Energy");
		energyLevel -= 100;
	}
}
