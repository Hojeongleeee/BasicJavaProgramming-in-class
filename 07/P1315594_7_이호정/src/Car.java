/* P1315594_7_이호정 (경영학부)
 * 자동차 주문서 작성 프로그램
 * Car.java - 자동차 상위클래스, 자동차의 공통적인 속성/기능 정의
 */
class Car {
	//상위 클래스
	//모든 자동차에 공통적인 기본 속성
	//Super를 통해 호출될 메소드들
	
	static public int engineNum;
	int engineCapa;
	String engineType;
	
	Car(){ //기본값 주는 생성자
		engineCapa=0;
		engineType="기본값";
	}
	
	Car(String engineType, int engineCapa){ //생성자 오버로딩
		this(); //현재 객체의 다른 생성자 호출
		this.engineType = engineType; //객체 속성에 매개변수 대입
		this.engineCapa = engineCapa; //객체 속성에 매개변수 대입
		engineNum++; //엔진번호는 모든 객체가 공유하는 static, 클래스 변수
	}
	
	
	public void drive(){
		//오버라이딩하세요~
	}
	
	public void result(){
		//오버라이딩하세요~
		
	}
}
