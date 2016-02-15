
public class Automobile {
	String engineType;
	int engineCapacity;
	static public int engineNumber = 0;
	
	public Automobile(){
		engineType = "가솔린";
		engineCapacity = 1500;
		engineNumber ++;
	}
	
	public Automobile(String type, int capacity){

		
	}
	public void drive(){
		System.out.println("자동차의 제한속도는 100Km/h 입니다.");
	}

}
