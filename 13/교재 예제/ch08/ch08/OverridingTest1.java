class Da {
	void show(String str) {
		System.out.println("����Ŭ������ �޼ҵ� show(String str)���� " + str);
	}
}
class Db extends Da {
	void show() {
		System.out.println("����Ŭ������ �޼ҵ� show() ����");
	}
}
public class OverridingTest1 {
	public static void main(String args[]) {
		Db over = new Db();
		over.show("�˱� ���� �ؼ��� �ڹ�");
		over.show();
	}
}