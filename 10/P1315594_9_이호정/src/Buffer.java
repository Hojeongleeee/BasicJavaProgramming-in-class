/*P1315594_9_이호정 (경영학부)
 * 
 * CPU는 한 Word를 Main memory로 기록하고 이를 Printer가 읽어 출력한다.
 * Main memory에  이 한 word를 기록하는 Buffer를 설정하고 
 * CPU(Producer)와 Printer(Consumer)가 작업하는 Simulator를 설계하시오.
 * 
 * Buffer.class - put(), get()
 */



class Buffer {
	private int contents;
	private boolean available = false;

	//getter contents
	public int getContents(){
		return contents;
	}
	
	//put
	public synchronized void put(int value) {
		while (available == true ) {
			try{
				wait();
			}
			catch (InterruptedException e) {}
		}

		contents = value;
		available = true;	
		notify();
	}
	
	//get
	public synchronized int get() {
		while (available == false ) {
			try {
				wait();
			}
			catch (InterruptedException e) {}
		}
			
		available = false;
		notify();
		return contents;
	}
}
