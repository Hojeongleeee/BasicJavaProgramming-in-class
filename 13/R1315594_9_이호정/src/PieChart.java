/* R1315594_9_��ȣ�� (�濵�к�)
 * ��� ����, 5�� �׸��� ����� ���� �Է� �޾Ƽ� �̸� Pie chart�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 */
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class PieChart {
	public static void main(String[] args) {

		new ChartMaking();  //��Ʈ����
	}
}


class ChartMaking extends JFrame{
	public ChartMaking() {
		setTitle("<Pie Chart>");
		Container ct = getContentPane();
		ct.add(new DrawPies());

		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

class DrawPies extends JPanel {
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		DataSubmition d = new DataSubmition(); //�� �Է¹޴� ��ü ����

		//���� �׸���
		g.setColor(Color.white);
		g.fillRect(100, 10, 300, 30);
		g.setColor(Color.BLACK);
		g.drawString(d.chartTitle,200-(d.chartTitle.length())/2, 30);

		//���̵� �׸���
		int start = 0; //���� ���۰�
		Color color[] = {Color.ORANGE,Color.CYAN,Color.red,Color.gray,Color.MAGENTA};
		for (int i=0;i<5;i++){ //5������ ���� �׸���
			g.setColor(color[i]); //���ٲٱ�

			//��Ʈ�׸�
			int degree = d.degree(i); //���� ����
			g.drawArc(30, 100, 200, 200, start, degree);
			g.fillArc(30, 100, 200, 200, start, degree);
			start+=degree; //���������� ���� ���� �ٽý����ϱ�

			//����
			g.drawString(d.componentName(i)+"("+d.values(i)+") : "+d.percentageStr(i), 300, 200+20*i); 
				//���ٿ� �̸�, �ۼ������� �ϳ���
		}

	}
}
