/*P1315594_9_��ȣ�� (�濵�к�)
 * 
 * CPU�� �� Word�� Main memory�� ����ϰ� �̸� Printer�� �о� ����Ѵ�.
 * Main memory��  �� �� word�� ����ϴ� Buffer�� �����ϰ� 
 * CPU(Producer)�� Printer(Consumer)�� �۾��ϴ� Simulator�� �����Ͻÿ�.
 * 
 * Producer.class - run(){put(a)}
 */
import java.util.Random;

class Producer extends Thread {

	private Buffer b;
	
	Random random = new Random();
	public Producer(Buffer buff) {
		b = buff;
	}
	
	public void run() {
		
		for (int i = 1; i <= 10;i++){
			try {
				sleep(80);	
				/* ���带 ����ϴ� ����� ����Ǳ� ���� �Է��� ���� �ʱ� ���� 
				 * Producer�� Consumer�� ������ ����Ǳ� ����
				 */
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			int a = random.nextInt(10);			
			b.put(a);
			System.out.println("CPU write:\t"+b.getContents());
		}
	}
}
