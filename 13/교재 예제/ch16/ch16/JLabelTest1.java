import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class JLabelDemo extends JFrame implements ActionListener {
	private JLabel result = new JLabel("");
	public JLabelDemo() {
		ImageIcon ii = new ImageIcon("korea.gif");
		JButton korea = new JButton("클릭하세요", ii);
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		ct.add(korea);
		ct.add(result);
		korea.addActionListener(this);
		setTitle("JLabel Test");
		setSize(500,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		result.setText("세계에서 가장 좋은 한국 입니다");
	}
}
public class JLabelTest1 {
	public static void main(String[] args) {
		new JLabelDemo();
	}
}