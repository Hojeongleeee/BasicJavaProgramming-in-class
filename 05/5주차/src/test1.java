/**************************
public static double random()
Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0. 
Returned values are chosen pseudorandomly with (approximately) uniform distribution from that range. 
When this method is first called, it creates a single new pseudorandom-number generator, exactly as if by the expression 
***************************/
public class test1 {
	public static void main(String[] args) {
		int[] diceSum = {0,0,0,0,0,0};
		int b;
		for(int i = 0; i < 10000; i++){
			double val = Math.random();
			while ( val > 0.6){
				val = Math.random();
			}
			b = (int)(val * 10);
			diceSum[b] += 1;
		}
		for (int i =0; i < 6; i++){
			System.out.println("Dice Value : " + (i + 1) + " =   "+  diceSum[i]+" times");
		}
	}
}
