public class ContinueTest {
	public static void main(String args[])
	{
		int sum=0, i;
		for( i=1; i<=100; i++ )
		{
			if (i%2 == 1) continue;
			sum = sum + i;
		}
		System.out.println("1���� 100���̿� �ִ� ¦���� ���� : " + sum );
	}
}