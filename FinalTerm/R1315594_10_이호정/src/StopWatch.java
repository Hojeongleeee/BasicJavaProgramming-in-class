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
		timer.schedule(new WorkTask(dcf), 5000, 10); //0.01초에 한번씩
	} //main
} //StopWatch 끝

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
class PanelDrawing extends JPanel{

	@Override
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
		g.drawString(time.timeStr(), 63, 150);
	}

}

class PanelButton extends JPanel implements ActionListener {
	PanelButton(Container ct){
		//버튼추가!!!
		JButton bStart = new JButton("Start");
		JButton bStop = new JButton("Stop");
		JButton bReset = new JButton("Reset");

		ct.add(bStart);
		ct.add(bStop);
		ct.add(bReset);
		ct.setLayout(null);
		
		//리스너
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
			//시작하기

		} else if ("Stop".equals(e.getActionCommand())){
			//끝내기

		} else { /**reset**/
			//리셋하기

		}
	}//actionPerformed 끝
}


/********************************************************/
class DigitalClockFrame extends JFrame {
	Container ct;
	PanelDrawing pb;
	PanelButton pd;

	//생성자
	public DigitalClockFrame() {
		setTitle("StopWatch Program");
		ct = getContentPane();
		pb = new PanelDrawing();
		ct.add(pb); //시계와 버튼 왜 안나오니!!
		pd = new PanelButton(ct);
		
		//두개의 패널 영역을 각각 지정!!!!!!!
		pb.setBounds(0,70,300,300);
		pd.setBounds(0,0,300,70);

		//창열고 visible 보여라!
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	//WorkTask
	public void newPanel(){ //새로그리기
		ct.remove(pb);
		ct.add(pb=new PanelDrawing());
		setVisible(true);
	}

}

