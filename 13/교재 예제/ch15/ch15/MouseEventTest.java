import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MouseEventPanel extends Panel implements MouseListener {
	public MouseEventPanel() {
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent me) {
		System.out.println("mouseClicked �޼ҵ� ����");
	}
	public void mouseEntered(MouseEvent me) {
		System.out.println("mouseEntered �޼ҵ� ����");
	}
	public void mouseExited(MouseEvent me) {
		System.out.println("mouseExited �޼ҵ� ����");
	}
	public void mousePressed(MouseEvent me) {
		System.out.println("mousePressed �޼ҵ� ����");
	}
	public void mouseReleased(MouseEvent me) {
		System.out.println("mouseReleased �޼ҵ� ����");
	}
}
class MouseEventFrame extends JFrame{
	public MouseEventFrame() {
		Container ct = getContentPane();
		ct.add(new MouseEventPanel());
		setTitle("MouseEvent Test");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
public class MouseEventTest {
	public static void main(String[] args) {
		new MouseEventFrame();
	}
}