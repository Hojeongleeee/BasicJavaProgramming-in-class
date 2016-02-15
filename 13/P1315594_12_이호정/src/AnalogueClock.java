import java.awt.*;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class AnalogueClock {
	public static void main(String[] args) { //main
		new AnalogueClockFrame(); 
	}
}

class AnalogueClockPanel extends JPanel{
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.WHITE);
		g.drawOval(10, 10, 280, 280);
		g.fillOval(10, 10, 280, 280);
		
		//�ð� ��������
		TimeDefine time = new TimeDefine();
		
		//��ħ
		g.setColor(Color.yellow);
		g.fillArc(20, 20, 260, 260, 90, -time.getTime(2)*6); //-6*sec
		//��ħ
		g.setColor(Color.orange);
		g.fillArc(40, 40, 220, 220, 90, -time.getTime(1)*6); //-6*min
		//��ħ
		g.setColor(Color.cyan);
		g.fillArc(60, 60, 180, 180, 90, -time.getTime(0)*30-(int)(time.getTime(1)*0.5)); //-30*hrs+-0.5*min

		//�ð�����
		Font f = new Font("����",Font.ITALIC,25);
		g.setFont(f);
		g.setColor(Color.black);
		g.drawString(time.ymdStr(), 80, 140);
		g.drawString(time.timeStr(), 83, 170);
	}
}

class AnalogueClockFrame extends JFrame{
	public AnalogueClockFrame() {
		setTitle("Pie Chart");
		Container ct = getContentPane();
		ct.add(new AnalogueClockPanel());
		
		setSize(320,360);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
