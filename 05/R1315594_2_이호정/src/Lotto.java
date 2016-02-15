/************************************
R1315594_2_이호정 (경영학부) 과제2

Lotto(복권)는 1부터 46까지의 숫자 중 6개를 맞추는 것이다. 
6개의 Lotto 숫자를 발생시키는 프로그램을 작성하시오.
 - 1과 46 사이의 숫자를 발생하는 클래스를 정의하여 작성할 것
 - 출력하는 숫자들은 작은 수부터 큰 수로 정렬할 것
 - 6개의 숫자 중 중복되는 숫자가 있으면 안됨
 - 입력과 출력을 사용자 인터페이스를 고려할 것
 ************************************/
import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int LottoNum [] = {0,0,0,0,0,0}; //6개의 번호를 저장할 자리 (배열)
		
		/**추첨**/
		RandomPicking.GetSixNum(LottoNum); 
			//6개숫자를 랜덤으로 추출하는 RandomPicking.roll(), 중복검사, 배열에 저장까지 전부
		Sorting(LottoNum); 
			//6개의 숫자를 차례대로 정렬하는 메소드
		
		/**출력**/
		System.out.print("엔터키를 누르면 6개의 로또 추첨 번호가 차례대로 공개됩니다!");
		String key = scan.nextLine(); //엔터키를 치면 key에 개행 저장하고 계속진행
		System.out.print("-------------------------");
		
		for (int r=0; r<6; r++)
		{
			key = scan.nextLine(); //엔터키를 치면 key에 개행 저장하고 계속진행
			System.out.print(LottoNum[r]+" ");
		}
		System.out.println("\n--------------------------\n축하합니다!!");
		
		scan.close();
	}	
	
	
	/**메소드 Sorting**/
	static void Sorting (int[] NumArray) 
	{ 
		//BubbleSort - 두 숫자씩 차례대로 비교하여 순서를 바꾸면서 정렬하는 방법
		int temp = 0; //두 숫자의 swap을 위해 임시공간 확보
		for(int i=0; i < 6; i++) 
		{ //0~5까지 6회, 앞에서부터 맨 뒤까지 2개씩 순서대로 자리바꿈검사
			for(int j=1; j < (6-i); j++) 
			{ //숫자가 6자리가 있으면 최소6+5+4+3+2+1 회 모든 숫자에 대한 비교를 실행해야 정렬이 완성됨
				if(NumArray[j-1] > NumArray[j]) 
				{ //두 수의 순서를 바꿈
					temp = NumArray[j-1]; 
					NumArray[j-1] = NumArray[j]; 
					NumArray[j] = temp; 
				} //if 끝
			} //for 끝
		} //for 끝
	} //Sorting 메소드 끝	
} //class Lotto 끝


/**클래스 추첨+중복확인+값저장**/
class RandomPicking {
	static Random PickNum = new Random(); //Random 클래스의 PickNum 객체 생성
	public static int roll(){
		return PickNum.nextInt(46)+1; //0~45에 1을 더해 1~46까지의 번호를 랜덤으로 고름
	}
	
	/**메소드 중복검사+값저장**/
	static void GetSixNum(int NumArray[]){ //매개변수는 length가 6인 배열
		boolean chk = false; 
			//중복이 있는가 없는가를 확인할 때 쓸 불린값 false로 초기화 (true일때 while을 실행하므로)
		int a = 0;
		int i = 0;
		
	//배열에 이미 저장된 값 중 뽑은 숫자와 어느 하나라도 같으면 뽑기를 다시 실행함
	//배열에 저장된 값들을 차례대로 검사하다가, 뽑은 숫자와 같은 숫자가 나타나면 break로 while문 나감
	//while문을 나가면 i값을 증가시키지 않고 재추출, while문을 나가지 않으면 i값을 증가시키고 다음숫자 추출
		while(i<6){//6개대입
			do{ //번호를 뽑고 확인하기를 일단 1회 수행후 반복할 것
				a = RandomPicking.roll(); //Lotto 객체의 roll() 메소드 호출
				if (i==0){//첫숫자
					NumArray[i]=a;
				} else { //두번째부터
					for (int j=0; j<i; j++){ //현재까지 넣은 숫자와 비교
						if (a==NumArray[j]){
							chk = true;
							break; //중복있는경우
						} else {
							chk = false;
						} //if끝
					} //for 끝
				} //첫숫자인지 아닌지 판단할 if 끝
			} //do 끝
			while (chk); //do-while
			NumArray[i]=a; //중복이 없을 때 마침내 값 최종저장
			i++; //i값 증가시키고 while문 다시 수행 or 추출종료
		} //6개의 번호를 추출할 while 끝
	} //GetSixNum() 끝
	
}//클래스 끝

