
public class Undergraduate extends Student {
	
	int year=0;
	static String clubActName[] = {"인문","상경","자연","공학","예체능"};
	int clubActNo = 0;
	//생성자에서 scan받아서 멤버변수에저장하기!!

	Undergraduate(String name, int m, int semester){
		super(name, m, semester);
		Undergraduate2(semester);
	}
	private void Undergraduate2(int semester){
		year = semester/2;
		System.out.println("<동아리 번호 목록>");
		System.out.println("1.인문\n2.상경\n3.자연\n4.공학\n5.예체능");
		System.out.print("동아리번호:");
		clubActNo = scan.nextInt();
	}
	
	public void printSpec(Undergraduate student){
		System.out.println("동아리:"+student.clubActName[clubActNo]);
		System.out.println("학년:"+student.year);		
	}

}
