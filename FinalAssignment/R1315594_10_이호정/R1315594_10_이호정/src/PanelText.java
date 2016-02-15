import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
/*
 * JLabel로 시각 표시 텍스트 표현
 * PanelText(Container) - 최초 텍스트 라벨 생성, 기본값
 * PanelText(String) - WorkTask마다 호출하며, 시각 표시 새로 쓰기
 */
class PanelText extends JPanel{
	static JLabel ta; //시간표시되는 TextArea
	
	//기본 Label 틀 생성
	PanelText(Container ct){
		ta = new JLabel("Stop Watch");
		ct.add(ta);
		ta.setSize(100,60);
		ta.setBackground(Color.white);
		ta.setLocation(110, 150);
		ta.setText("00'00''00");
		ta.setFont(new Font("굴림체",Font.BOLD, 20));
	}
	
	//WorkTask에서 계속 호출할 시각표시 생성자
	PanelText(String str){ 
		ta.setText(str);
	}
}