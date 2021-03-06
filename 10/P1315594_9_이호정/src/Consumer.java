/*P1315594_9_이호정 (경영학부)
 * 
 * CPU는 한 Word를 Main memory로 기록하고 이를 Printer가 읽어 출력한다.
 * Main memory에  이 한 word를 기록하는 Buffer를 설정하고 
 * CPU(Producer)와 Printer(Consumer)가 작업하는 Simulator를 설계하시오.
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
				/* 워드를 출력하는 명령이 수행되기 전에 입력을 받지 않기 위해 
				 * Producer와 Consumer가 번갈아 실행되기 위해
				 */
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			value = b.get(); //put과 Synchronize
			System.out.println("Printer Output:\t"+value);
		}

	}
}
