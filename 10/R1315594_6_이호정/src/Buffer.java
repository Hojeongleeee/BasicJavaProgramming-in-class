/*R1315594_6_��ȣ�� (�濵�к�)
 * 
 * Keyboard���� �ԷµǴ� ���ڵ��� �����ϴ� Buffer�� ũ��� 2����Ʈ
 * �̸� CPU�� Ȱ���ϴ� Simulator ���α׷��� �ۼ��Ͻÿ�
 * 
 * Buffer.class - Keyboard�� put(), Cpu�� get()
 */

import java.util.Random;


class Buffer {
	Random random = new Random();
	private int contents[]={0,0};
	private boolean available = false; //put���� ����

	//put, Ű���� �Է� (Priority 1)
	public synchronized void put(int[] keyinput) { 
		while (available == true) {
			try{
				wait();
			}
			catch (InterruptedException e) {}
		} //wait��
		
		contents = keyinput; //�Ű����� 2����Ʈ �迭�� ����
		System.out.println("KeyBoard input: \t"+(char)contents[0]+(char)contents[1]);
		available = true; //�������� get
		notify();
	}
	
	//get, CPUȰ�� (Priority 2)
	public synchronized int[] get() {
		while (available == false) {
			try {
				wait();
			}
			catch (InterruptedException e) {}
		} //wait��
		
		available = false; //�������� put
		notify();
		return contents; //2����Ʈ �迭 ����	
	}
	
}
