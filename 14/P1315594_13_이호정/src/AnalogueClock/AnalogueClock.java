package AnalogueClock;


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AnalogueClock {

	public static void main(String[] args) {
		Timer timer = new Timer();
		AnalogueClockFrame acf =	new AnalogueClockFrame();
		timer.schedule(new WorkTask(acf), 1000, 1000);
	} //main
} //AnalogueClock 끝

/********************************************************/
//Inner Class
class WorkTask extends TimerTask {
	AnalogueClockFrame acf;
	public WorkTask(AnalogueClockFrame acf){
		this.acf=acf;
	}
	
	@Override
	public void run() {
		acf.newPanel();
	} //run 끝
}//WorkTask Class 끝

/********************************************************/
class AnalogueClockPanel extends JPanel{
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.WHITE);
		g.drawOval(10, 10, 280, 280);
		g.fillOval(10, 10, 280, 280);
		
		//시각 가져오기
		TimeDefine time = new TimeDefine();
		
		//초침
		g.setColor(Color.yellow);
		g.fillArc(20, 20, 260, 260, 90, -time.getTime(2)*6); //-6*sec
		//분침
		g.setColor(Color.orange);
		g.fillArc(40, 40, 220, 220, 90, -time.getTime(1)*6); //-6*min
		//시침
		g.setColor(Color.cyan);
		g.fillArc(60, 60, 180, 180, 90, -time.getTime(0)*30-(int)(time.getTime(1)*0.5)); //-30*hrs+-0.5*min

		//시각쓰기
		Font f = new Font("돋움",Font.ITALIC,25);
		g.setFont(f);
		g.setColor(Color.black);
		g.drawString(time.ymdStr(), 80, 140);
		g.drawString(time.timeStr(), 83, 170);
	}
}

/********************************************************/
class AnalogueClockFrame extends JFrame{
	Container ct;
	AnalogueClockPanel acp;
	
	//생성자
	public AnalogueClockFrame() {
		setTitle("Draw Digital Circle");
		ct = getContentPane();
		ct.add(acp = new AnalogueClockPanel()); //시계
		
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	//WorkTask
	public void newPanel(){ //새로그리기
		ct.remove(acp);
		ct.add(acp=new AnalogueClockPanel());
		setVisible(true);
	}
}

