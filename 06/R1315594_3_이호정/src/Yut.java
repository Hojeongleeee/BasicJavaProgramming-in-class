import java.util.Random;

public class Yut {
	Random throwRandom = new Random(); //������ü����
	
	public int throwing(){
		int boolHorT = throwRandom.nextInt(2); 
			//0�� �ո�, 1�� ���
		return boolHorT; // ������ ��ȯ : ���, ��� ����
	}
}
