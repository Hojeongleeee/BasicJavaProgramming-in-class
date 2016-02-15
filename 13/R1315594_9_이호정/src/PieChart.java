/* R1315594_9_이호정 (경영학부)
 * 통계 제목, 5개 항목의 제목과 값을 입력 받아서 이를 Pie chart로 출력하는 프로그램을 작성하시오.
 * 
 */
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class PieChart {
	public static void main(String[] args) {

		new ChartMaking();  //차트만듦
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
		DataSubmition d = new DataSubmition(); //값 입력받는 객체 생성

		//제목 그리기
		g.setColor(Color.white);
		g.fillRect(100, 10, 300, 30);
		g.setColor(Color.BLACK);
		g.drawString(d.chartTitle,200-(d.chartTitle.length())/2, 30);

		//파이들 그리기
		int start = 0; //파이 시작값
		Color color[] = {Color.ORANGE,Color.CYAN,Color.red,Color.gray,Color.MAGENTA};
		for (int i=0;i<5;i++){ //5종류의 파이 그리기
			g.setColor(color[i]); //색바꾸기

			//차트그림
			int degree = d.degree(i); //파이 각도
			g.drawArc(30, 100, 200, 200, start, degree);
			g.fillArc(30, 100, 200, 200, start, degree);
			start+=degree; //끝난곳에서 다음 파이 다시시작하기

			//범례
			g.drawString(d.componentName(i)+"("+d.values(i)+") : "+d.percentageStr(i), 300, 200+20*i); 
				//한줄에 이름, 퍼센테이지 하나씩
		}

	}
}
