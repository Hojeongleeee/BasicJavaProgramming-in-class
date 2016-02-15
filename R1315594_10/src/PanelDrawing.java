import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

class PanelDrawing extends JPanel{
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		//시각 가져오기
		TimeDefine time = new TimeDefine();

		//시계그리기
		g.setColor(Color.orange);
		g.drawOval(30, 30, 180, 180);
		g.fillOval(30, 30, 180, 180);
		Font f = new Font("돋움",Font.BOLD, 25);
		g.setFont(f);

		//시각쓰기
		g.setColor(Color.black);
		g.drawString(/**getter 필요**/"", 63, 150);
	}

}