import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
import javax.swing.JPanel;

import oracle.net.aso.g;

class PanelDrawing extends JPanel{
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//�ð� ��������
		TimeDefine time = new TimeDefine();

		//�ð�׸���
		g.setColor(Color.orange);
		g.drawOval(30, 30, 180, 180);
		g.fillOval(30, 30, 180, 180);
		Font f = new Font("����",Font.BOLD, 25);
		g.setFont(f);

		//�ð�����
		g.setColor(Color.black);
		g.drawString(str, 63, 150);
		System.out.println(str);
	}

	String str=" ";
	
	PanelDrawing(String str){
		this.str=str;
		this.paint(getGraphics());
		this.setVisible(true);
	}

}