
public class Bus extends Car {
	private String busType = "버스종류";
	private int capacity;
	
	public Bus(){
		super(2);
	}
	
	public Bus(String engineType, int engineCapa, String busType, int capacity){
		super(2, engineType, engineCapa);
		this.busType=busType;
		this.capacity=capacity;
	}
	
	
	@Override
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
		this.engineType = typeString;
		
		return true;
	}
	
	@Override
	public boolean setEngineCapa(int capa) {
		if (capa!=3000
			&& capa!=4000)
			return false;
		
		this.engineCapa = capa;
		return true;
	}
	
	public boolean setBusType(int busType) {
		if (busType > 1 || busType <= 0)
			return false;		
		this.busType = busType==1?"고속버스":"일반버스";
		this.capacity= busType==1?45:60;
		return true;
	}
	
	
	private void printBus() {
		System.out.println("------------버스------------");
		System.out.println("1. 엔진타입: 디젤, LNG");
		System.out.println("2. 엔진용량: 3000, 4000");
		System.out.println("3. 버스종류: 고속버스, 시내버스");
		System.out.println("4. 승차인원: 고속버스(45인), 시내버스(60명)");
		System.out.println("--------------------------");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}
	
}
