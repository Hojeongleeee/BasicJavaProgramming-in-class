import java.util.Arrays;
public class ArraysTest2 {
	static String array1[] = {"IMF", "���ֵ�", "�ڹٵ���",
	"�ѱ۳���", "Computer", "��ī", "JAVA", "���ͳ�Ž��",
	"�ʷ��ʷ�", "come", "�ٶ�", "��ũ����", "������", "����",
	"their", "country" };
	public static void main(String args[]) {
		System.out.println("======= ���� �� ������ ==========");
		System.out.println(Arrays.toString(array1));
		Arrays.sort(array1);
		System.out.println("======= ���� �� ������ ==========");
		System.out.println(Arrays.toString(array1));
	}
}