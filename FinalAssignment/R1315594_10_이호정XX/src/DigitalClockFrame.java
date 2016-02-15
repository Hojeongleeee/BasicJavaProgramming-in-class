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
	
	//생성자, 초기 화면 구성, 없어지지않음!!
	public DigitalClockFrame() {
		setTitle("StopWatch Program");
		ct = getContentPane();
		pd = new PanelDrawing(time.reset());
		ct.add(pd); //시계 추가
		pb = new PanelButton(ct); //버튼 추가
		
		//두개의 패널 영역을 각각 지정 (분리)
		pd.setBounds(0,70,300,300);
		pb.setBounds(0,0,300,70);

		//창열고 visible
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	//WorkTask
	public void newPanel(){ //새로그리기
		ct.remove(pd);
	
		//스톱워치 표시 String을 전달
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
