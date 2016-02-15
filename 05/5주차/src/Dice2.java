import java.util.Random;

public class Dice2 {
	Random aDice = new Random();
	public int roll(){
		return aDice.nextInt(6);
	}
}
