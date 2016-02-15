import java.util.Scanner;

public class Student {
	static Scanner scan = new Scanner(System.in);

	String major[] = {"경영학과","컴퓨터과학과","피아노과","수학과","전자전기공학과"}; //전공 5가지로 한정
	int majorNo; //전공 인덱스
	String name; //학생이름
	static int studentNo; //학번 중복없이 순차적으로 부여
	int sumScore[] = new int[8]; //학기마다 이수학점
	int semester; //현재학기
	
	Student(){
		
	}
	Student(String name, int m, int semester){
		this.name=name; //이름
		studentNo++; //학번
		this.majorNo = m;//전공
		this.semester = semester;
	}
	
	void takingCredits(int semester, int score){
		this.semester = semester; //몇학기의 이수학점?
		sumScore[semester] = score; //그 학기 이수학점이 그래서 몇?
	}
	
	void printStudent(int studentNo){
		System.out.println("학번:"+studentNo);
		System.out.println("이름:"+name);
		System.out.println("전공:"+major[majorNo-1]);
		int sum=0;
		for (int i=1; i<=8; i++){
			if (sumScore[i-1]!=0){
				sum += sumScore[i-1];
				System.out.println(i+"학기 이수학점: "+sumScore[i-1]);	
			} //if끝
		}//for끝
		System.out.println("총 이수학점:"+sum);
		}
	
	void printSpec(){
		
	}
	
	void paperRegist(){
		
	}
} // class 끝
