package DigitalClock;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DigitalClock {

	public static void main(String[] args) {
		Timer timer = new Timer();
		DigitalClockFrame dcf =	new DigitalClockFrame();
		timer.schedule(new WorkTask(dcf), 1000, 1000);
	} //main
} //DigitalClock 끝

/********************************************************/
//Inner Class
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

/********************************************************/
class DigitalClockPanel extends JPanel{
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		//시각 가져오기
		TimeDefine time = new TimeDefine();

		//시계그리기
		g.setColor(Color.orange);
		g.drawOval(30, 30, 180, 180);
		g.fillOval(30, 30, 180, 180);
		Font f = new Font("돋움",Font.BOLD, 25);
		g.setFont(f);
		
		//시각쓰기
		g.setColor(Color.black);
		g.drawString(time.ymdStr(), 60, 120);
		g.drawString(time.timeStr(), 63, 150);
	}
}

/********************************************************/
class DigitalClockFrame extends JFrame{
	Container ct;
	DigitalClockPanel dcp;
	
	//생성자
	public DigitalClockFrame() {
		setTitle("Draw Digital Circle");
		ct = getContentPane();
		ct.add(dcp = new DigitalClockPanel()); //시계
		
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	//WorkTask
	public void newPanel(){ //새로그리기
		ct.remove(dcp);
		ct.add(dcp=new DigitalClockPanel());
		setVisible(true);
	}
}

