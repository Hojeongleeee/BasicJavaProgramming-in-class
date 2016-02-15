import java.util.Scanner;

class DataSubmition {
	//����, �׸�, ��, ���հ�
	protected String chartTitle;
	private double values[] = new double[5];
	private String valuesTitle[] = new String[5];
	private double valueSum = 0;
	
	DataSubmition(){
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