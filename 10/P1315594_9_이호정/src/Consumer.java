/*P1315594_9_��ȣ�� (�濵�к�)
 * 
 * CPU�� �� Word�� Main memory�� ����ϰ� �̸� Printer�� �о� ����Ѵ�.
 * Main memory��  �� �� word�� ����ϴ� Buffer�� �����ϰ� 
 * CPU(Producer)�� Printer(Consumer)�� �۾��ϴ� Simulator�� �����Ͻÿ�.
 * 
 * Consumer.class - run(){get()}
 */

class Consumer extends Thread {
	
	private Buffer b;
	
	public Consumer(Buffer buff) {
		b = buff;
	}
	public void run() {
		int value=0;
		for (int i = 1 ; i <= 10 ; i++ ){
			try {
				sleep(80);	
				/* ���带 ����ϴ� ����� ����Ǳ� ���� �Է��� ���� �ʱ� ���� 
				 * Producer�� Consumer�� ������ ����Ǳ� ����
				 */
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			value = b.get(); //put�� Synchronize
			System.out.println("Printer Output:\t"+value);
		}

	}
}
