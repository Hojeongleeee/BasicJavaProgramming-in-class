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
				MtoS = "�ܿ��Դϴ�.";
				break;
			case 3:
			case 4:
			case 5:
				MtoS = "���Դϴ�.";
				break;
			case 6:
			case 7:
			case 8:
				MtoS = "�����Դϴ�.";
				break;
			case 9:
			case 10:
			case 11:
				MtoS = "�����Դϴ�.";
				break;
			default:
				MtoS = "12���� �̳��� ���� �ƴմϴ�.";
		}
		System.out.println(month + "���� " + MtoS );
	}
}