
public class Truck extends Automobile{
	
	int noOfWheel;
	int cargoCapacity;
	
	public Truck(){
		super("디젤", 3000);
		noOfWheel = 4;
		cargoCapacity = 1000;
	}
	
	public Truck(String eType, int eCapa, int wheels, int cargo){

	
	}

	public void drive(){
		System.out.println("주행제한속도는 80Km/h 입니다.");
	}
}
