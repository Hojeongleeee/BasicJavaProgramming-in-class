import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class JComboBoxDemo extends JFrame implements ItemListener {
	JLabel jl;
	public JComboBoxDemo() {
		jl = new JLabel(new ImageIcon("감.jpg"));
		JComboBox jc = new JComboBox();
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		ct.add(jl);
		jc.addItem("감");
		jc.addItem("바나나");
		jc.addItem("배");
		jc.addItem("사과");
		jc.addItem("앵두");
		jc.addItem("포도");
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