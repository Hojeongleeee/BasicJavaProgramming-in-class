import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class JComboBoxDemo extends JFrame implements ItemListener {
	JLabel jl;
	public JComboBoxDemo() {
		jl = new JLabel(new ImageIcon("��.jpg"));
		JComboBox jc = new JComboBox();
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		ct.add(jl);
		jc.addItem("��");
		jc.addItem("�ٳ���");
		jc.addItem("��");
		jc.addItem("���");
		jc.addItem("�޵�");
		jc.addItem("����");
		ct.add(jc);
		jc.addItemListener(this);
		setTitle("JComboBox Test1");
		setSize(350,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void itemStateChanged(ItemEvent ie) {
		String fruit = (String)ie.getItem();
		jl.setIcon(new ImageIcon(fruit+".jpg"));
	}
}
public class JComboBoxTest1 {
	public static void main(String[] args) {
		new JComboBoxDemo();
	}
}