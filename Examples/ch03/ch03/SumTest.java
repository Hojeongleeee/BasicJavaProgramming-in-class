/* 이 프로그램은 첫 번째 자바 프로그램입니다
프로그램 이름 : SumTest.java
프로그램 작성자 및 작성일시 : 홍길동 2012년 2월 11일
*/
public class SumTest {
	public static void main(String a1[])
	{
		int a, b, sum;
		a = Integer.parseInt(a1[0]);
		b = Integer.parseInt(a1[1]);
		sum = a + b ; // 두 수를 더하는 부분입니다
		System.out.println("두수의 합은" + sum + "입니다");
	}
}