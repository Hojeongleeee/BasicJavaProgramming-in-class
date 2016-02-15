import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class JRadioButtonDemo extends JFrame implements ActionListener {
	JTextField jtf;
	public JRadioButtonDemo() {
		jtf = new JTextField(10);
		JRadioButton jr1 = new JRadioButton("½Â¸¶");
		JRadioButton jr2 = new JRadioButton("°ñÇÁ");
		JRadioButton jr3 = new JRadioButton("½ºÅ²½ºÄí¹Ù");
		JRadioButton jr4 = new JRadioButton("Æä·¯±Û¶óÀÌµù");
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		ButtonGroup gb = new ButtonGroup();
		gb.add(jr1);
		gb.add(jr2);
		gb.add(jr3);
		gb.add(jr4);
		ct.add(jr1);
		ct.add(jr2);
		ct.add(jr3);
		ct.add(jr4);
		ct.add(jtf);
		jr1.addActionListener(this);
		jr2.addActionListener(this);
		jr3.addActionListener(this);
		jr4.addActionListener(this);
		setTitle("JRadioButtonTest1");
		setSize(350,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		jtf.setText(ae.getActionCommand());
	}
}
public class JRadioButtonTest1 {
	public static void main(String[] args) {
		new JRadioButtonDemo();
	}
}