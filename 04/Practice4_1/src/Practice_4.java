/********************************
 	헤론의 공식 - 세 변의 길이로 넓이 구하기
 	1315594 경영학과 이호정
	#형변환 #자료형일치 #메소드
*********************************/
import java.util.Scanner;
public class Practice_4 {
	public static void main (String[] args){
		
		Scanner scan = new Scanner(System.in);
		int a, b, c; //세변의길이
		float e; //넓이
		float s; //공식의 s값
		
		System.out.println("세 변의 길이를 입력하세요");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		s = herone_s(a, b, c); //넓이 계산에 필요한 s값 메소드로 계산
		e = herone_e(a, b, c, s); //s를 포함하여 넓이를 계산하는 메소드
		
		System.out.println("넓이:"+e);
	}
	
	/**메소드1**/
	private static float herone_s (float a, float b, float c){
		float sValue = (a+b+c)/2;
		return sValue;
	}
	
	/**메소드2**/
	private static float herone_e (float a, float b, float c, float s){
		float eValue = (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
			//Math.sqrt 메소드는 반환값이 double이므로 float로 형변환 해주어야 함
		return eValue;
	}
}
