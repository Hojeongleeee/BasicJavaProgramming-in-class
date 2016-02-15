import java.util.Scanner;
import java.util.Random;

public class Postgraduate extends Student{
	Scanner scan = new Scanner(System.in);
	
	String tutor[] = {"문봉희","김주균","최영우","이상규","유석종"};	//지도교수 (5명한정)
	int tutorNo=0;
	String thesis[] = {"주제1","주제2","주제3","주제4","주제5"};	//연구주제
	int thesisNo;
	boolean assistance; //교육조교=1, 연구조교=0 
	
	Postgraduate(String name, int m, int semester){
		super(name, m, semester);
		Postgraduate2();
	}
	
	private void Postgraduate2(){
		System.out.println("<지도교수 목록>");
		System.out.println("1.문봉희\n2.김주균\n3.최영우\n4.이상규\n5.유석종");
		System.out.print("지도교수 번호:");
		int t = scan.nextInt();
		while (t==0||t>5){
			System.out.println("잘못입력하였습니다. 다시 입력해주세요.");
			this.tutorNo=scan.nextInt();
		}
		System.out.print("교육조교는 1, 연구조교는 0:");
		assistance = (scan.nextInt()==1?true:false);
	}
		
	public void printSpec(Postgraduate student){
		System.out.println("지도교수:"+student.tutor[tutorNo]);
		System.out.println("연구주제:"+student.thesis[thesisNo]);
		System.out.print("조교여부:");
		if(student.assistance==true){
			System.out.println("교육조교");
		} else {
			System.out.println("연구조교");
		}
	}
	
	public void paperRegist(){
		this.thesisNo=thesisRandom();
		//연구주제는 5개중에 랜덤
	}
	
	private int thesisRandom(){ //0~4 난수발생
		Random random = new Random();
		int thesisNo = random.nextInt(5);
		return thesisNo;
	}
}
