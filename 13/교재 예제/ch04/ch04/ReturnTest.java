public class ReturnTest {
	public static void main(String args[])
	{
		int j = 1;
		int k = Integer.parseInt(args[0]);
		while(true)
		{
			if (j % k == 0)
			{
				System.out.println("매개변수로 입력된 숫자 : " + j);
				return;
			}
			j++;
		}
	}
}