/************************************
R1315594_2_��ȣ�� (�濵�к�) ����2

Lotto(����)�� 1���� 46������ ���� �� 6���� ���ߴ� ���̴�. 
6���� Lotto ���ڸ� �߻���Ű�� ���α׷��� �ۼ��Ͻÿ�.
 - 1�� 46 ������ ���ڸ� �߻��ϴ� Ŭ������ �����Ͽ� �ۼ��� ��
 - ����ϴ� ���ڵ��� ���� ������ ū ���� ������ ��
 - 6���� ���� �� �ߺ��Ǵ� ���ڰ� ������ �ȵ�
 - �Է°� ����� ����� �������̽��� ����� ��
 ************************************/
import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int LottoNum [] = {0,0,0,0,0,0}; //6���� ��ȣ�� ������ �ڸ� (�迭)
		
		/**��÷**/
		RandomPicking.GetSixNum(LottoNum); 
			//6�����ڸ� �������� �����ϴ� RandomPicking.roll(), �ߺ��˻�, �迭�� ������� ����
		Sorting(LottoNum); 
			//6���� ���ڸ� ���ʴ�� �����ϴ� �޼ҵ�
		
		/**���**/
		System.out.print("����Ű�� ������ 6���� �ζ� ��÷ ��ȣ�� ���ʴ�� �����˴ϴ�!");
		String key = scan.nextLine(); //����Ű�� ġ�� key�� ���� �����ϰ� �������
		System.out.print("-------------------------");
		
		for (int r=0; r<6; r++)
		{
			key = scan.nextLine(); //����Ű�� ġ�� key�� ���� �����ϰ� �������
			System.out.print(LottoNum[r]+" ");
		}
		System.out.println("\n--------------------------\n�����մϴ�!!");
		
		scan.close();
	}	
	
	
	/**�޼ҵ� Sorting**/
	static void Sorting (int[] NumArray) 
	{ 
		//BubbleSort - �� ���ھ� ���ʴ�� ���Ͽ� ������ �ٲٸ鼭 �����ϴ� ���
		int temp = 0; //�� ������ swap�� ���� �ӽð��� Ȯ��
		for(int i=0; i < 6; i++) 
		{ //0~5���� 6ȸ, �տ������� �� �ڱ��� 2���� ������� �ڸ��ٲް˻�
			for(int j=1; j < (6-i); j++) 
			{ //���ڰ� 6�ڸ��� ������ �ּ�6+5+4+3+2+1 ȸ ��� ���ڿ� ���� �񱳸� �����ؾ� ������ �ϼ���
				if(NumArray[j-1] > NumArray[j]) 
				{ //�� ���� ������ �ٲ�
					temp = NumArray[j-1]; 
					NumArray[j-1] = NumArray[j]; 
					NumArray[j] = temp; 
				} //if ��
			} //for ��
		} //for ��
	} //Sorting �޼ҵ� ��	
} //class Lotto ��


/**Ŭ���� ��÷+�ߺ�Ȯ��+������**/
class RandomPicking {
	static Random PickNum = new Random(); //Random Ŭ������ PickNum ��ü ����
	public static int roll(){
		return PickNum.nextInt(46)+1; //0~45�� 1�� ���� 1~46������ ��ȣ�� �������� ��
	}
	
	/**�޼ҵ� �ߺ��˻�+������**/
	static void GetSixNum(int NumArray[]){ //�Ű������� length�� 6�� �迭
		boolean chk = false; 
			//�ߺ��� �ִ°� ���°��� Ȯ���� �� �� �Ҹ��� false�� �ʱ�ȭ (true�϶� while�� �����ϹǷ�)
		int a = 0;
		int i = 0;
		
	//�迭�� �̹� ����� �� �� ���� ���ڿ� ��� �ϳ��� ������ �̱⸦ �ٽ� ������
	//�迭�� ����� ������ ���ʴ�� �˻��ϴٰ�, ���� ���ڿ� ���� ���ڰ� ��Ÿ���� break�� while�� ����
	//while���� ������ i���� ������Ű�� �ʰ� ������, while���� ������ ������ i���� ������Ű�� �������� ����
		while(i<6){//6������
			do{ //��ȣ�� �̰� Ȯ���ϱ⸦ �ϴ� 1ȸ ������ �ݺ��� ��
				a = RandomPicking.roll(); //Lotto ��ü�� roll() �޼ҵ� ȣ��
				if (i==0){//ù����
					NumArray[i]=a;
				} else { //�ι�°����
					for (int j=0; j<i; j++){ //������� ���� ���ڿ� ��
						if (a==NumArray[j]){
							chk = true;
							break; //�ߺ��ִ°��
						} else {
							chk = false;
						} //if��
					} //for ��
				} //ù�������� �ƴ��� �Ǵ��� if ��
			} //do ��
			while (chk); //do-while
			NumArray[i]=a; //�ߺ��� ���� �� ��ħ�� �� ��������
			i++; //i�� ������Ű�� while�� �ٽ� ���� or ��������
		} //6���� ��ȣ�� ������ while ��
	} //GetSixNum() ��
	
}//Ŭ���� ��

