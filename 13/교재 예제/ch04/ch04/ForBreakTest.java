public class ForBreakTest {
	public static void main(String args[])
	{
		for(int i=0; i<100; i++)
		{
			if(i == 5) break;
			System.out.println(i + "자바의 세계로 오세요! " );
		}
		System.out.println("break 문에 의하여 for 문이 중단되었습니다.");
	}
}