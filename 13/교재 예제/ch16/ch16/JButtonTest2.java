import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class JButtonDemo2 extends JFrame implements ActionListener {
	JTextField jtf;
	public JButtonDemo2() {
		jtf = new JTextField(10);
		ImageIcon 사과 = new ImageIcon("사과.jpg");
		ImageIcon 바나나 = new ImageIcon("바나나.jpg");
		ImageIcon 감 = new ImageIcon("감.jpg");
		ImageIcon 배 = new ImageIcon("배.jpg");
		ImageIcon 포도 = new ImageIcon("포도.jpg");
		JButton jb1 = new JButton("사과",사과);
		JButton jb2 = new JButton("바나나",바나나);
		JButton jb3 = new JButton("감",감);
		JButton jb4 = new JButton("배",배);
		JButton jb5 = new JButton("포도",포도);
		Container ct = getContentPane();
		ct.setLayout(new GridLayout(3,2));
		ct.add(jb1);
		ct.add(jb2);
		ct.add(jb3);
		ct.add(jb4);
		ct.add(jb5);
		ct.add(jtf);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
		setTitle("JButton Test2");
		setSize(250,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		jtf.setText(ae.getActionCommand());
	}
}
public class JButtonTest2 {
	public static void main(String[] args) {
		new JButtonDemo2();
	}
}