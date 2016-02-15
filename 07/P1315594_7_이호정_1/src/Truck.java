
public class Truck extends Car {
	private int wheels=0;
	private int load;
	
	public Truck(){
		super(3);
	}
	
	public Truck(String engineType, int engineCapa, int wheels, int load){
		super(3, engineType, engineCapa);
		
		this.wheels=wheels;
		this.load=load;
	}
	
	public void printTruck(){
		System.out.println("-----------ȭ����-----------");
		System.out.println("1. ����Ÿ��: ����");
		System.out.println("2. �����뷮: 3000, 4000, 5000");
		System.out.println("3. ���� ��: 4, 6, 10");
		System.out.println("4. ȭ�� ���緮: 1��, 5��, 10��");
		System.out.println("--------------------------");
	}
	
	@Override
	public boolean setEngineType(int type) {
		this.engineType = "����";
		return true;
	}
	
	@Override
	public boolean setEngineCapa(int capa) {
		if (capa!=3000
			&& capa!=4000
			&& capa!=5000)
			return false;
		
		this.engineCapa = capa;
		return true;
	}
	
	public boolean setWheels(int wheels) {
		if (wheels!=4
			&& wheels!=6
			&& wheels!=10)
			return false;
		this.wheels = wheels;
		return true;
	}
	
	public boolean setLoad(int load) {
		if (load != 1
			&& load != 5
			&& load != 10)
			return false;
		
		this.load = load;
		return true;
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("����?");
	}
}
