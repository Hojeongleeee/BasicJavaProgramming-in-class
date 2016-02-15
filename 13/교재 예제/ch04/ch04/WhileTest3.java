public class WhileTest3 {
	public static void main(String args[])
	{
		int i = 10;
		int j = 20;
		while (++i < --j);
		System.out.println("10과 20사이의 중간 값은 " + i + " 입니다");
	}
}