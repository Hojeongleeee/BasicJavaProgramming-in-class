public class ReturnTest {
	public static void main(String args[])
	{
		int j = 1;
		int k = Integer.parseInt(args[0]);
		while(true)
		{
			if (j % k == 0)
			{
				System.out.println("�Ű������� �Էµ� ���� : " + j);
				return;
			}
			j++;
		}
	}
}