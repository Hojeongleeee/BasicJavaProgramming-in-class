import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class JButtonDemo2 extends JFrame implements ActionListener {
	JTextField jtf;
	public JButtonDemo2() {
		jtf = new JTextField(10);
		ImageIcon ��� = new ImageIcon("���.jpg");
		ImageIcon �ٳ��� = new ImageIcon("�ٳ���.jpg");
		ImageIcon �� = new ImageIcon("��.jpg");
		ImageIcon �� = new ImageIcon("��.jpg");
		ImageIcon ���� = new ImageIcon("����.jpg");
		JButton jb1 = new JButton("���",���);
		JButton jb2 = new JButton("�ٳ���",�ٳ���);
		JButton jb3 = new JButton("��",��);
		JButton jb4 = new JButton("��",��);
		JButton jb5 = new JButton("����",����);
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