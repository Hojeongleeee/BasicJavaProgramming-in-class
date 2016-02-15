import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/********************************************************/
/*
 * PanelDrawing
 * PanelButton
 */

class PanelButton extends JPanel implements ActionListener {
	Container ct;
	PanelDrawing pd;
	DigitalClockFrame dcf;
	int buttonState=3; //reset���·� �ʱ�ȭ
	
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
			System.out.println("Start Button Pressed");
			buttonState = 1;
			
		} else if ("Stop".equals(e.getActionCommand())){
			//������
			System.out.println("Stop Button Pressed");
			buttonState = 2;
			
		} else { /**reset**/
			//�����ϱ�
			System.out.println("Reset Button Pressed");
			buttonState = 3;
			
		}
	}//actionPerformed ��
}