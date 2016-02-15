public class SwitchTestIF {
	public static void main(String args[])
	{
		int month = Integer.parseInt(args[0]);
		String MtoS;
		if (month == 12 || month == 1 || month == 2)
			MtoS = "겨울입니다.";
		else if (3 <= month && month <= 5)
			MtoS = "봄입니다.";
		else if (6 <= month && month <= 8)
			MtoS = "여름입니다.";
		else if (9 <= month && month <= 11)
			MtoS = "가을입니다.";
		else
			MtoS = "12개월 이내의 달이 아닙니다.";
		System.out.println(month + "월은 " + MtoS );
	}
}