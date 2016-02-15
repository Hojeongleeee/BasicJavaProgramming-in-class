/*R1315594_6_��ȣ�� (�濵�к�)
 * 
 * Keyboard���� �ԷµǴ� ���ڵ��� �����ϴ� Buffer�� ũ��� 2����Ʈ
 * �̸� CPU�� Ȱ���ϴ� Simulator ���α׷��� �ۼ��Ͻÿ�
 * 
 * Keyboard.class - Ű���忡�� �ԷµǴ� ���� ������ run()
 */

import java.util.Random;

class Keyboard extends Thread {
	Random random = new Random();
	
	private Buffer b;
	
	public Keyboard(Buffer buff) {
		b = buff;
	}
	
	public void run() {
		int[] value= new int[2]; //���۰���
		//�Է�
		for(int i=0;i<10;i++){
			try { //��ٸ���
				sleep(50);
				/* ���� KeyBoard �Է� ���� CPU return Value�� ������� �ʰ� �ϱ� ����
				 * KeyBoard input�� CPU return value�� ���� ����� ����
				 */
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			value[0]=random.nextInt(128); //������° Ű���� �Է� 1��°
			value[1]=random.nextInt(128); //������° Ű���� �Է� 2��°
			b.put(value); //���۸� input
		}
	}
}
