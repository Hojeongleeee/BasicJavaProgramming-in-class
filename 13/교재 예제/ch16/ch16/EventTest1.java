import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ButtonEventTest extends JFrame implements ActionListener {
	private JLabel result = new JLabel("");
	public ButtonEventTest() {
		JButton male = new JButton("����");
		JButton female = new JButton("����");
		JLabel label = new JLabel("����� ������? ");
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		ct.add(male);
		ct.add(female);
		ct.add(label);
		ct.add(result);
		male.addActionListener(this);
		female.addActionListener(this);
		setTitle("ButtonEvent Test");
		setSize(300,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		result.setText(ae.getActionCommand());
	}
}
public class EventTest1 {
	public static void main(String args[]) {
		new ButtonEventTest();
	}
}