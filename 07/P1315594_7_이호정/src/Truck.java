/* P1315594_7_이호정 (경영학부)
 * 자동차 주문서 작성 프로그램
 * Truck.java - 자동차의 하위클래스, 트럭의 속성/기능 기술
 */
class Truck extends Car {
	int wheels; //바퀴수 4, 6, 10
	int load; //1톤, 5톤, 10톤

	//op1, op2를 매개변수로 한 AutoMobile 클래스의 객체 생성자
	Truck(String a, int b, String op1, int op2){
		super(a,b);
		wheels = Integer.parseInt(op1);
		load = op2;
	}

	public void drive(){
		System.out.println("최고 80Km/h 제한속도");
	}

	public void result() {
			System.out.println("-------구매한 트럭-------");
			System.out.println("엔진번호:"+engineNum);
			System.out.println("엔진타입:"+engineType);
			System.out.println("엔진용량:"+engineCapa);
			System.out.println("바퀴수:"+wheels+"개");
			System.out.println("화물적재량:"+load+"톤");
	}

}
