/*P1315594_9_��ȣ�� (�濵�к�)
 * 
 * CPU�� �� Word�� Main memory�� ����ϰ� �̸� Printer�� �о� ����Ѵ�.
 * Main memory��  �� �� word�� ����ϴ� Buffer�� �����ϰ� 
 * CPU(Producer)�� Printer(Consumer)�� �۾��ϴ� Simulator�� �����Ͻÿ�.
 * 
 * ProducerConsumer.class - main ����, Producer, Consumer�� start()
 */

public class ProducerConsumer {
	public static void main(String args[]) {
		Buffer buff = new Buffer();
		Producer p1 = new Producer(buff);
		Consumer c1 = new Consumer(buff);
		p1.start() ; // ������ ���� (run)
		c1.start() ; // ������ ���� (run)
	}
}
