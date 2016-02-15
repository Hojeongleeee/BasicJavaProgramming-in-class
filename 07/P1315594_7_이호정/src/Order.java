/* P1315594_7_이호정 (경영학부)
 * 자동차 주문서 작성 프로그램
 * Order.java - 주문생성자에 포함된 주문내용(값) 저장 프로세스
 */
import java.util.Scanner;


public class Order extends Car{

	static Scanner scan = new Scanner(System.in);

	String a, op1; 
	int  b=99, op2=99;
	// a : engineType
	// b : engineCapa
	// op1 : 승용차 색상 or 트럭 바퀴수 or 버스종류
	// op2 : 승용차 승차인원 or 트럭 화물적재량 or 버스승차인원
	int aPick=99, op1Pick=99; //객관식을 위해
	
	Order(int menu){
		//생성자 디폴트 Order(승용차트럭버스중에1)
		//주문받자마자 주문객체 생성하겠다!
		
		switch(menu){ //menu번호에 따라 주문 다르게 실행
		case 1:
			automobileOrder();
			break;
		case 2:
			busOrder();
			break;
		case 3:
			truckOrder();
			break;
		} 
		//switch문 끝나면 선택된 차종의 옵션이 a, b, op1, op2에 각각 저장됨
		//main함수에서 getA, getB, getOp1, getOp2 메소드로 값 전달??
	}


	/***************************차종별 주문 메소드*******************************/

//
//
// 자동차 주문
//
//
	
	private void automobileOrder(){
		printAuto(); //승용차에 대한 선택가능한 모든 사양을 고객에게 미리 보여주기
		System.out.println("");
		//1. 엔진타입 - a에 저장
		System.out.println("1. 엔진 타입을 입력하세요");
		System.out.println("1.가솔린");
		System.out.println("2.디젤");
		System.out.println("3.LPG");
		System.out.print("엔진타입:");
		do{
			if(aPick!=99){ //초기화한 값
				System.out.println("다시 입력하세요");
			}
			aPick = scan.nextInt();
		} while (aPick>3); //객관식 입력범위 초과시 다시실행
		switch (aPick){ //객관식답: String으로 저장
		case 1:
			a = "가솔린";
			break;
		case 2:
			a = "디젤";
			break;
		case 3:
			a = "LPG";
			break;
		}
		//2. 엔진용량 - b에 저장
		System.out.println("2. 엔진 용량을 입력하세요 (ex: 3000)");
		System.out.print("엔진용량:");
		do{
			if(b!=99){
				System.out.println("다시 입력하세요");
			}
			b = scan.nextInt(); //정수형이므로 바로 b에 대입
		} while (b!=1500&&b!=2000&&b!=2500&&b!=3000);
			//주관식 입력범위가 아닌 값들을 받았을때 다시 실행
		
		//3. 색상 - op1에 저장
		System.out.println("3. 자동차의 색상을 입력하세요");
		System.out.println("1.백색");
		System.out.println("2.검정");
		System.out.println("3.노랑");
		System.out.println("4.파랑");
		System.out.println("5.빨강");
		System.out.println("6.보라");
		System.out.print("색상:");
		do{
			if(op1Pick!=99){
				System.out.println("다시 입력하세요");
			}
			op1Pick = scan.nextInt();
		} while (op1Pick>6);
		switch(op1Pick){
		case 1:
			op1="백색";
			break;
		case 2:
			op1="검정";
			break;
		case 3:
			op1="노랑";
			break;
		case 4:
			op1="파랑";
			break;
		case 5:
			op1="빨강";
			break;
		case 6:
			op1="보라";
			break;
		}
		//4. 승차인원 - op2에 저장
		System.out.println("4. 승차인원을 입력하세요 (ex: 2)");
		System.out.print("승차인원:");
		do{
			if(op2!=99){
				System.out.println("다시 입력하세요");
			}
			op2 = scan.nextInt();
		} while (op2!=2&&op2!=5&&op2!=7);
	}

//
//
// 트럭 주문
//
//

	private void truckOrder(){
		printTruck(); //트럭에 대한 모든 선택가능한 사양을 미리 고객에게 출력함
		System.out.println("");
		//1. 엔진타입 - a에 저장
		a="디젤"; //디젤밖에 없음
		
		//2. 엔진용량 - b에 저장
		System.out.println("1. 엔진 용량을 입력하세요 (ex: 3000)");
		System.out.print("엔진용량:");
		do{
			if(b!=99){
				System.out.println("다시 입력하세요");
			}
			b = scan.nextInt();
		} while (b!=3000&&b!=4000&&b!=5000);

		//3. 바퀴수 - op1에 저장
		System.out.println("2. 트럭의 바퀴 수를 입력하세요 (ex: 6)");
		System.out.print("바퀴수:");
		do{
			if(op1Pick!=99){
				System.out.println("다시 입력하세요");
			}
			op1Pick = scan.nextInt();
		} while (op1Pick!=4&&op1Pick!=6&&op1Pick!=10);
		op1=String.valueOf(op1Pick); //바퀴 수를 입력한 값을 int로 변환

		//4. 화물적재량- op2에 저장
		System.out.println("3. 트럭의 화물적재량(톤)을 입력하세요 (ex: 1)");
		System.out.print("화물적재량(톤):");
		do{
			if(op2!=99){
				System.out.println("다시 입력하세요");
			}
			op2 = scan.nextInt();
		} while (op2!=1&&op2!=5&&op2!=10);
	}
	
//
//
// 버스 주문
//
//
	
	private void busOrder(){
		printBus();
		System.out.println("");
		
		//1. 엔진타입 - a에 저장
		System.out.println("1. 엔진 타입을 입력하세요");
		System.out.println("1.디젤");
		System.out.println("2.LNG");
		System.out.print("엔진타입:");
		do{
			if(aPick!=99){
				System.out.println("다시 입력하세요");
			}
			aPick = scan.nextInt();
		} while (aPick>2);
		a=(aPick==1?"디젤":"LNG");
		
		//2. 엔진용량 - b에 저장
		System.out.println("2. 엔진 용량을 입력하세요 (ex: 3000)");
		System.out.print("엔진용량:");
		do{
			if(b!=99){
				System.out.println("다시 입력하세요");
			}
			b = scan.nextInt();
		} while (b!=3000&&b!=4000);
		
		//3.  버스종류 - op1에 저장
		System.out.println("3. 버스종류를 선택하세요");
		System.out.println("1.고속버스(45인승)");
		System.out.println("2.일반버스(60인승)");
		System.out.print("버스종류:");
		do{
			if(op1Pick!=99){
				System.out.println("다시 입력하세요");
			}
			op1Pick = scan.nextInt();
		} while (op1Pick>2);
		op1= (op1Pick==1?"고속버스":"일반버스");
		
		//4.  승차인원 - op2에 저장
		if (op1=="고속버스"){
			op2 = 45; //고속버스일 경우 승차인원 45명
		} else {
			op2 = 60; //일반버스일 경우 승차인원 60명
		}
	}

	
	/**************캡슐화*************/	 

	//주문받고 입력하는 과정을 private화 하여 Order 클래스의 멤버변수에 저장
	//객체명.변수명을 통해 호출하는 방법은 안전하지 않을 수 있음.
	//멤버변수에 저장된 값을 사용하기 위한 메소드를 다음과 같이 public 접근제한자로 정의
	public String getA (){
		return a;
	} 	 
	public int getB (){
		return b;
	}
	public String getOp1 (){
		return op1;
	}
	public int getOp2 (){
		return op2;
	}

	
	/*****************차종별 선택가능한 모든 사양 주문전에 출력********************/
	private static void printTruck() {
		System.out.println("-----------화물차-----------");
		System.out.println("1. 엔진타입: 디젤");
		System.out.println("2. 엔진용량: 3000, 4000, 5000");
		System.out.println("3. 바퀴 수: 4, 6, 10");
		System.out.println("4. 화물 적재량: 1톤, 5톤, 10톤");
		System.out.println("--------------------------");
	}

	private static void printBus() {
		System.out.println("------------버스------------");
		System.out.println("1. 엔진타입: 디젤, LNG");
		System.out.println("2. 엔진용량: 3000, 4000");
		System.out.println("3. 버스종류: 고속버스, 시내버스");
		System.out.println("4. 승차인원: 고속버스(45인), 시내버스(60명)");
		System.out.println("--------------------------");
	}

	private static void printAuto() {
		System.out.println("-----------승용차-----------");
		System.out.println("1. 엔진타입: 가솔린, 디젤, LPG, LNG");
		System.out.println("2. 엔진용량: 1500, 2000, 2500, 3000");
		System.out.println("3. 색상: 백색, 검정, 노랑, 파랑, 빨강, 보라");
		System.out.println("4. 승차인원: 2인, 5인, 7인");
		System.out.println("--------------------------");		
	}

} //class끝
