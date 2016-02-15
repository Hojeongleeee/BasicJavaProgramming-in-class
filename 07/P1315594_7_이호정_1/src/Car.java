/* P1315594_7_이호정 (경영학부)
 * 자동차 주문서 작성 프로그램
 * Car.java - 자동차 상위클래스, 자동차의 공통적인 속성/기능 정의
 */
abstract class Car {
	//상위 클래스
	//모든 자동차에 공통적인 기본 속성
	//Super를 통해 호출될 메소드들
	
	static private int countOfCars; // 객체 갯수
	protected int engineNum; // 자동차 넘버
	protected int carDefine; // 차종류 (1: 승용차, 2: 버스, 3: 트럭)
	protected int engineCapa; // 엔진 용량
	protected String engineType; // 엔진 종류
		
	Car (int carDefine){
		this.carDefine = carDefine;	// 차종류 선택
		this.engineNum = countOfCars; // 현재 갯수를 자동차의 시리얼넘버로 저장
		countOfCars++;
	}
	
	Car(int carDefine, String engineType, int engineCapa){ //생성자 오버로딩
		this(carDefine);
		this.engineType = engineType; //객체 속성에 매개변수 대입
		this.engineCapa = engineCapa; //객체 속성에 매개변수 대입
		 //엔진번호는 모든 객체가 공유하는 static, 클래스 변수
	}
	
	public int getCarDefine() {
		return this.carDefine;
	}
	
	abstract public boolean setEngineType(int type);

	abstract public boolean setEngineCapa(int capa);

	abstract public void drive();
	

}
