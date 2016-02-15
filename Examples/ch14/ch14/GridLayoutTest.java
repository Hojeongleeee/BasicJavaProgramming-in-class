import javax.swing.*;
import java.awt.*;
class GridLayout1 extends JFrame{
	public GridLayout1() {
		Container ct = getContentPane();
		GridLayout gl = new GridLayout(3,5,5,5);
		ct.setLayout(gl);
		for ( int i = 1; i<=15 ; i++)
			ct.add(new JButton("¹öÆ°"+i));
		setTitle("GridLayout Test");
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
public class GridLayoutTest {
	public static void main(String[] args) {
		new GridLayout1();
	}
}