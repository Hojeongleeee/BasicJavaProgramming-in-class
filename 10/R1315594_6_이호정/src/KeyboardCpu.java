/*R1315594_6_��ȣ�� (�濵�к�)
 * 
 * Keyboard���� �ԷµǴ� ���ڵ��� �����ϴ� Buffer�� ũ��� 2����Ʈ
 * �̸� CPU�� Ȱ���ϴ� Simulator ���α׷��� �ۼ��Ͻÿ�
 * 
 * KeyboardCpu.class - main ����, ������ ���ü���
 */

public class KeyboardCpu {
	public static void main(String args[]) {
		Buffer buff = new Buffer();
		Keyboard keyboard = new Keyboard(buff);
		Cpu cpu = new Cpu(buff);
		
		//���߽����� ���ü���
		keyboard.start();
		cpu.start();
	}
}
