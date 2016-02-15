public class SimpleIFTest2 {
	public static void main(String args[])
	{
		int grade = Integer.parseInt(args[0]);
		if (grade >= 90)
		{
			System.out.println("축하합니다 ");
			System.out.println("A학점을 취득하셨습니다 ");
		}
		System.out.println("감사합니다");
	}
}