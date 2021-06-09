package zooKeeper.com.mammals;

public class Gorilla extends Mammal {
	
	public void throwSomething() {
		System.out.println("Gorilla uses throw! -5 Energy");
		energyLevel -= 5;
	}
	
	public void eatBananas() {
		System.out.println("Gorilla eats a banana! +10 Energy");
		energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("Gorilla climbs! -10 Energy");
		energyLevel -= 10;
	}
}
