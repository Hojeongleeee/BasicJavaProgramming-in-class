import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class StopWatch {

	public static void main(String[] args) {

		DigitalClockFrame dcf =	new DigitalClockFrame();
		Timer timer = new Timer();
		timer.schedule(new WorkTask(dcf), 100, 100); //0.01초에 한번씩 명령 수행

	} //main
} //StopWatch 끝

//WorkTask
class WorkTask extends TimerTask {
	DigitalClockFrame dcf;
	public WorkTask(DigitalClockFrame dcf){
		this.dcf=dcf;
	}

	@Override
	public void run() {
		dcf.newPanel();
	} //run 끝
}//WorkTask Class 끝



