import java.util.*;
public class RandomTest {
	public static void main(String args[]) {
		Random rangen = new Random();
		for(int i = 1 ; i <= 5 ; i++) {
			float a = rangen.nextFloat();
			System.out.print("Float형 난수 : " + a);
			int b = rangen.nextInt();
			System.out.println(" Int형 난수 : " + b);
		}
	}
}