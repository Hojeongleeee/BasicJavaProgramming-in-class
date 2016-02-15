public class DoubleIFTest {
	public static void main(String args[])
	{
	int grade = Integer.parseInt(args[0]);
	if (grade >= 90)
		System.out.println("A학점 취득 성공");
	else
		System.out.println("A학점 취득 실패");
	System.out.println("감사합니다");
	}
}