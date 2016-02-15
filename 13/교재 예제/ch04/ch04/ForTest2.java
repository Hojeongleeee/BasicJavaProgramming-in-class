public class ForTest2 {
	public static void main(String args[])
	{
		int i, sum=0;
		for (i = 1; i <= 100 ; i = i + 2)
		{
			sum = sum + i;
		}
		System.out.println("1부터 100 사이의 홀수의 합은 " + sum + " 입니다 ");
	}
}