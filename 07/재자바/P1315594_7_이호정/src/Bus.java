/* P1315594_7_이호정 (경영학부)
 * 자동차 주문서 작성 프로그램
 * AutoMobile.java - 자동차의 하위클래스, 버스만의 속성/기능 기술
 */
public class Bus extends Car {
	private String busType = "버스종류";
	private int capacity;
	
	public Bus(){
		super();//Car클래스 생성자, EngineNum++
	}
	
	void printBus() {//선택가능 사양 미리 출력
		System.out.println("------------버스------------");
		System.out.println("1. 엔진타입: 디젤, LNG");
		System.out.println("2. 엔진용량: 3000, 4000");
		System.out.println("3. 버스종류: 고속버스, 시내버스");
		System.out.println("4. 승차인원: 고속버스(45인), 시내버스(60명)");
		System.out.println("--------------------------");
	}
	
	//1.엔진타입
	public boolean setEngineType(int type) {
		if (type > 2 || type <= 0)
			return false;
		
		String typeString = "미정";
		switch (type){ //객관식답: String으로 저장
		case 1:
			typeString = "디젤";
			break;
		case 2:
			typeString = "LNG";
			break;
		}
		this.engineType = typeString;//객체속성에 String 저장
		
		return true;
	}
	
	//2.엔진용량
	public boolean setEngineCapa(int capa) {
		if (capa!=3000
			&& capa!=4000)
			return false;
		this.engineCapa = capa;//객체속성에 입력받은 값 저장
		return true;
	}
	
	//3.버스종류, 4.승차인원
	public boolean setBusType(int busType) {
		if (busType > 1 && busType <= 0)
			return false;		
		this.busType = busType==1?"고속버스":"일반버스";//객체속성에 입력받은 값 저장
		this.capacity= busType==1?45:60;//객체속성에 해당하는 값 저장
		return true;
	}


	@Override
	public void drive() {
		if (busType=="고속버스"){
			System.out.println("최고 100Km/h 제한속도");
		} else {
			System.out.println("최고 60Km/h 제한속도");
		}
	}
	
	@Override
	public void result(){
			System.out.println("버스종류:"+busType);
			System.out.println("승차인원:"+capacity);
			drive();
	}
}
