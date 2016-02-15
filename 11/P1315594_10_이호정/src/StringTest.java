/*P1315594_10_이호정 (경영학부)
 * 
 * 한 Line의 문장을 입력하여 단어 단위로 출력하는 프로그램을 작성하시오.
 * 여러 Line의 문장을 입력(Keyboard에 의한 파일 입력)하여 단어 단위로 출력하는 프로그램을 작성하시오.
 * Keyboard에 의한 파일 입력의 종료는 Ctrl-Z 를 입력하면 된다.
 * 
 */


import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//문장을 직접 입력받음
		System.out.print("문장을 입력하세요: ");
		String rawString = scan.nextLine();	
		int oldlength; //문자열의 길이
		
		//공백기호가 2개 이상일 때, 1개가 될 때 까지 replace함
		do {
			oldlength=rawString.length();
			rawString = rawString.replace("  ", " ");
		} //replace로 문자열의 길이에 변동이 생기지 않을 때 까지 2개이상의 공백을 제거해나감
		while(oldlength!=rawString.length());
		
		//공백기호를 기준으로 분리
		String[] splitedString = rawString.split(" ");
				
		System.out.println(rawString);//원래 문자열 출력
		
		//배열의 인덱스마다 저장된 단어들 출력
		for(int i=0; i<splitedString.length;i++){
			System.out.println("splitedString["+i+"]= '"+splitedString[i]+"'");
		}
	}
}
