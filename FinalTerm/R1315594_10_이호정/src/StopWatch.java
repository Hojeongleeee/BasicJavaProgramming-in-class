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
		Timer timer = new Timer();
		DigitalClockFrame dcf =	new DigitalClockFrame();
		timer.schedule(new WorkTask(dcf), 5000, 10); //0.01�ʿ� �ѹ���
	} //main
} //StopWatch ��

class WorkTask extends TimerTask {
	DigitalClockFrame dcf;
	public WorkTask(DigitalClockFrame dcf){
		this.dcf=dcf;
	}

	@Override
	public void run() {
		dcf.newPanel();
	} //run ��
}//WorkTask Class ��


/********************************************************/
class PanelDrawing extends JPanel{

	@Override
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
		g.drawString(time.timeStr(), 63, 150);
	}

}

class PanelButton extends JPanel implements ActionListener {
	PanelButton(Container ct){
		//��ư�߰�!!!
		JButton bStart = new JButton("Start");
		JButton bStop = new JButton("Stop");
		JButton bReset = new JButton("Reset");

		ct.add(bStart);
		ct.add(bStop);
		ct.add(bReset);
		ct.setLayout(null);
		
		//������
		bStart.addActionListener(this);
		bStop.addActionListener(this);
		bReset.addActionListener(this);

		bStart.setLocation(50, 30);
		bStart.setSize(70,30);
		bStop.setLocation(120, 30);
		bStop.setSize(70,30);
		bReset.setLocation(190, 30);
		bReset.setSize(70,30);
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if ("Start".equals(e.getActionCommand())){
			//�����ϱ�

		} else if ("Stop".equals(e.getActionCommand())){
			//������

		} else { /**reset**/
			//�����ϱ�

		}
	}//actionPerformed ��
}


/********************************************************/
class DigitalClockFrame extends JFrame {
	Container ct;
	PanelDrawing pb;
	PanelButton pd;

	//������
	public DigitalClockFrame() {
		setTitle("StopWatch Program");
		ct = getContentPane();
		pb = new PanelDrawing();
		ct.add(pb); //�ð�� ��ư �� �ȳ�����!!
		pd = new PanelButton(ct);
		
		//�ΰ��� �г� ������ ���� ����!!!!!!!
		pb.setBounds(0,70,300,300);
		pd.setBounds(0,0,300,70);

		//â���� visible ������!
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	//WorkTask
	public void newPanel(){ //���α׸���
		ct.remove(pb);
		ct.add(pb=new PanelDrawing());
		setVisible(true);
	}

}

