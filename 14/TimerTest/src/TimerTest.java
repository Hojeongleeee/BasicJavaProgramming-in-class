import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest{
	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.schedule(new WorkTask(), 1000, 1000);
		System.out.println("Timer out");
		//timer.cancel();
	}

	public static class WorkTask extends TimerTask {
		int i =0;

		@Override
		public void run() {
			//Date dt = new Date();
			TimeDefine time = new TimeDefine();
			//if(i++ < 10)  System.out.println(dt.getSeconds());
			if(i++ < 10)  System.out.println(time.timeStr());
			else return;
		}
	}
}
