public class SubStringTest {
	public static void main(String args[]) {
		String str = "�˱⽱�� �ؼ��� �ڹ�";
		System.out.println("�ε��� 5���� 8���������� ���ڿ� : " + str.substring(5,8));
		System.out.println(str.concat("�� ���� ���α׷�"));
		System.out.println(str.replace('��','��'));
		str = " " + str + " ";
		System.out.println("���� �߰� str�� ���� : " + str.length());
		str = str.trim();
		System.out.println("���� ���� str�� ���� : " + str.length());
	}
}