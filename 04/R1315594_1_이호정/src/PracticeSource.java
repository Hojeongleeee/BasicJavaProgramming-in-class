/*************************************
 	�����ҽ�!!!!!!!!
 	1315594 �濵�а� ��ȣ��
	���ñ����� ��¥�����+��������+��������
	#Problem	
		Ư�� ��¥(��,��, ��)�� �Է��ϸ� 
		�׳��� ���ϰ�  2015�� 9�� 22�ϱ����� ��¥���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	#������ ����
		400�� �� ������ 97����
		4�� ����� �ش� �����̵� ������ �������� ����
		100�� ����� �ش� ������ �ƴϳ� 400�� ����� �ش� ������
		1�� 1���� ��������
	#�ۼ�����
		�ݵ�� ������ ������ ������ Ŭ������ ���� �� ��
		������ ������ ������ Ŭ������ ������ ��
		�Է°� ����� ����� �������̽��� ����� ��
**************************************/


import java.util.Scanner;

public class PracticeSource {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int year[] = new int[2]; //�¾ �� 0, ���� �� 1
		int month[] = new int[2]; //�¾ �� 0, ���� �� 1
		int day[] = new int[2]; //�¾ �� 0, ���� �� 1
		int m[] = new int[12]; //1������ 12������ �� �� ������ �迭

		
		int k = 0, n = 0; //2��29�� �� k, ��ƿ� �� n
		int first = 0, last = 0; //�¾ ��, ���� ������ �ش��ϴ� ��ƿ� �� ��
		
		//�� ���� ���Ͼ����� �迭�� ����
		for (int j=0; j<7; j=j+2)
			m[j] = 31;
		for (int j=7; j<12; j=j+2)
			m[j] = 31;
		m[1] = 28;
		m[3] = 30;
		m[5] = 30;
		m[8] = 30;
		m[10] = 30;
		
		//�¾ ������ �Է¹޾� �迭�� ����
		System.out.println("�¾ ��/��/���� �Է��ϼ��� ");
		System.out.print("��:");
		year[0] = scan.nextInt();
		System.out.print("��:");
		month[0] = scan.nextInt();
		System.out.print("��:");
		day[0] = scan.nextInt();
		
		//������ ������ �Է¹޾� �迭�� ����
		System.out.println("������ ��/��/���� �Է��ϼ��� ");
		System.out.print("��:");
		year[1] = scan.nextInt();
		System.out.print("��:");
		month[1] = scan.nextInt();
		System.out.print("��:");
		day[1] = scan.nextInt();

		int size = 0;
		size = (year[1]-year[0])/4;
		int y[] = new int[size]; //������ �ظ� ��� ����
		
		//���� ����Ͽ� 2�� 29���� �� ��ŭ k�� �� ����
		for (int i=year[0]; i<=year[1]; i++){
			if ( (i%4==0 && i%100!=0) || i%400==0 ){ //���� ��� ���ǽ�
				y[k] = i;
				k +=1; //���ǿ� �´� ������ ���� 2�� 29�� ���� ��
			}
		} //for�� ��
		
		//first, last ���� ���⿡ ���� ���
		if ( y[0]==year[0] && month[0] > 2 )
			k -=1;
		if ( y[y.length]==year[1] && month[1] < 2 )
			k -=1;
		System.out.println("y[n]"+y.length);
		//	
		//while ( )
		
		
		//
		n = 365*(year[1]-year[0]-1)+k+first+last;
		
		
		scan.close();
		
		} //main�Լ� ��
		
	}


