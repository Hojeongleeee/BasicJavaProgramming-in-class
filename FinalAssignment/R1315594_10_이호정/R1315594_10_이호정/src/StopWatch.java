import java.util.Timer;
import java.util.TimerTask;

/*
 * main ���� Ŭ����
 * Frame ���� ����
 * WorkTask (Inner Class) - Timer�� ���� �ݺ��Ǵ� ������ ���ึ�� ȣ��
 * run() - WorkTask ������ ��ü���� ��� ����
 */
public class StopWatch {

	public static void main(String[] args) {
		StopWatchFrame swf =	new StopWatchFrame();
		Timer timer = new Timer();
		timer.schedule(new WorkTask(swf), 100, 10); //0.01�ʿ� �ѹ��� ��� ����

	} //main
} //StopWatch ��

//WorkTask
class WorkTask extends TimerTask {
	StopWatchFrame swf;
	public WorkTask(StopWatchFrame swf){
		this.swf=swf;
	}

	@Override
	public void run() {
		swf.newPanel();
	} //run ��
}//WorkTask Class ��



