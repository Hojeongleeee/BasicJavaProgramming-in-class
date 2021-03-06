/* P1315594_7_이호정 (경영학부)
 * 자동차 주문서 작성 프로그램
 * Bus.java - 자동차의 하위클래스, 버스의 속성/기능 기술
 */
public class Bus extends Car {
	String bustype; //고속버스, 시내버스
	int capacity; //고속버스(45인), 시내버스(60인)


	//op1, op2를 매개변수로 한 Bus 클래스의 객체 생성자
	Bus(String a, int b, String op1, int op2){
		super(a,b);
		bustype = op1;
		capacity = op2;
	}

	public void drive(){
		if (bustype=="고속버스"){
			System.out.println("최고 100Km/h 제한속도");
		} else {
			System.out.println("최고 60Km/h 제한속도");
		}

	}

	public void result() {
			System.out.println("-------구매한 버스-------");
			System.out.println("엔진번호:"+engineNum);
			System.out.println("엔진타입:"+engineType);
			System.out.println("엔진용량:"+engineCapa);
			System.out.println("버스종류:"+bustype);
			System.out.println("승차인원:"+capacity+"명");
	}

}
