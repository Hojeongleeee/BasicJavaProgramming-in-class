package errortest;

public class errortest1 {
	public static void main(String args[]){
		int a, b;
		a = 50;
		b = 0;
		
		try{
			System.out.println("������� ");
			divide(a, b);
			System.out.println("�Դϴ�"); //��ŵ
		} catch (Exception e) {
			System.out.println("�����߻� " + e);
		}
		
		System.out.println("��Ƥä��������"); //����
	}//try ��

	static void divide(int a, int b){
		System.out.println(a/b);
	}


}

