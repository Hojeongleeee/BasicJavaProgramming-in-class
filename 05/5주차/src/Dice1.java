public class Dice1 {
	public int roll(){
		double val = Math.random();
		while ( val > 0.6){
			val = Math.random();
		}
		return (int)(val*10);
	}
}



