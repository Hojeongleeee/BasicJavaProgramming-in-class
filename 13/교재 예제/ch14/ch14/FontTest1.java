import javax.swing.*;
import java.awt.*;
class FontPanel extends JPanel{
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Font sanserif, serif, monospaced, etc;
		sanserif = new Font("SansSerif",Font.BOLD,20);
		serif = new Font("Serif",Font.ITALIC,20);
		monospaced = new Font("Monospaced",Font.BOLD+Font.ITALIC,20);
		etc = new Font("굴림",Font.BOLD,20);
		g.setFont(sanserif);
		g.drawString("Teach you self JAVA : Courier ",20,20);
		g.setFont(serif);
		g.drawString("Complete Reference JAVA : Timesoroman ",20,50);
		g.setFont(monospaced);
		g.drawString("JAVA Tutorial : Symbol ",20,82);
		g.setFont(etc);
		g.drawString("객체지향 프로그래밍 자바 : 굴림체",20,118);
	}
}
class FontFrame extends JFrame{
	public FontFrame() {
		setTitle("Font Test");
		Container ct = getContentPane();
		ct.add(new FontPanel());
		setSize(430,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
public class FontTest1 {
	public static void main(String[] args) {
		new FontFrame();
	}
}