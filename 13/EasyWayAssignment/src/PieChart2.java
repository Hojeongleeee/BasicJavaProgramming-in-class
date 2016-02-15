import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;


/* R1315594_9_��ȣ�� (�濵�к�)
 * ��� ����, 5�� �׸��� ����� ���� �Է� �޾Ƽ� �̸� Pie chart�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class PieChart2 {

	public static void main(String[] args) {

		new ChartMaking();  //��Ʈ����
	}
}
class Spec {
	//����, �׸�, ��, ���հ�
	String chartTitle;
	private double values[] = new double[5];
	private String valuesTitle[] = new String[5];
	private double valueSum = 0;
	
	Spec(){
		Scanner scan = new Scanner(System.in);
		
		//�ؽ�Ʈ�Է�ĭ �����
		System.out.println("Chart Title:");
		chartTitle = scan.nextLine(); //����
		for (int i=0;i<5;i++){
			System.out.print("Value name"+(i+1)+":");			
			valuesTitle[i]=scan.next(); //�׸�
			System.out.print("Value"+(i+1)+":");
			values[i]=scan.nextDouble(); //��
			valueSum = valueSum+values[i]; //���հ�
		}
		scan.close();
	}//Constructor ��
	
	public double values(int i){
		return values[i];
	}
	public int degree(int i){ //���� ������ ��ȯ
		return (int)Math.round((double)(3.6*(values[i]/valueSum)*100 ));
	}
	public String componentName(int i){ //�׸� ����
		return valuesTitle[i];
	}
	public String percentageStr(int i){ //n% String����
		return (	(double)(Math.round(	(values[i]/valueSum)*10000	))/100)+"%";
	}	
}

class DrawPies extends JPanel {
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Spec spec = new Spec(); //�� �Է¹޴� ��ü ����

		//�׸���
		g.setColor(Color.white);
		g.fillRect(100, 10, 300, 30);
		g.setColor(Color.BLACK);
		g.drawString(spec.chartTitle,200-(spec.chartTitle.length())/2, 30);

		//���̵�
		int start = 0; //���� ���۰�
		Color color[] = {Color.ORANGE,Color.CYAN,Color.red,Color.gray,Color.MAGENTA};
		for (int i=0;i<5;i++){ //5������ ���� �׸���
			g.setColor(color[i]); //���ٲٱ�

			//��Ʈ�׸�
			int degree = spec.degree(i); //���� ����
			g.drawArc(30, 100, 200, 200, start, degree);
			g.fillArc(30, 100, 200, 200, start, degree);
			start+=degree; //���������� ���� ���� �ٽý����ϱ�

			//����
			g.drawString(spec.componentName(i)+"("+spec.values(i)+") : "+spec.percentageStr(i), 300, 200+20*i); 
				//���ٿ� �̸�, �ۼ������� �ϳ���
		}

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
