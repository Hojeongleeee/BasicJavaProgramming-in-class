/* P1315594_7_��ȣ�� (�濵�к�)
 * �ڵ��� �ֹ��� �ۼ� ���α׷�
 * Truck.java - �ڵ����� ����Ŭ����, Ʈ���� �Ӽ�/��� ���
 */
class Truck extends Car {
	int wheels; //������ 4, 6, 10
	int load; //1��, 5��, 10��

	//op1, op2�� �Ű������� �� AutoMobile Ŭ������ ��ü ������
	Truck(String a, int b, String op1, int op2){
		super(a,b);
		wheels = Integer.parseInt(op1);
		load = op2;
	}

	public void drive(){
		System.out.println("�ְ� 80Km/h ���Ѽӵ�");
	}

	public void result() {
			System.out.println("-------������ Ʈ��-------");
			System.out.println("������ȣ:"+engineNum);
			System.out.println("����Ÿ��:"+engineType);
			System.out.println("�����뷮:"+engineCapa);
			System.out.println("������:"+wheels+"��");
			System.out.println("ȭ�����緮:"+load+"��");
	}

}
