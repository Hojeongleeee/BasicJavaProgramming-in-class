/*P1315594_9_��ȣ�� (�濵�к�)
 * 
 * CPU�� �� Word�� Main memory�� ����ϰ� �̸� Printer�� �о� ����Ѵ�.
 * Main memory��  �� �� word�� ����ϴ� Buffer�� �����ϰ� 
 * CPU(Producer)�� Printer(Consumer)�� �۾��ϴ� Simulator�� �����Ͻÿ�.
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
