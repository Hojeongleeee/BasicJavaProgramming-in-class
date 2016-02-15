import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventTestMain {

	public static void main(String[] args) {
		new EventFrame();
	}
}


class EventFrame extends JFrame implements ActionListener{
	EventFrame(){
		Container ct = getContentPane(); /**************/
		ct.setLayout(new FlowLayout());
		JButton jb1 = new JButton("버튼테스트");
		ct.add(jb1);
		jb1.addActionListener(this);
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

class MouseEventPanel extends JPanel implements ActionListener{
	MouseEventPanel(){

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}