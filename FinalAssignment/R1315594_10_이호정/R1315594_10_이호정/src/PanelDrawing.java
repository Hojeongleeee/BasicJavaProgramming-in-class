import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
/*
 * �ð� ��� (���׶��) �׸���
 * paintComponent(Graphics) - JPanel �޼ҵ� �������̵���. �׸��׸�
 * 
 */
class PanelDrawing extends JPanel{
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		//�ð� ��� �׸���
		g.setColor(Color.orange);
		g.drawOval(60, 100, 180, 150);
		g.fillOval(60, 100, 180, 150);
	}
}