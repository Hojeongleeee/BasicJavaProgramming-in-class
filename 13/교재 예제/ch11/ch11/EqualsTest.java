class EqualsTest {
	public static void main(String args[]) {
		String s1 = "�˱⽱��" ;
		String s2 = "Apple";
		String s3 = "APPLE";
		String s4 = new String("�˱⽱��");
		System.out.println("s1�� s2�� ������ ���ڿ�? : " + s1.equals(s2));
		System.out.println("s2�� s3�� ������ ���ڿ�?(��ҹ��� ����) : " +
		s2.equalsIgnoreCase(s3));
		if (s1 == s4)
			System.out.println("s1�� s4�� \"==\" �����ڷ� ���� ����� ����");
		else
			System.out.println("s1�� s4�� \"==\" �����ڷ� ���� ����� ���� �ʴ�");
		if (s1.equals(s4))
			System.out.println("s1�� s4�� \"equals()\" �޼ҵ�� ���� ����� ����");
		else
			System.out.println("s1�� s4�� \"equals()\" �޼ҵ�� ���� ����� ���� �ʴ�");
			System.out.println("s1���ڿ��� \"�˱�\"�� �����ϴ°�? " + 	s1.startsWith("�˱�"));
			System.out.println("s1���ڿ��� \"ple\"�� �����°�? " + s2.endsWith("ple"));
	}
}