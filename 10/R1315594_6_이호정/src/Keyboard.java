/*R1315594_6_이호정 (경영학부)
 * 
 * Keyboard에서 입력되는 문자들을 저장하는 Buffer의 크기는 2바이트
 * 이를 CPU가 활용하는 Simulator 프로그램을 작성하시오
 * 
 * Keyboard.class - 키보드에서 입력되는 문자 스레드 run()
 */

import java.util.Random;

class Keyboard extends Thread {
	Random random = new Random();
	
	private Buffer b;
	
	public Keyboard(Buffer buff) {
		b = buff;
	}
	
	public void run() {
		int[] value= new int[2]; //버퍼공간
		//입력
		for(int i=0;i<10;i++){
			try { //기다리기
				sleep(50);
				/* 다음 KeyBoard 입력 전에 CPU return Value를 출력하지 않게 하기 위해
				 * KeyBoard input과 CPU return value의 교차 출력을 위해
				 */
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			value[0]=random.nextInt(128); //다음번째 키보드 입력 1번째
			value[1]=random.nextInt(128); //다음번째 키보드 입력 2번째
			b.put(value); //버퍼를 input
		}
	}
}
