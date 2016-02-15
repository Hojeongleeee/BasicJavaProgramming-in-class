
public class Bus extends Automobile{
	String uses;
	int passengerLimit;
	
	public Bus(){
		super("LNG", 3000);
		uses ="시내버스";
		passengerLimit = 60;
	}
	public Bus(String eType, int eCapa, String service, int passenger){

	
	}
	public void drive(){
		if (uses == "고속버스")
		     System.out.println("주행제한속도는 100Km/h 입니다.");
		else System.out.println("주행제한속도는 60Km/h 입니다.");
	}
}
