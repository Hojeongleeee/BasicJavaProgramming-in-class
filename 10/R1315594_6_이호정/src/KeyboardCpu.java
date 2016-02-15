/*R1315594_6_이호정 (경영학부)
 * 
 * Keyboard에서 입력되는 문자들을 저장하는 Buffer의 크기는 2바이트
 * 이를 CPU가 활용하는 Simulator 프로그램을 작성하시오
 * 
 * KeyboardCpu.class - main 포함, 스레드 동시수행
 */

public class KeyboardCpu {
	public static void main(String args[]) {
		Buffer buff = new Buffer();
		Keyboard keyboard = new Keyboard(buff);
		Cpu cpu = new Cpu(buff);
		
		//다중스레드 동시수행
		keyboard.start();
		cpu.start();
	}
}
