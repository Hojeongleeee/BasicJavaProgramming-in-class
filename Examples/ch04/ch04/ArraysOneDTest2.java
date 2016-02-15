public class ArraysOneDTest2 {
	public static void main(String args[])
	{
		int score[] = {88,97,53,62,92,68,82};
		int max=score[0];
		for (int i=1; i < score.length ; i=i+1)
		{
			if ( score[i] > max )
				max = score[i];
		}
		System.out.println
		("배열 요소의 최대값은 " + max + "입니다");
	}
}