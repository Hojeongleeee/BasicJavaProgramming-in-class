public class SwitchTestIF {
	public static void main(String args[])
	{
		int month = Integer.parseInt(args[0]);
		String MtoS;
		if (month == 12 || month == 1 || month == 2)
			MtoS = "�ܿ��Դϴ�.";
		else if (3 <= month && month <= 5)
			MtoS = "���Դϴ�.";
		else if (6 <= month && month <= 8)
			MtoS = "�����Դϴ�.";
		else if (9 <= month && month <= 11)
			MtoS = "�����Դϴ�.";
		else
			MtoS = "12���� �̳��� ���� �ƴմϴ�.";
		System.out.println(month + "���� " + MtoS );
	}
}