/* P1315594_7_��ȣ�� (�濵�к�)
 * �ڵ��� �ֹ��� �ۼ� ���α׷�
 * Truck.java - �ڵ����� ����Ŭ����, Ʈ������ �Ӽ�/��� ���
 */
public class Truck extends Car {
	private int wheels=0; //���� ��
	private int load; //ȭ�����緮
	
	public Truck(){ //������
		super(); //CarŬ���� ������, EngineNum++
	}
	
	void printTruck(){//���ð��� ��� �̸� ���
		System.out.println("-----------ȭ����-----------");
		System.out.println("1. ����Ÿ��: ����");
		System.out.println("2. �����뷮: 3000, 4000, 5000");
		System.out.println("3. ���� ��: 4, 6, 10");
		System.out.println("4. ȭ�� ���緮: 1��, 5��, 10��");
		System.out.println("--------------------------");
	}
	
	//1.����Ÿ��
	public boolean setEngineType(int type) {
		this.engineType = "����";
		return true;
	}
	
	//2.�����뷮
	public boolean setEngineCapa(int capa) {
		if (capa!=3000
			&& capa!=4000
			&& capa!=5000)
			return false; //�ݺ��׸�
		this.engineCapa = capa; //��ü�Ӽ��� �Է¹��� �� ����
		return true;
	}
	
	//3.������
	public boolean setWheels(int wheels) {
		if (wheels!=4
			&& wheels!=6
			&& wheels!=10)
			return false; //�ݺ��׸�
		this.wheels = wheels;//��ü�Ӽ��� �Է¹��� �� ����
		return true;
	}
	
	//4.ȭ�����緮
	public boolean setLoad(int load) {
		if (load != 1
			&& load != 5
			&& load != 10)
			return false;
		
		this.load = load;//��ü�Ӽ��� �Է¹��� �� ����
		return true;
	}

	@Override
	public void drive() {
		System.out.println("�ְ� 80Km/h ���Ѽӵ�");
	}

	@Override
	public void result() {
		System.out.println("������:"+wheels);
		System.out.println("ȭ�����緮:"+load);
		drive();
	}
}
