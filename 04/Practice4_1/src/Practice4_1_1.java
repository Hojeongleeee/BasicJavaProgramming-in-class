/********************************
 	�غ��� ���� �Է��Ͽ� �ﰢ�� ���� ���
 	1315594 �濵�а� ��ȣ��
	#����ȯ #�ڷ�����ġ #�޼ҵ�
*********************************/

		//public, private : Ŭ���� ���� ���� (Practice �������� Ȱ�� : Public)
		//Ŭ���� : �ʿ��� �� ���� �������� ����
		//����ȭ : ���̺귯���� ����س��� �̸��� ������ ���� �� (ex:Scanner)

import java.util.Scanner;
public class Practice4_1_1 {
	public static void main(String[] args) {
		
		int h, l; // �غ��� ���� �Է�
		float s;  // ���̴� �Ǽ������� 
		Scanner scan = new Scanner (System.in);
		
		System.out.print("����:");
		h = scan.nextInt();
		System.out.print("�غ�:");
		l = scan.nextInt();
		
		s = Triangle(h,l); // Triangle �޼ҵ忡 int h,l�� �μ��� �־� ������� s��
		System.out.println("����:"+s); 
		
	}
	
	/**�޼ҵ�1**/
	public static float Triangle (int height, int length){
			// �غ�, ���̸� �μ��� �޾Ƽ� ���̸� return�ϴ� �޼ҵ� (float�̾����)
			// �Է¹޴� �μ����� float�������� �����ص� �������.
					
		float tri; //���̴� �Ǽ� tri ������ ����
		tri = ((float)height*length)/2; 
			//���̿� �غ��� �����̹Ƿ� �� �������̶� ����ȯ�� ���־�� tri�� float���·� ��Ÿ��
		return tri; //tri�� �޼ҵ��� ����� ������ (float)
		
		}
	
	/** ����ǰ���, �ﰢ���� �ѷ� �� �پ��� ���� ���� **/

}
