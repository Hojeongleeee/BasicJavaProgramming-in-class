
public class Player extends YutBundle {
	
	int score = 0; //������� ������ �������� score�� ����	
	int time = 1; //������� �� ���� �������� time���� ����
	int result = 0; //���� ���� �� 1ȸ ������ ��� ����
	
	public void playing (){ //1�� �� �߻��ϴ� ���

		boolean chk = true;
			while (chk){ //��, �� ������ �̻� ���� ��õ� ����
				result = throwingAll(); 
					//result : ����� ����, ystate�迭�� index�� ����
				
				switch(result) {
				case 0:
					score += 5; //result��  ���϶� +5 �� while�� Ż�� ���� �������
					printResult(result);
					break;
				case 4:
					score += result; //result��  ���϶� +4 �� while�� Ż�� ���� �������
					printResult(result);
					break;
				case 5:
					score --; //result�� 5�̸� �鵵
					printResult(result);
					chk = false;
					break; //player�� ���� �����
				default :
					score += result; //result�� 1,2,3 �̸� ��, ��, ��
					printResult(result);
					chk = false;
					break; //player�� ���� �����
				} //switch ��
			} //while �� = �� ��
			time++; //�� 1ȸ ������Ű��
	} //playing()��
	
	private void printResult (int i){ 
			// i�� throwingAll()�� return�� (����� ����)
		
		String ystate[] = new String []{"��","��","��","��","��","�鵵"}; 
			//0,1,2,3,4,5 index�� ���̴� ���ڴ� ����� ����
			//throwingAll()�κ��� �鵵�� ���� 5�� ����
		System.out.print(" "+ystate[i]); // �� ������ ����� ȭ�鿡 ǥ��
	} //printResult()��
	
}
