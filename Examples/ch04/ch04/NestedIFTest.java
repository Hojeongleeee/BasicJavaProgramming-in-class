public class NestedIFTest {
	public static void main(String args[])
	{
		int score = Integer.parseInt(args[0]);
		if (score >= 80)
		{
			System.out.println("����������� ���մϴ�");
			if (score >= 90)
				System.out.println("A �����Դϴ�");
			else
				System.out.println("B �����Դϴ�");
			}
		else
		{
			if (score >= 60)
			{
				System.out.println("������������ ���մϴ�");
			if (score >= 70)
				System.out.println("C �����Դϴ�");
			else
				System.out.println("D �����Դϴ�");
			}
			else
				System.out.println("������� ����");
		}
	}
}