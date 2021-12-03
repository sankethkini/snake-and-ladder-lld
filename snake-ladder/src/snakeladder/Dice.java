package snakeladder;
import java.util.Random;
public class Dice {
	
	public int rolldice() {
		Random rand=new Random();
		int r=1+rand.nextInt(6);
		System.out.println("Dice rolled -- "+r);
		return r;
	}
}
