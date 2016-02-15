public class NestedIFTest {
	public static void main(String args[])
	{
		int score = Integer.parseInt(args[0]);
		if (score >= 80)
		{
			System.out.println("우수학점군에 속합니다");
			if (score >= 90)
				System.out.println("A 학점입니다");
			else
				System.out.println("B 학점입니다");
			}
		else
		{
			if (score >= 60)
			{
				System.out.println("보통학점군에 속합니다");
			if (score >= 70)
				System.out.println("C 학점입니다");
			else
				System.out.println("D 학점입니다");
			}
			else
				System.out.println("학점취득 실패");
		}
	}
}