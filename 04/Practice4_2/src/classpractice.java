/*********************************
	예제 4-2 (실습수업)
	
*********************************/
public class classpractice {

	public static void main(String[] args) {
		//main 함수
		
		Avg1Total student1 = new Avg1Total(); //기능을 부여하기 위한 생성자 new
			//student1 객체 만들기 - student1이라는 차 뽑기 : 1과 2는 서로 옵션(인수)만 다름
			//메소드 - 차를 만들 때 공장에서 정해진 메뉴얼 대로 만들어짐 (옵션은 한정적)
		Avg1Total student2 = new Avg1Total();
		student1.name = "김철수";	
		student2.name = "김영희"; //이름값 주기
		
		String st1_avg = student1.average(70,80); //선언과 대입 동시에
		String st2_avg = student2.average(80,90); //선언과 대입 동시에
			//st*_avg --> 이름과 점수가 접합된 string 문자열
		int st1_total = student1.total(70,80);
		int st2_total = student2.total(80,90);
			//st*_total --> Avg1total의 return값 (정수값 총합)
		
		System.out.println(st1_avg+" 총점=" + st1_total);
		System.out.println(st2_avg+" 총점=" + st2_total);

	}
	
/**클래스1**/
	class Avg1 {
		String name;
		int avg;
		public String average(int kor, int eng)
		{
			avg = (kor+eng)/2; //avg는 정수지만 string으로 변환시켜줌
			return name+avg; //이름과 평균값(string)을 뭉뚱그려서 동시에 반환
		}
	}

/**클래스1_1 (상속) **/ 
	class Avg1Total extends Avg1 { //Avg1을 Extends --> Avg1Total (상속)
		//상속받은 class는 부모class의 기능을 모두 가지고 있다
		//average 메소드 사용 가능
		public int total(int kor, int eng) //다른곳에서 불러도 쓸 수 있는 클래스 public
		{
			int score = kor + eng;
			return score;
		}
		
		//Avg1Total --> average(), total()
		//Avg1 --> average()
	}



}
