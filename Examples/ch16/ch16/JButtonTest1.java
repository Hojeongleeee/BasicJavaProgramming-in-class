import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class JButtonDemo1 extends JFrame {
	public JButtonDemo1() {
		ImageIcon korea = new ImageIcon("korea1.gif");
		ImageIcon usa = new ImageIcon("usa.gif");
		ImageIcon germany = new ImageIcon("germany.gif");
		JButton nat = new JButton(korea);
		nat.setPressedIcon(usa);
		nat.setRolloverIcon(germany);
		Container ct = getContentPane();
		ct.add(nat);
		setTitle("JButton Test1");
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
public class JButtonTest1 {
	public static void main(String[] args) {
		new JButtonDemo1();
	}
}