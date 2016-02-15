import java.util.Random;

public class Yut {
	Random throwRandom = new Random(); //랜덤객체선언
	
	public int throwing(){
		int boolHorT = throwRandom.nextInt(2); 
			//0은 앞면, 1은 배면
		return boolHorT; // 정수값 반환 : 등면, 배면 여부
	}
}
