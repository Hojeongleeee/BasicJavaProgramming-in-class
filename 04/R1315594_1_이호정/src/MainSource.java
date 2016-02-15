import java.util.Scanner;

/*************************************
 	1315594 경영학과 이호정
	오늘까지의 날짜수계산+윤년판정+요일판정
	#Problem	
		특정 날짜(년,월, 일)를 입력하면 
		그날의 요일과  2015년 9월 22일까지의 날짜수를 계산하는 프로그램을 작성하시오.
	#윤년의 기준
		400년 중 윤년은 97번임
		4의 배수인 해는 윤년이되 다음은 조건으로 정함
		100의 배수인 해는 윤년이 아니나 400의 배수인 해는 윤년임
		1년 1일은 월요일임
	#작성조건
		반드시 윤년의 판정은 별도의 클래스로 정의 할 것
		요일의 결정은 별도의 클래스로 정의할 것
		입력과 출력을 사용자 인터페이스를 고려할 것
**************************************/
public class MainSource {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year[] = new int[2]; //태어난 연 0, 현재 연 1
		int month[] = new int[2]; //태어난 월 0, 현재 월 1
		int day[] = new int[2]; //태어난 일 0, 현재 일 1
		int m[] = new int[12]; //1월부터 12월까지 일 수 저장한 배열
		String DayName = new String[7];
		
		int k = 0, n = 0; //2월29일 수 k, 살아온 날 n
		int first = 0, last = 0; //태어난 연, 현재 연도에 해당하는 살아온 날 값
		

		
	}

}
