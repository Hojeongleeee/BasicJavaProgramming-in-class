/********************************
 	����� ���� - �� ���� ���̷� ���� ���ϱ�
 	1315594 �濵�а� ��ȣ��
	#����ȯ #�ڷ�����ġ #�޼ҵ�
*********************************/
import java.util.Scanner;
public class Practice_4 {
	public static void main (String[] args){
		
		Scanner scan = new Scanner(System.in);
		int a, b, c; //�����Ǳ���
		float e; //����
		float s; //������ s��
		
		System.out.println("�� ���� ���̸� �Է��ϼ���");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		s = herone_s(a, b, c); //���� ��꿡 �ʿ��� s�� �޼ҵ�� ���
		e = herone_e(a, b, c, s); //s�� �����Ͽ� ���̸� ����ϴ� �޼ҵ�
		
		System.out.println("����:"+e);
	}
	
	/**�޼ҵ�1**/
	private static float herone_s (float a, float b, float c){
		float sValue = (a+b+c)/2;
		return sValue;
	}
	
	/**�޼ҵ�2**/
	private static float herone_e (float a, float b, float c, float s){
		float eValue = (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
			//Math.sqrt �޼ҵ�� ��ȯ���� double�̹Ƿ� float�� ����ȯ ���־�� ��
		return eValue;
	}
}
