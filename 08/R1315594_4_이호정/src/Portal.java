import java.util.Scanner;

public class Portal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int type = 100; //(1은 대학원, 2는 학부생) 100으로 초기화
		int tos = 0;//현재까지 학생 수
		Student studentArray[]=new Student[100]; //학생수 100명까지~

		while(true){

			type=100; //0입력방지위해 100으로 초기화 (매번)
			
			while(type==0||type>2){
				System.out.println("<선택하세요>\n1.대학원 2.학부생");
				type=scan.nextInt();
			}

			switch(type){ //대학원 or 학부생
			case 1:
				/*********대학원*********/

				int menu=100; //0입력방지위해 100으로 초기화 (매번)
				while(menu==0||menu>4){
					System.out.println("<메뉴를 선택하세요>\n1.학생등록 2.학점이수 3.조회 4.논문등록");
					menu=scan.nextInt();
				}

				
				switch(menu){
				case 1:
					scan.nextLine();
					Postgraduate studentMaster = new Postgraduate(enterName(), enterMajorNo(), enterSemester());
					studentArray[tos++]=studentMaster;
					System.out.println("<등록완료>");
					studentMaster.printStudent(studentMaster.studentNo); //등록한 학생정보 출력
					studentMaster.printSpec(studentMaster);
					break;
				case 2:
					int tempStudentNo = 0;
					int score = 0;
					int semester=0;
					Student student;

					//학번입력하면 학생 검색
					System.out.println("학번을 입력하세요:");
					tempStudentNo=scan.nextInt();

					int i = 0;
					while (i < tos){
						student=studentArray[i];
						if (student.studentNo==tempStudentNo){
							tempStudentNo=student.studentNo;
							break;
						}
						i++;
					}
					student = studentArray[tempStudentNo];
					//학생 검색 완료 후, student 객체 변수에 studentArray의 이미 저장된 학생 정보 저장

					System.out.print("이수한 학기:");
					semester = scan.nextInt();
					System.out.print("이수학점:");
					score = scan.nextInt();
					student.sumScore[semester-1]=score;//
					studentArray[tempStudentNo]=student;		
					break;

				case 3:

					//학번 입력하면 학생 검색
					System.out.println("학번을 입력하세요:");
					tempStudentNo=scan.nextInt();

					i = 0;
					while (i < tos){
						student=studentArray[i];
						if (student.studentNo==tempStudentNo){
							tempStudentNo=student.studentNo;
							break;
						}
						i++;
					}
					student = studentArray[tempStudentNo];

					//학생정보 출력
					student.printStudent(tempStudentNo);
					break;
					
				case 4:

					//학번 입력하면 학생 검색
					System.out.println("학번을 입력하세요:");
					tempStudentNo=scan.nextInt();

					i = 0;
					while (i < tos){
						student=studentArray[i-1];
						if (student.studentNo==tempStudentNo){
							tempStudentNo=student.studentNo;
							break;
						}
						i++;
					}
					student = studentArray[tempStudentNo];

					//대학원생일경우에만 논문등록허용
					if (student instanceof Postgraduate){
						student.paperRegist();
					}
					break;

				default:
					break;
				}
				break;

			case 2:
				/*********학부생*********/
				menu=100;
				while(menu==0||menu>3){
					System.out.println("<메뉴를 선택하세요>\n1.학생등록 2.학점이수 3.조회");
					menu=scan.nextInt();
				}

				switch (menu){
				case 1:
					Undergraduate studentBachelor = new Undergraduate(enterName(), enterMajorNo(), enterSemester());
					studentArray[tos++]=studentBachelor;
					System.out.println("<등록완료>");
					studentBachelor.printStudent(studentBachelor.studentNo);
					studentBachelor.printSpec(studentBachelor);
					break;
				case 2:
					int tempStudentNo = 0;
					int score = 0;
					int semester=0;
					Student student;


					//학번입력하면 학생 검색
					System.out.println("학번을 입력하세요:");
					tempStudentNo=scan.nextInt();

					int i = 0;
					while (i < tos){
						student=studentArray[i];
						if (student.studentNo==tempStudentNo){
							tempStudentNo=student.studentNo;
							break;
						}
						i++;
					}
					student = studentArray[tempStudentNo];
					
					//어느 학기에 몇점을 이수했는지 객체 멤버변수에 저장
					System.out.print("이수한 학기:");
					semester = scan.nextInt();
					System.out.print("이수학점:");
					score = scan.nextInt();
					student.sumScore[semester-1]=score;//
					studentArray[tempStudentNo]=student;	
					break;

				case 3:
					
					//학생 검색
					System.out.println("학번을 입력하세요:");
					tempStudentNo=scan.nextInt();
					
					i = 0;
					while (i < tos){
						student=studentArray[i];
						if (student.studentNo==tempStudentNo){
							tempStudentNo=student.studentNo;
							break;
						}
						i++;
					}
					student = studentArray[tempStudentNo];
					
					//학번에 해당하는 정보 출력
					student.printStudent(tempStudentNo);
					break;
				}
				break;
			} //type switch 끝
		} //무한반복 
	} //main 끝

	
	
	/****************** scan 메소드 *********************/
	//공통 등록 속성인 학기, 전공, 이름 다음과 같이 입력받는다!!
	private static int enterSemester() {
		Scanner scan = new Scanner(System.in);
		int semester = scan .nextInt();
		while(semester>8||semester==0){
			System.out.println("잘못입력하셨습니다. 다시 입력하세요");
			semester = scan.nextInt();
		}
		return 0;
	}

	private static int enterMajorNo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("<전공목록>");
		System.out.println("1.경영학과 2.컴퓨터과학과 3.피아노과 4.수학과 5.전자전기공학과");
		System.out.print("전공번호:");
		int majorNo = scan.nextInt();
		while(majorNo>5||majorNo==0){
			System.out.println("잘못입력하셨습니다. 다시 입력하세요");
			majorNo = scan.nextInt();
		}

		return majorNo;
	}

	private static String enterName() { 
		// TODO 문자열 입력에 오류가 있음!!!!!!!!!!!!!!!!!!!!!!!!!! 
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요");

		//String name = scan.nextLine();
		String name = "name"; //우선 name이라고 이름 정의
		while(name=="null"){
			System.out.println("잘못입력하셨습니다. 다시 입력하세요");
			name = scan.next();
		}
		return name;
	}

}
