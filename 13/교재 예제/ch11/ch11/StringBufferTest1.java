public class StringBufferTest1 {
	public static void main(String args[]) {
		StringBuffer str1 = new StringBuffer("Hello JAVA");
		StringBuffer str2 = new StringBuffer("�ȳ��ϼ��� �ڹ�");
		System.out.println("���ڿ� => " + str1);
		System.out.println("���ڿ� ���� => " + str1.length());
		System.out.println("���۸� ������ ���� => " + str1.capacity());
		System.out.println("���ڿ� => " + str2);
		System.out.println("���ڿ� ���� => " + str2.length());
		System.out.println("���۸� ������ ���� => " + str2.capacity());
	}
}