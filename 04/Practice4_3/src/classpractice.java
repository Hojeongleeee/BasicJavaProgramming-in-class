
/*********************************
	���� 4-3 (�ǽ�����)
	
*********************************/
public class classpractice {
		public static void main(String[] args) {
			Avg2 student1 = new Avg2();
			student1.name = "��ö��";
			student1.avg = 100;
		}
	}

/**Ŭ����1**/
	class Avg2 {
		public String name;
		private int avg;
		public String average(int kor, int eng)
		{
			avg = (kor+eng)/2;
			return name+avg;
		}
	}

