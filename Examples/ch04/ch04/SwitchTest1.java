public class SwitchTest1 {
	public static void main(String args[])
	{
		int month = Integer.parseInt(args[0]);
		String MtoS;
		switch (month)
		{
			case 12:
			case 1:
			case 2:
				MtoS = "겨울입니다.";
				break;
			case 3:
			case 4:
			case 5:
				MtoS = "봄입니다.";
				break;
			case 6:
			case 7:
			case 8:
				MtoS = "여름입니다.";
				break;
			case 9:
			case 10:
			case 11:
				MtoS = "가을입니다.";
				break;
			default:
				MtoS = "12개월 이내의 달이 아닙니다.";
		}
		System.out.println(month + "월은 " + MtoS );
	}
}