/*R1315594_7_이호정 (경영학부)
 * 
 * 임의의 파일(Keyboard 입력)에 여러 문장이 포함되어 있다. 
 * 여기에 포함된 단어들을 분류하여 오름차순으로 정렬하고 단어 수를 출력하는 프로그램을 작성하시오.
 * 
 */
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class sortingWords {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws Exception {

		String rawString;
//		System.out.print("문장을 입력하세요: ");
//		rawString = scan.nextLine();
		byte buff[] = new byte[10000];
		FileInputStream textFile = new FileInputStream("testfile1.txt");
		textFile.read(buff);
		rawString = new String(buff);
		int oldlength; //문자열의 길이

		/**공백기호가 2개 이상일 때, 1개가 될 때 까지 replace함**/
		do {
			oldlength=rawString.length();
			rawString = rawString.replace("\n"," ");
			rawString = rawString.replace(".", " ");
			rawString = rawString.replace(",", " ");
			rawString = rawString.replace("\r"," ");
			rawString = rawString.replace("  "," ");
			} //replace로 문자열의 길이에 변동이 생기지 않을 때 까지 문장부호와 개행을 제거해나감
		while(oldlength!=rawString.length());
		
		String[] splitedString = rawString.split(" "); //공백을 기준으로 분리
		sorting(splitedString); //정렬
		countFreq(splitedString); //중복 count
	}


	/**단어를 정렬하는 함수**/
	private static void sorting(String[] wordArray) {
//		System.out.println("======= 정렬 전 데이터 ==========");
		for(int k = 0; k < wordArray.length; k++)
//			System.out.print(wordArray[k] + " ");

//		System.out.println("\n======= 정렬 후 데이터 ==========");
		for(int i = 0; i < wordArray.length; i++) {
			for(int j = i + 1; j < wordArray.length; j++) {
				if(wordArray[i].compareTo(wordArray[j]) > 0) { //swap
					String t = wordArray[i];
					wordArray[i] = wordArray[j];
					wordArray[j] = t;
				} //swap끝
			} //for j 끝
//			System.out.print(wordArray[i] + " "); //정렬결과 출력
		} //for i 끝
		System.out.println("");
	}//sorting 끝
	
	
	/**중복단어의 빈출 수 세는 함수**/
	private static void countFreq(String[] splitedString){
		//리스트 개념 활용하여 이미 정렬되어있는 단어를 중복 제거하여 연속적으로 저장함
		ArrayList<String> wordList = new ArrayList<String>(); //단어들 배열
		ArrayList<Integer> countList = new ArrayList<Integer>(); //단어들마다 빈도수 배열
		int j=0; //countList에 index로 쓰일 정수 0으로 초기화
		
		//중복단어 제거 및 단어 빈도수 세기
		for(int i=0;i<splitedString.length; i++){
			if(i==0){ //맨 처음의 단어는 wordList에 무조건 등록
				wordList.add(splitedString[0]);
				countList.add(1); //단어빈도 1 등록
			} else if (splitedString[i-1].equals(splitedString[i])){ //중복인경우
				countList.set(j, countList.get(j)+1); //바로앞의 값과 같으면 count 증가시키기
			} else { //중복이 아닌경우
				//바로 직전 단어와 비교하기만 하면 됨
				wordList.add(splitedString[i]); //중복이 아니므로 단어를 list에 추가
				countList.add(1);//단어빈도 1 등록
				j=wordList.size()-1; //count를 추가시키기 위한 index
			} //if끝
		} //for끝

		//출력
		for(int i=0; i<wordList.size(); i++){
			System.out.println("단어:"+wordList.get(i)+"\t빈도:"+countList.get(i));
		}
	}//countFreq 끝

}