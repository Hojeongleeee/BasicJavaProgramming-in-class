/************************************
P1315594_5_이호정 (경영학부) 실습5

주사위를 2개를 던져서 나온 값의 합을 얻어내고자 한다. 다음과 같은 조건으로 프로그램을 작성하시오.
 - 주사위 1은 Math.random method를 사용하는 객체로 정의할 것
 - 주사위 2는 Random 클래스의 nextInt method를 사용하는 객체로 정의할 것
 - 10회 수행하여 나오는각각의  합을 출력하도록 할 것.
 ************************************/
import java.util.Random;

public class Practice {
	public static void main(String[] args) {
		int dice1 [] = new int[10];
		int dice2 [] = new int[10];
		
		System.out.println("두 개의 주사위를 던져 그 합을 구하는 프로그램");
		for (int i=1;i<=10;i++)
		{
			double k = 1; //Math.random() 메소드는 0~1사이의 실수값을 반환
				while(k>=0.6) //주사위의 눈은 1~6이므로 k는 0.6미만이어야함
					k=Math.random();

			dice1 [i-1] = (int)(10*k)+1; //0~0.6의 실수 k에 10을 곱한 뒤 정수로 형변환
			dice2 [i-1] = diceroll(); //Random클래스의 nextInt(정수) 메소드 이용
			
			System.out.print(i+"회 던진 주사위의 눈 : ("+dice1[i-1]+","+dice2[i-1]+")");
			int sum = dice1[i-1]+dice2[i-1]; 
			System.out.println("\t 두 눈의 합 : "+sum);
		}
	}
	
	static Random diceroll = new Random();
	public static int diceroll(){
		int n = diceroll.nextInt(6);
		return n+1; //n은 0~5 이므로 주사위 눈을 반환하기 위해 +1
	}
}
