/* P1315594_7_��ȣ�� (�濵�к�)
 * �ڵ��� �ֹ��� �ۼ� ���α׷�
 * AutoMobile.java - �ڵ����� ����Ŭ����, �¿������� �Ӽ�/��� ���
 */
class AutoMobile extends Car {
	String color="���";
	int capacity;

	//op1, op2�� �Ű������� �� AutoMobile Ŭ������ ��ü ������
	AutoMobile(String a, int b, String op1, int op2){
		super(a,b);
		color = op1;
		capacity = op2;
	}

	public void drive(){
		System.out.println("�ְ� 110Km/h ���Ѽӵ�");
	}

	public void result() {
			System.out.println("-------������ �ڵ���-------");
			System.out.println("������ȣ:"+engineNum);
			System.out.println("����Ÿ��:"+engineType);
			System.out.println("�����뷮:"+engineCapa);
			System.out.println("����:"+color+"��");
			System.out.println("�����ο�:"+capacity+"��");
	}

}
