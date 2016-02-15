/* P1315594_7_이호정 (경영학부)
 * 자동차 주문서 작성 프로그램
 * Car.java - 자동차 상위클래스, 자동차의 공통적인 속성/기능 정의
 */
abstract class Car {
	//상위 클래스
	//모든 자동차에 공통적인 기본 속성
	//Super를 통해 호출될 메소드들
	
	static int engineNum=0; // 엔진 시리얼 넘버, 클래스변수
	protected int carDefine; // 차종류 (1: 승용차, 2: 버스, 3: 트럭)
	protected int engineCapa; // 엔진 용량
	protected String engineType; // 엔진 종류
		
	Car (){
		engineNum++; //시리얼넘버 증가시키는 생성자, 클래스변수
	}
	
	abstract public boolean setEngineType(int type); //엔진타입

	abstract public boolean setEngineCapa(int capa); //엔진용량

	abstract public void drive(); //주행
	
	abstract public void result(); //해당 차종만의 속성을 결과출력

}
