package errortest;

public class errortest1 {
	public static void main(String args[]){
		int a, b;
		a = 50;
		b = 0;
		
		try{
			System.out.println("계산결과는 ");
			divide(a, b);
			System.out.println("입니다"); //스킵
		} catch (Exception e) {
			System.out.println("오류발생 " + e);
		}
		
		System.out.println("어아ㅓㅇㄹㅇ라얼ㅇ"); //실행
	}//try 끝

	static void divide(int a, int b){
		System.out.println(a/b);
	}


}


