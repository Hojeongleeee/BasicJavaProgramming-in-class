import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class KeyEventPanel extends JPanel implements KeyListener {
	private int x = 100;
	private int y = 100;
	private char keyChar = 'A';
	public KeyEventPanel() {
		addKeyListener(this);
	}
	public void keyReleased(KeyEvent ke) { }
	public void keyTyped(KeyEvent ke) { }
	public void keyPressed(KeyEvent ke) {
		keyChar = ke.getKeyChar();
		repaint();
	}
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setFont(new Font("TimesRoman", Font.PLAIN, 24));
		g.drawString(String.valueOf(keyChar), x, y);
	}
}
class KeyEventFrame extends JFrame{
	public KeyEventFrame() {
		Container ct = getContentPane();
		KeyEventPanel kep = new KeyEventPanel();
		kep.setFocusable(true);
		ct.add(kep);
		setTitle("KeyEvent Test");
		setSize(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
public class KeyEventTest {
	public static void main(String[] args) {
		new KeyEventFrame();
	}
}