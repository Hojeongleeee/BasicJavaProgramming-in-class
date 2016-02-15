/* P1315594_7_이호정 (경영학부)
 * 자동차 주문서 작성 프로그램
 * AutoMobile.java - 자동차의 하위클래스, 승용차만의 속성/기능 기술
 */
class AutoMobile extends Car {
	private String option1="백색";
	private int capacity;
	
	public AutoMobile() {
		super();//Car클래스 생성자, EngineNum++
	}
	
	void printAuto() { //선택가능 사양 미리 출력
		System.out.println("-----------승용차-----------");
		System.out.println("1. 엔진타입: 가솔린, 디젤, LPG");
		System.out.println("2. 엔진용량: 1500, 2000, 2500, 3000");
		System.out.println("3. 색상: 백색, 검정, 노랑, 파랑, 빨강, 보라");
		System.out.println("4. 승차인원: 2인, 5인, 7인");
		System.out.println("--------------------------");		
	}
	
	//1.엔진타입
	public boolean setEngineType(int type) {
		if (type > 3 || type <= 0)
			return false;
		
		String typeString = "미정";
		switch (type){ //객관식답: String으로 저장
		case 1:
			typeString = "가솔린";
			break;
		case 2:
			typeString = "디젤";
			break;
		case 3:
			typeString = "LPG";
			break;
		}
		this.engineType = typeString;//객체속성에 String 값 저장
		
		return true;
	}
	
	//2.엔진용량
	public boolean setEngineCapa(int capa) {
		if (capa!=1500
			&& capa!=2000
			&& capa!=2500
			&& capa!=3000)
			return false;
		
		this.engineCapa = capa;//객체속성에 입력받은 값 저장
		return true;
	}
	
	//3.차량색상
	public boolean setCarColor(int color) {
		if (color > 6 || color <= 0)
			return false;
		
		String colorString = "백색";
		
		switch(color){
		case 1:
			colorString="백색";
			break;
		case 2:
			colorString="검정";
			break;
		case 3:
			colorString="노랑";
			break;
		case 4:
			colorString="파랑";
			break;
		case 5:
			colorString="빨강";
			break;
		case 6:
			colorString="보라";
			break;
		}
		this.option1 = colorString;//객체속성에 String 값 저장
		return true;
	}
	
	//4.승차인원
	public boolean setCapacity(int capacity) {
		if (capacity != 2
			&& capacity != 5
			&& capacity != 7)
			return false;
		
		this.capacity = capacity;//객체속성에 입력받은 값 저장
		return true;
	}
	
	@Override
	public void drive(){
		System.out.println("최고 110Km/h 제한속도");
	}
	
	@Override
	public void result() {
		System.out.println("색상:"+option1);
		System.out.println("승차인원:"+capacity);
		drive();
	}
	
	
}
