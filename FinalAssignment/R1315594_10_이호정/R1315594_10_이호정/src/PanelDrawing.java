import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
/*
 * 시계 배경 (동그라미) 그리기
 * paintComponent(Graphics) - JPanel 메소드 오버라이드함. 그림그림
 * 
 */
class PanelDrawing extends JPanel{
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		//시계 배경 그리기
		g.setColor(Color.orange);
		g.drawOval(60, 100, 180, 150);
		g.fillOval(60, 100, 180, 150);
	}
}