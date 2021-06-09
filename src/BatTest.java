import zooKeeper.com.mammals.Bat;

public class BatTest {
	
	public static void main(String[] args) {
		
		Bat vampire = new Bat();
		
		vampire.displayEnergy();
		
		vampire.attackTown();
		vampire.attackTown();
		vampire.attackTown();
		
		vampire.eatHumans();
		vampire.eatHumans();
		
		vampire.fly();
		vampire.fly();
		
		vampire.displayEnergy();
	}
	
}
