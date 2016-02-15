import java.awt.Container;

import javax.swing.JFrame;
/*
 * Frame �����
 * �⺻���� �׷��� ������ҵ� �߰�
 * StopWatchFrame() - ������� �߰��ϴ� container�� ������ ������
 * newPanel() - WorkTask���� ������ �޼ҵ� 
 * 
 */
class StopWatchFrame extends JFrame {
	Container ct; //Container
	PanelText pta; //TextArea
	PanelButton pb; //Button (Start, Stop, Reset)
	PanelDrawing pd; //Orange Clock Circle
	TimeDefine time = new TimeDefine();
	
	//������, �ʱ� ȭ�� ����, ������������!
	public StopWatchFrame() {
		setTitle("StopWatch Program");
		ct = getContentPane();
		
		pta = new PanelText(ct); //�ð� �� �߰�
		pb = new PanelButton(ct); //��ư �߰�
		pd = new PanelDrawing(); //�ð� ��� �߰�
		ct.add(pd); //�ð� ��� �߰�
		ct.add(pta); //�ð� �߰�
		ct.add(pb);
		pd.setBounds(0,0,300,300); //�׸��׸�����
		
		//â���� visible
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	//WorkTask
	public void newPanel(){ //���α׸���
		/*
		 *  �����ġ ǥ�� String�� ����
		 *  00:00:00 ������ String ��ü�� ����
		 */
		switch (pb.buttonState){
		case 1 : //start
			pta=new PanelText(time.start());
			break;
		case 2 : //stop
			pta=new PanelText(time.stop());
			break;
		case 3 : //reset
			pta=new PanelText(time.reset());
			break;
		}
	}

}
