public class ArraysOneDTest1 {
	public static void main(String args[])
	{
		int number[] = new int[10];
		System.out.println("number 배열의 길이 :" + number.length);
		
		int i,j,sum=0;
		double avg;
		for (i=0; i < number.length ; i=i+1)
			number[i] = i+1;
		for (j=0; j < number.length ; j=j+1)
			sum = sum + number[j];
		System.out.println("1부터 10까지의 합은 " + sum + "입니다");
		avg = (double)sum/number.length;
		System.out.println("1부터 10까지의 합의 평균은 " + avg + "입니다");
	}
}