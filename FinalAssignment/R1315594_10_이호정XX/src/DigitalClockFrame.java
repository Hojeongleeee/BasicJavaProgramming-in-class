import java.awt.Container;

import javax.swing.JFrame;

/********************************************************/
/*
 * Frame
 * 
 */
class DigitalClockFrame extends JFrame {
	Container ct;
	PanelDrawing pd;
	PanelButton pb;
	TimeDefine time = new TimeDefine();
	
	//������, �ʱ� ȭ�� ����, ������������!!
	public DigitalClockFrame() {
		setTitle("StopWatch Program");
		ct = getContentPane();
		pd = new PanelDrawing(time.reset());
		ct.add(pd); //�ð� �߰�
		pb = new PanelButton(ct); //��ư �߰�
		
		//�ΰ��� �г� ������ ���� ���� (�и�)
		pd.setBounds(0,70,300,300);
		pb.setBounds(0,0,300,70);

		//â���� visible
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	//WorkTask
	public void newPanel(){ //���α׸���
		ct.remove(pd);
	
		//�����ġ ǥ�� String�� ����
		switch (pb.buttonState){
		case 1 : //start
			pd=new PanelDrawing(time.start());
			System.out.println(time.start());
			break;
		case 2 : //stop
			pd=new PanelDrawing(time.stop());
			System.out.println(time.stop());
			break;
		case 3 : //reset
			pd=new PanelDrawing(time.reset());
			System.out.println(time.reset());
			break;
		}
		ct.add(pd);
		setVisible(true);
	}

}
