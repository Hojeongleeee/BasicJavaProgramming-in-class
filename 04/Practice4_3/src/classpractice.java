
/*********************************
	예제 4-3 (실습수업)
	
*********************************/
public class classpractice {
		public static void main(String[] args) {
			Avg2 student1 = new Avg2();
			student1.name = "김철수";
			student1.avg = 100;
		}
	}

/**클래스1**/
	class Avg2 {
		public String name;
		private int avg;
		public String average(int kor, int eng)
		{
			avg = (kor+eng)/2;
			return name+avg;
		}
	}

