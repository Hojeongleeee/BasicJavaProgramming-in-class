
public class Bus extends Automobile{
	String uses;
	int passengerLimit;
	
	public Bus(){
		super("LNG", 3000);
		uses ="�ó�����";
		passengerLimit = 60;
	}
	public Bus(String eType, int eCapa, String service, int passenger){

	
	}
	public void drive(){
		if (uses == "��ӹ���")
		     System.out.println("�������Ѽӵ��� 100Km/h �Դϴ�.");
		else System.out.println("�������Ѽӵ��� 60Km/h �Դϴ�.");
	}
}
