/* P1315594_7_이호정 (경영학부)
 * 자동차 주문서 작성 프로그램
 * Dealer.java - main, 주문객체, 자동차객체 생성 및 주문과정
 */
import java.util.Scanner;

public class Dealer {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int menu=0;
		int chk = 1; //자동차 구매 프로세스를 재실행 시키기 위한 flag 값, while문 조건으로 포함됨

		do{ //전체 과정 시작
			
			menu=firstmenu(); //주문할 차종 선택
			Order order = new Order(menu); //주문 객체 생성하기 (공통속성값 기본으로)
		
			
			System.out.println("엔진번호:"+order.orderedCar.engineNum);
			System.out.println("엔진타입:"+order.orderedCar.engineType);
			System.out.println("엔진용량:"+order.orderedCar.engineCapa);
			switch(order.orderedCar.carDefine){
			case 1:
				System.out.println("색상:"+99999);
				System.out.println("승차인원:"+99999);
				break;
			case 2:
				System.out.println("버스종류:"+99999);
				System.out.println("승차인원:"+99999);
				break;
			case 3:
				System.out.println("바퀴수:"+99999);
				System.out.println("화물적재량:"+99999);
			}

			
			System.out.println("다시 하시겠습니까? (예:1, 아니오:0)");
			chk = scan.nextInt();
		} while(chk==1); //전체과정 끝나고 재실행여부 검사
		
		
		System.out.println("-------안녕히가세요-------");
		//끝~
	} //main 끝

	/**********구매할 차종 선택하기*******/
	static int firstmenu(){
		int menu = 0;
		do {
			System.out.println("------차량 주문------");
			System.out.println("원하는 차량을 선택하세요");
			System.out.println("1.승용차");
			System.out.println("2.버스");
			System.out.println("3.화물차");
			menu = scan.nextInt();
		}	while(menu>3);

		return menu;
	}

} //class끝

