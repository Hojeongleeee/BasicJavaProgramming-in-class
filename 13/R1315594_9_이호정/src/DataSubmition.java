import java.util.Scanner;

class DataSubmition {
	//제목, 항목, 값, 값합계
	protected String chartTitle;
	private double values[] = new double[5];
	private String valuesTitle[] = new String[5];
	private double valueSum = 0;
	
	DataSubmition(){
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