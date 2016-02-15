import java.awt.Container;

import javax.swing.JFrame;
/*
 * Frame 만들기
 * 기본적인 그래픽 구성요소들 추가
 * StopWatchFrame() - 구성요소 추가하는 container를 포함한 생성자
 * newPanel() - WorkTask에서 수행할 메소드 
 * 
 */
class StopWatchFrame extends JFrame {
	Container ct; //Container
	PanelText pta; //TextArea
	PanelButton pb; //Button (Start, Stop, Reset)
	PanelDrawing pd; //Orange Clock Circle
	TimeDefine time = new TimeDefine();
	
	//생성자, 초기 화면 구성, 없어지지않음!
	public StopWatchFrame() {
		setTitle("StopWatch Program");
		ct = getContentPane();
		
		pta = new PanelText(ct); //시각 라벨 추가
		pb = new PanelButton(ct); //버튼 추가
		pd = new PanelDrawing(); //시계 배경 추가
		ct.add(pd); //시계 배경 추가
		ct.add(pta); //시계 추가
		ct.add(pb);
		pd.setBounds(0,0,300,300); //그림그릴영역
		
		//창열고 visible
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	//WorkTask
	public void newPanel(){ //새로그리기
		/*
		 *  스톱워치 표시 String을 전달
		 *  00:00:00 형태의 String 객체만 전달
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
