import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;


/* R1315594_9_이호정 (경영학부)
 * 통계 제목, 5개 항목의 제목과 값을 입력 받아서 이를 Pie chart로 출력하는 프로그램을 작성하시오.
 */
public class PieChart2 {

	public static void main(String[] args) {

		new ChartMaking();  //차트만듦
	}
}
class Spec {
	//제목, 항목, 값, 값합계
	String chartTitle;
	private double values[] = new double[5];
	private String valuesTitle[] = new String[5];
	private double valueSum = 0;
	
	Spec(){
		Scanner scan = new Scanner(System.in);
		
		//텍스트입력칸 만들기
		System.out.println("Chart Title:");
		chartTitle = scan.nextLine(); //제목
		for (int i=0;i<5;i++){
			System.out.print("Value name"+(i+1)+":");			
			valuesTitle[i]=scan.next(); //항목
			System.out.print("Value"+(i+1)+":");
			values[i]=scan.nextDouble(); //값
			valueSum = valueSum+values[i]; //값합계
		}
		scan.close();
	}//Constructor 끝
	
	public double values(int i){
		return values[i];
	}
	public int degree(int i){ //정수 각도로 반환
		return (int)Math.round((double)(3.6*(values[i]/valueSum)*100 ));
	}
	public String componentName(int i){ //항목 제목
		return valuesTitle[i];
	}
	public String percentageStr(int i){ //n% String으로
		return (	(double)(Math.round(	(values[i]/valueSum)*10000	))/100)+"%";
	}	
}

class DrawPies extends JPanel {
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Spec spec = new Spec(); //값 입력받는 객체 생성

		//그리기
		g.setColor(Color.white);
		g.fillRect(100, 10, 300, 30);
		g.setColor(Color.BLACK);
		g.drawString(spec.chartTitle,200-(spec.chartTitle.length())/2, 30);

		//파이들
		int start = 0; //파이 시작값
		Color color[] = {Color.ORANGE,Color.CYAN,Color.red,Color.gray,Color.MAGENTA};
		for (int i=0;i<5;i++){ //5종류의 파이 그리기
			g.setColor(color[i]); //색바꾸기

			//차트그림
			int degree = spec.degree(i); //파이 각도
			g.drawArc(30, 100, 200, 200, start, degree);
			g.fillArc(30, 100, 200, 200, start, degree);
			start+=degree; //끝난곳에서 다음 파이 다시시작하기

			//범례
			g.drawString(spec.componentName(i)+"("+spec.values(i)+") : "+spec.percentageStr(i), 300, 200+20*i); 
				//한줄에 이름, 퍼센테이지 하나씩
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
