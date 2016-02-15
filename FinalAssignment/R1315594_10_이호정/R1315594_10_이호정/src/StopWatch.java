import java.util.Timer;
import java.util.TimerTask;

/*
 * main 포함 클래스
 * Frame 최초 생성
 * WorkTask (Inner Class) - Timer에 의해 반복되는 스레드 실행마다 호출
 * run() - WorkTask 수행할 구체적인 기능 구현
 */
public class StopWatch {

	public static void main(String[] args) {
		StopWatchFrame swf =	new StopWatchFrame();
		Timer timer = new Timer();
		timer.schedule(new WorkTask(swf), 100, 10); //0.01초에 한번씩 명령 수행

	} //main
} //StopWatch 끝

//WorkTask
class WorkTask extends TimerTask {
	StopWatchFrame swf;
	public WorkTask(StopWatchFrame swf){
		this.swf=swf;
	}

	@Override
	public void run() {
		swf.newPanel();
	} //run 끝
}//WorkTask Class 끝



