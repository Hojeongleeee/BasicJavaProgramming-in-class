/*R1315594_6_이호정 (경영학부)
 * 
 * Keyboard에서 입력되는 문자들을 저장하는 Buffer의 크기는 2바이트
 * 이를 CPU가 활용하는 Simulator 프로그램을 작성하시오
 * 
 * Buffer.class - Keyboard의 put(), Cpu의 get()
 */

import java.util.Random;


class Buffer {
	Random random = new Random();
	private int contents[]={0,0};
	private boolean available = false; //put부터 실행

	//put, 키보드 입력 (Priority 1)
	public synchronized void put(int[] keyinput) { 
		while (available == true) {
			try{
				wait();
			}
			catch (InterruptedException e) {}
		} //wait끝
		
		contents = keyinput; //매개변수 2바이트 배열에 저장
		System.out.println("KeyBoard input: \t"+(char)contents[0]+(char)contents[1]);
		available = true; //다음으로 get
		notify();
	}
	
	//get, CPU활용 (Priority 2)
	public synchronized int[] get() {
		while (available == false) {
			try {
				wait();
			}
			catch (InterruptedException e) {}
		} //wait끝
		
		available = false; //다음으로 put
		notify();
		return contents; //2바이트 배열 리턴	
	}
	
}
