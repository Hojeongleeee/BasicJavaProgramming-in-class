/*****************************************
<실습과제>
임의의 연도가 윤년인지 아닌지를 판정하는 프로그램을 메소드로 작성하시오.

#윤년의 기준
	400년 중 윤년은 97번임
	4의 배수인 해는 윤년이되 다음은 조건으로 정함
	100의 배수인 해는 윤년이 아니나 400의 배수인 해는 윤년임

#위의 메소드를 활용하여 자신의 생일의 요일을 판정하는 클래스를 정의한 프로그램을 작성하시오.
	1년 1일은 월요일임

******************************************/
import java.util.Scanner;
public class MainSource {

	public static void main(String[] args) {
		
		/******1. 임의연도의 윤년판정******/
		Scanner scan = new Scanner(System.in);
		System.out.print("임의의 연도를 입력하세요");
		int year = scan.nextInt();		
		int k = Year(year);
		
		//출력
		if (k == 1)
			System.out.println("윤년입니다");
		else 
			System.out.println("윤년이 아닙니다");
		
		
		/******2. 생일요일판정******/
		System.out.println("생년월일을 입력하세요");
		System.out.print("연:");
			year = scan.nextInt();
		System.out.print("월:");
			int month = scan.nextInt();
		System.out.print("일:");
			int date = scan.nextInt(); //date는 생일, day는 요일
			
		//요일에 대한 String 배열 선언
		String d[] = new String[7];
			//배열에 값 저장
	
			/*******2.2. 총 살아온 날 판정*******/
		int n = 0;
		int m[] = new int[12]; //각 월이 몇일씩 존재하는지를 배열에 저장
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
	
	/**메소드1 = 윤년판정**/
	public static int Year(int y){
		if ( (y%4==0 && y%100!=0) || y%400==0 )
			return 1; //윤년이면 1 (365+1)
		else
			return 0; //윤년이 아니면 0 (365+0)	
	}
	
	/**메소드2 = 요일판정**/
	public static int DayRemain(int n){
		//n은 1월1일부터 생일까지의 날짜수
		int remain = n%7;
		return remain;
	}
	
	/**메소드3 = n계산**/
	public static int GetN(int year, int month, int date){
		//현재의 연도까지 윤년이 반복된 횟수를 반복문으로 계산
		//반복된 횟수(k) + 365*year
		int n = 0 ;
		return n;
	}
	
}
