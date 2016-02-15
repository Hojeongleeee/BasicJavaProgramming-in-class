import javax.swing.*;
import java.awt.*;
public class FrameTest2{
	public static void main(String[] args) {
		JFrame jf = new JFrame("Test Frame(버튼포함)");
		Container ct = jf.getContentPane();
		JButton jb = new JButton("테스트버튼");
		ct.add(jb);
		jf.setSize(400,300);
		jf.setVisible(true);
	}
}