import javax.swing.*;
import java.awt.*;
public class FrameTest2{
	public static void main(String[] args) {
		JFrame jf = new JFrame("Test Frame(��ư����)");
		Container ct = jf.getContentPane();
		JButton jb = new JButton("�׽�Ʈ��ư");
		ct.add(jb);
		jf.setSize(400,300);
		jf.setVisible(true);
	}
}