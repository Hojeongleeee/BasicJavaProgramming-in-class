/*************************************
 	연습소스!!!!!!!!
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


import java.util.Scanner;

public class PracticeSource {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int year[] = new int[2]; //태어난 연 0, 현재 연 1
		int month[] = new int[2]; //태어난 월 0, 현재 월 1
		int day[] = new int[2]; //태어난 일 0, 현재 일 1
		int m[] = new int[12]; //1월부터 12월까지 일 수 저장한 배열

		
		int k = 0, n = 0; //2월29일 수 k, 살아온 날 n
		int first = 0, last = 0; //태어난 연, 현재 연도에 해당하는 살아온 날 값
		
		//월 마다 몇일씩인지 배열에 저장
		for (int j=0; j<7; j=j+2)
			m[j] = 31;
		for (int j=7; j<12; j=j+2)
			m[j] = 31;
		m[1] = 28;
		m[3] = 30;
		m[5] = 30;
		m[8] = 30;
		m[10] = 30;
		
		//태어난 연월일 입력받아 배열에 저장
		System.out.println("태어난 연/월/일을 입력하세요 ");
		System.out.print("연:");
		year[0] = scan.nextInt();
		System.out.print("월:");
		month[0] = scan.nextInt();
		System.out.print("일:");
		day[0] = scan.nextInt();
		
		//오늘의 연월일 입력받아 배열에 저장
		System.out.println("오늘의 연/월/일을 입력하세요 ");
		System.out.print("연:");
		year[1] = scan.nextInt();
		System.out.print("월:");
		month[1] = scan.nextInt();
		System.out.print("일:");
		day[1] = scan.nextInt();

		int size = 0;
		size = (year[1]-year[0])/4;
		int y[] = new int[size]; //윤년인 해를 모두 저장
		
		//윤년 계산하여 2월 29일의 빈도 만큼 k에 값 저장
		for (int i=year[0]; i<=year[1]; i++){
			if ( (i%4==0 && i%100!=0) || i%400==0 ){ //윤년 계산 조건식
				y[k] = i;
				k +=1; //조건에 맞는 윤년일 때에 2월 29일 수를 셈
			}
		} //for문 끝
		
		//first, last 해의 윤년에 대한 계산
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
		
		} //main함수 끝
		
	}


