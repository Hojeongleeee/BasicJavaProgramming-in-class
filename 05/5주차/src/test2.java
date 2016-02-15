/**************************
new java.util.Random() 
This new pseudorandom-number generator is used thereafter for all calls to this method and is used nowhere else. 
***************************/
import java.util.Random;
public class test2 {

	public static void main(String[] args) {
		int[] diceSum = {0,0,0,0,0,0};
		Random aDice = new Random();

		for(int i = 0; i < 10000; i++){
			diceSum[aDice.nextInt(6)] += 1;
		}
		for (int i =0; i < 6; i++){
			System.out.println("Dice Value : " + (i + 1) + " = "+ diceSum[i]+" times");
		}

	}

}

