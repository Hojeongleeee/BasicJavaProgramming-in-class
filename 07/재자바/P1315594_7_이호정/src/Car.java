/* P1315594_7_��ȣ�� (�濵�к�)
 * �ڵ��� �ֹ��� �ۼ� ���α׷�
 * Car.java - �ڵ��� ����Ŭ����, �ڵ����� �������� �Ӽ�/��� ����
 */
abstract class Car {
	//���� Ŭ����
	//��� �ڵ����� �������� �⺻ �Ӽ�
	//Super�� ���� ȣ��� �޼ҵ��
	
	static int engineNum=0; // ���� �ø��� �ѹ�, Ŭ��������
	protected int carDefine; // ������ (1: �¿���, 2: ����, 3: Ʈ��)
	protected int engineCapa; // ���� �뷮
	protected String engineType; // ���� ����
		
	Car (){
		engineNum++; //�ø���ѹ� ������Ű�� ������, Ŭ��������
	}
	
	abstract public boolean setEngineType(int type); //����Ÿ��

	abstract public boolean setEngineCapa(int capa); //�����뷮

	abstract public void drive(); //����
	
	abstract public void result(); //�ش� �������� �Ӽ��� ������

}
