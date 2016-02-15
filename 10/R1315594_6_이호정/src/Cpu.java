/*R1315594_6_��ȣ�� (�濵�к�)
 * 
 * Keyboard���� �ԷµǴ� ���ڵ��� �����ϴ� Buffer�� ũ��� 2����Ʈ
 * �̸� CPU�� Ȱ���ϴ� Simulator ���α׷��� �ۼ��Ͻÿ�
 * 
 * Cpu.class - �Է¹��� ���ڸ� �����ͼ� Ȱ���ϴ� ������ run()
 */

class Cpu extends Thread {

	private Buffer b;

	public Cpu(Buffer buff) {
		b = buff;
	}
	public void run() {
		//CPUȰ��
		for (int i=0;i<10;i++){ //10ȸ
			try {
				sleep(50);
				/* ���� KeyBoard �Է� ���� CPU return value�� ������� �ʰ� �ϱ� ����
				 * KeyBoard input�� CPU return value�� ���� ����� ����
				 */
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			int[] value=b.get(); //CPU�� �Է¹��� ���� Ȱ���ϱ� ���� get���� �� ��������
			System.out.println("CPU return value: \t"+(char)value[0]+(char)value[1]);
			//Ȱ��!
		}
	}

}

