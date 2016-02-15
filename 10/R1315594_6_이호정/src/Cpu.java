/*R1315594_6_이호정 (경영학부)
 * 
 * Keyboard에서 입력되는 문자들을 저장하는 Buffer의 크기는 2바이트
 * 이를 CPU가 활용하는 Simulator 프로그램을 작성하시오
 * 
 * Cpu.class - 입력받은 문자를 가져와서 활용하는 스레드 run()
 */

class Cpu extends Thread {

	private Buffer b;

	public Cpu(Buffer buff) {
		b = buff;
	}
	public void run() {
		//CPU활용
		for (int i=0;i<10;i++){ //10회
			try {
				sleep(50);
				/* 다음 KeyBoard 입력 전에 CPU return value를 출력하지 않게 하기 위해
				 * KeyBoard input과 CPU return value의 교차 출력을 위해
				 */
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			int[] value=b.get(); //CPU가 입력받은 값을 활용하기 위해 get으로 값 가져오기
			System.out.println("CPU return value: \t"+(char)value[0]+(char)value[1]);
			//활용!
		}
	}

}

