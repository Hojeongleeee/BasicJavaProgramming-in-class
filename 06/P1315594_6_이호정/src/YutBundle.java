
public class YutBundle {
	
	//�� 4���� ���� YutŬ������ ���� ��ü�� ����
	Yut yut1 = new Yut();
	Yut yut2 = new Yut();
	Yut yut3 = new Yut();
	Yut yut4 = new Yut();
	
	//�� 4���� ������ ����� ������ n���� ��ȯ
	public int throwingAll(){
		int n = yut1.throwing()+yut2.throwing()+yut3.throwing()+yut4.throwing(); 
			//������ ��ü�� throwing return������ boolHorT (��or��)
		return n; //����� ����
	}	
	
}
