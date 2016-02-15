import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class DigitalClock {

	public static void main(String[] args) {
		new DigitalClockFrame();
	}
}

class DigitalClockPanel extends JPanel{
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		//�ð� ��������
		TimeDefine time = new TimeDefine();
		
		//�ð�׸���
		g.setColor(Color.orange);
		g.drawOval(30, 30, 180, 180);
		g.fillOval(30, 30, 180, 180);
		Font f = new Font("����",Font.BOLD, 25);
		g.setFont(f);
		
		//�ð�����
		g.setColor(Color.black);
		g.drawString(time.ymdStr(), 60, 120);
		g.drawString(time.timeStr(), 63, 150);
	}
}


class DigitalClockFrame extends JFrame{
	public DigitalClockFrame() {
		setTitle("Draw Digital Circle");
		Container ct = getContentPane();
		ct.add(new DigitalClockPanel()); //�ð�
		
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

