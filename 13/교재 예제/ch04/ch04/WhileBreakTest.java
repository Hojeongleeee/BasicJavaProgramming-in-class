public class WhileBreakTest {
	public static void main(String args[])
	{
		int j=1, sum=0;
		while(true)
		{
			if(100 < j) break;
			sum = sum + j;
			j++;
		}
		System.out.println("1부터 " + (j-1) + "까지의 합 : " + sum);
	}
}