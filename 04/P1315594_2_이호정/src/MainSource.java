/*****************************************
<�ǽ�����>
������ ������ �������� �ƴ����� �����ϴ� ���α׷��� �޼ҵ�� �ۼ��Ͻÿ�.

#������ ����
	400�� �� ������ 97����
	4�� ����� �ش� �����̵� ������ �������� ����
	100�� ����� �ش� ������ �ƴϳ� 400�� ����� �ش� ������

#���� �޼ҵ带 Ȱ���Ͽ� �ڽ��� ������ ������ �����ϴ� Ŭ������ ������ ���α׷��� �ۼ��Ͻÿ�.
	1�� 1���� ��������

******************************************/
import java.util.Scanner;
public class MainSource {

	public static void main(String[] args) {
		
		/******1. ���ǿ����� ��������******/
		Scanner scan = new Scanner(System.in);
		System.out.print("������ ������ �Է��ϼ���");
		int year = scan.nextInt();		
		int k = Year(year);
		
		//���
		if (k == 1)
			System.out.println("�����Դϴ�");
		else 
			System.out.println("������ �ƴմϴ�");
		
		
		/******2. ���Ͽ�������******/
		System.out.println("��������� �Է��ϼ���");
		System.out.print("��:");
			year = scan.nextInt();
		System.out.print("��:");
			int month = scan.nextInt();
		System.out.print("��:");
			int date = scan.nextInt(); //date�� ����, day�� ����
			
		//���Ͽ� ���� String �迭 ����
		String d[] = new String[7];
			//�迭�� �� ����
	
			/*******2.2. �� ��ƿ� �� ����*******/
		int n = 0;
		int m[] = new int[12]; //�� ���� ���Ͼ� �����ϴ����� �迭�� ����
		for (int j=0; j<7; j=j+2)
			m[j] = 31;
		for (int j=7; j<12; j=j+2)
			m[j] = 31;
		m[1] = 28;
		m[3] = 30;
		m[5] = 30;
		m[8] = 30;
		m[10] = 30;
	}
	
	/**�޼ҵ�1 = ��������**/
	public static int Year(int y){
		if ( (y%4==0 && y%100!=0) || y%400==0 )
			return 1; //�����̸� 1 (365+1)
		else
			return 0; //������ �ƴϸ� 0 (365+0)	
	}
	
	/**�޼ҵ�2 = ��������**/
	public static int DayRemain(int n){
		//n�� 1��1�Ϻ��� ���ϱ����� ��¥��
		int remain = n%7;
		return remain;
	}
	
	/**�޼ҵ�3 = n���**/
	public static int GetN(int year, int month, int date){
		//������ �������� ������ �ݺ��� Ƚ���� �ݺ������� ���
		//�ݺ��� Ƚ��(k) + 365*year
		int n = 0 ;
		return n;
	}
	
}
