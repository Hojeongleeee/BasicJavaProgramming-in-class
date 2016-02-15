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
		timer.schedule(new WorkTask(dcf), 5000, 10); //0.01檬俊 茄锅究

	} //main
} //StopWatch 场

//WorkTask
class WorkTask extends TimerTask {
	DigitalClockFrame dcf;
	public WorkTask(DigitalClockFrame dcf){
		this.dcf=dcf;
	}

	@Override
	public void run() {
		dcf.newPanel();
	} //run 场
}//WorkTask Class 场



