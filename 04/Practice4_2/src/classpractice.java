/*********************************
	���� 4-2 (�ǽ�����)
	
*********************************/
public class classpractice {

	public static void main(String[] args) {
		//main �Լ�
		
		Avg1Total student1 = new Avg1Total(); //����� �ο��ϱ� ���� ������ new
			//student1 ��ü ����� - student1�̶�� �� �̱� : 1�� 2�� ���� �ɼ�(�μ�)�� �ٸ�
			//�޼ҵ� - ���� ���� �� ���忡�� ������ �޴��� ��� ������� (�ɼ��� ������)
		Avg1Total student2 = new Avg1Total();
		student1.name = "��ö��";	
		student2.name = "�迵��"; //�̸��� �ֱ�
		
		String st1_avg = student1.average(70,80); //����� ���� ���ÿ�
		String st2_avg = student2.average(80,90); //����� ���� ���ÿ�
			//st*_avg --> �̸��� ������ ���յ� string ���ڿ�
		int st1_total = student1.total(70,80);
		int st2_total = student2.total(80,90);
			//st*_total --> Avg1total�� return�� (������ ����)
		
		System.out.println(st1_avg+" ����=" + st1_total);
		System.out.println(st2_avg+" ����=" + st2_total);

	}
	
/**Ŭ����1**/
	class Avg1 {
		String name;
		int avg;
		public String average(int kor, int eng)
		{
			avg = (kor+eng)/2; //avg�� �������� string���� ��ȯ������
			return name+avg; //�̸��� ��հ�(string)�� ���ױ׷��� ���ÿ� ��ȯ
		}
	}

/**Ŭ����1_1 (���) **/ 
	class Avg1Total extends Avg1 { //Avg1�� Extends --> Avg1Total (���)
		//��ӹ��� class�� �θ�class�� ����� ��� ������ �ִ�
		//average �޼ҵ� ��� ����
		public int total(int kor, int eng) //�ٸ������� �ҷ��� �� �� �ִ� Ŭ���� public
		{
			int score = kor + eng;
			return score;
		}
		
		//Avg1Total --> average(), total()
		//Avg1 --> average()
	}



}
