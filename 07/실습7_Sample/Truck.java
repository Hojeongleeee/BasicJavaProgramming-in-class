
public class Truck extends Automobile{
	
	int noOfWheel;
	int cargoCapacity;
	
	public Truck(){
		super("����", 3000);
		noOfWheel = 4;
		cargoCapacity = 1000;
	}
	
	public Truck(String eType, int eCapa, int wheels, int cargo){

	
	}

	public void drive(){
		System.out.println("�������Ѽӵ��� 80Km/h �Դϴ�.");
	}
}
