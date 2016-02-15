/********************************
 	밑변과 높이 입력하여 삼각형 넓이 계산
 	1315594 경영학과 이호정
	#형변환 #자료형일치 #메소드
*********************************/

		//public, private : 클래스 유형 정의 (Practice 내에서만 활용 : Public)
		//클래스 : 필요할 때 마다 꺼내쓰는 단위
		//객관화 : 라이브러리로 등록해놓고 이름만 가져다 쓰는 것 (ex:Scanner)

import java.util.Scanner;
public class Practice4_1_1 {
	public static void main(String[] args) {
		
		int h, l; // 밑변과 높이 입력
		float s;  // 넓이는 실수형으로 
		Scanner scan = new Scanner (System.in);
		
		System.out.print("높이:");
		h = scan.nextInt();
		System.out.print("밑변:");
		l = scan.nextInt();
		
		s = Triangle(h,l); // Triangle 메소드에 int h,l를 인수로 넣어 결과값을 s에
		System.out.println("넓이:"+s); 
		
	}
	
	/**메소드1**/
	public static float Triangle (int height, int length){
			// 밑변, 높이를 인수로 받아서 넓이를 return하는 메소드 (float이어야함)
			// 입력받는 인수들을 float형식으로 정의해도 상관없음.
					
		float tri; //넓이는 실수 tri 변수로 정의
		tri = ((float)height*length)/2; 
			//높이와 밑변이 정수이므로 한 가지만이라도 형변환을 해주어야 tri가 float형태로 나타남
		return tri; //tri를 메소드의 결과로 돌려줌 (float)
		
		}
	
	/** 헤론의공식, 삼각형의 둘레 등 다양한 공식 적용 **/

}
