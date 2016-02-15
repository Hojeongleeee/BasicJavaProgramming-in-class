import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
/*
 * JLabel�� �ð� ǥ�� �ؽ�Ʈ ǥ��
 * PanelText(Container) - ���� �ؽ�Ʈ �� ����, �⺻��
 * PanelText(String) - WorkTask���� ȣ���ϸ�, �ð� ǥ�� ���� ����
 */
class PanelText extends JPanel{
	static JLabel ta; //�ð�ǥ�õǴ� TextArea
	
	//�⺻ Label Ʋ ����
	PanelText(Container ct){
		ta = new JLabel("Stop Watch");
		ct.add(ta);
		ta.setSize(100,60);
		ta.setBackground(Color.white);
		ta.setLocation(110, 150);
		ta.setText("00'00''00");
		ta.setFont(new Font("����ü",Font.BOLD, 20));
	}
	
	//WorkTask���� ��� ȣ���� �ð�ǥ�� ������
	PanelText(String str){ 
		ta.setText(str);
	}
}