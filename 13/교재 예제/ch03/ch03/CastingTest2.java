public class CastingTest2 {
	public static void main(String args[])
	{
		int i = '1' + 10;
		int j = '1' + 'A';
		System.out.println("\'1\' + 10 = " + i);
		System.out.println("\'1\' + \'A\' = " + j);
		int k = 66;
		System.out.println("66�� �����ڵ� ���ڷ� " + (char)k + " �Դϴ�");
	}
}