
public class Automobile {
	String engineType;
	int engineCapacity;
	static public int engineNumber = 0;
	
	public Automobile(){
		engineType = "���ָ�";
		engineCapacity = 1500;
		engineNumber ++;
	}
	
	public Automobile(String type, int capacity){

		
	}
	public void drive(){
		System.out.println("�ڵ����� ���Ѽӵ��� 100Km/h �Դϴ�.");
	}

}
