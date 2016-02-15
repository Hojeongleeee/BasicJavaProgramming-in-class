package ddd;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.Timer;

class CirclePanel extends JPanel{
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.CYAN);
		g.fillOval(80, 80, 340, 340);
		Calendar dt = Calendar.getInstance();
		int i;
		Font etc;
		etc = new Font("SansSerif",Font.BOLD,30);
		g.setFont(etc);
		g.setColor(Color.BLUE);
		g.drawString(dt.get(Calendar.YEAR)+"³â "+
				(dt.get(Calendar.MONTH)+1)+"¿ù "+
				dt.get(Calendar.DATE)+"ÀÏ",130,200);
		g.setColor(Color.RED);
		etc = new Font("±¼¸²",Font.ITALIC,40);
		g.setFont(etc);
		g.drawString(dt.get(Calendar.HOUR)+":"+((i= dt.get(Calendar.MINUTE))<=9?"0"+i:i)+":"
				+((i= dt.get(Calendar.SECOND))<=9?"0"+i:i),170,300);

		/*		int d1 = calcDegree(1,dt.get(Calendar.HOUR),dt.get(Calendar.MINUTE));
		g.fillArc(80, 80, 340, 340, 90-d1, d1);
		d1 = calcDegree(2,dt.get(Calendar.HOUR),dt.get(Calendar.MINUTE));
		g.setColor(Color.BLUE);
		g.fillArc(120, 120, 260, 260, 90-d1, d1);
		d1 = calcDegree(3,dt.get(Calendar.HOUR),dt.get(Calendar.SECOND));
		g.setColor(Color.YELLOW);
		g.fillArc(140, 140, 220, 220, 90-d1, d1);*/
	}
}

class CircleFrame extends JFrame{
	Container ct;
	CirclePanel cp;
	public CircleFrame() {
		setTitle("DrawCircle Test");
		ct = getContentPane();
		cp = new CirclePanel();
		ct.add(cp);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void newPanel(){
		ct.remove(cp);
		cp = new CirclePanel();
		ct.add(cp);
		setVisible(true);
	}
}

class WorkTask extends TimerTask {
	CircleFrame wcf;
	public WorkTask(CircleFrame cf){
		wcf = cf;
	}
	@Override
	public void run() {
		wcf.newPanel();
	}
}

public class DigitalClock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer timer = new Timer();
		CircleFrame cf = new CircleFrame();
		timer.schedule(new WorkTask(cf), 0, 1000);

	}

}
