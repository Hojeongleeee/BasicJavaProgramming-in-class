import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MouseEventPanel extends Panel implements MouseListener {
	public MouseEventPanel() {
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent me) {
		System.out.println("mouseClicked 메소드 수행");
	}
	public void mouseEntered(MouseEvent me) {
		System.out.println("mouseEntered 메소드 수행");
	}
	public void mouseExited(MouseEvent me) {
		System.out.println("mouseExited 메소드 수행");
	}
	public void mousePressed(MouseEvent me) {
		System.out.println("mousePressed 메소드 수행");
	}
	public void mouseReleased(MouseEvent me) {
		System.out.println("mouseReleased 메소드 수행");
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