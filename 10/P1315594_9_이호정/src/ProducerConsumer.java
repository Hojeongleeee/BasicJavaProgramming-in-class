/*P1315594_9_이호정 (경영학부)
 * 
 * CPU는 한 Word를 Main memory로 기록하고 이를 Printer가 읽어 출력한다.
 * Main memory에  이 한 word를 기록하는 Buffer를 설정하고 
 * CPU(Producer)와 Printer(Consumer)가 작업하는 Simulator를 설계하시오.
 * 
 * ProducerConsumer.class - main 포함, Producer, Consumer의 start()
 */

public class ProducerConsumer {
	public static void main(String args[]) {
		Buffer buff = new Buffer();
		Producer p1 = new Producer(buff);
		Consumer c1 = new Consumer(buff);
		p1.start() ; // 스레드 수행 (run)
		c1.start() ; // 스레드 수행 (run)
	}
}
