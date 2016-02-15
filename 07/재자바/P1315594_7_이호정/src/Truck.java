/* P1315594_7_이호정 (경영학부)
 * 자동차 주문서 작성 프로그램
 * Truck.java - 자동차의 하위클래스, 트럭만의 속성/기능 기술
 */
public class Truck extends Car {
	private int wheels=0; //바퀴 수
	private int load; //화물적재량
	
	public Truck(){ //생성자
		super(); //Car클래스 생성자, EngineNum++
	}
	
	void printTruck(){//선택가능 사양 미리 출력
		System.out.println("-----------화물차-----------");
		System.out.println("1. 엔진타입: 디젤");
		System.out.println("2. 엔진용량: 3000, 4000, 5000");
		System.out.println("3. 바퀴 수: 4, 6, 10");
		System.out.println("4. 화물 적재량: 1톤, 5톤, 10톤");
		System.out.println("--------------------------");
	}
	
	//1.엔진타입
	public boolean setEngineType(int type) {
		this.engineType = "디젤";
		return true;
	}
	
	//2.엔진용량
	public boolean setEngineCapa(int capa) {
		if (capa!=3000
			&& capa!=4000
			&& capa!=5000)
			return false; //반복그만
		this.engineCapa = capa; //객체속성에 입력받은 값 저장
		return true;
	}
	
	//3.바퀴수
	public boolean setWheels(int wheels) {
		if (wheels!=4
			&& wheels!=6
			&& wheels!=10)
			return false; //반복그만
		this.wheels = wheels;//객체속성에 입력받은 값 저장
		return true;
	}
	
	//4.화물적재량
	public boolean setLoad(int load) {
		if (load != 1
			&& load != 5
			&& load != 10)
			return false;
		
		this.load = load;//객체속성에 입력받은 값 저장
		return true;
	}

	@Override
	public void drive() {
		System.out.println("최고 80Km/h 제한속도");
	}

	@Override
	public void result() {
		System.out.println("바퀴수:"+wheels);
		System.out.println("화물적재량:"+load);
		drive();
	}
}
