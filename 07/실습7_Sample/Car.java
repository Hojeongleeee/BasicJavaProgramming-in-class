
public class Car extends Automobile{
	String carColor;
	int noOfPassenger;
	public Car(){
		super();
		carColor = "백색";
		noOfPassenger = 5;
	}
	
	public Car(String eType, int eCapa, String color, int passenger){

	
	}
	public void drive(){
		System.out.println("주행제한속도는 110Km/h 입니다.");
	}
}
