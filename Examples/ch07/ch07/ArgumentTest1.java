class Argument {
	public void change(int i, int j[], StringBuffer sb) {
		i = 20;
		j[3] = 400;
		sb.append(" ȭ���� �ڹ�.");
	}
	public void display(int i, int j[], StringBuffer sb) {
		System.out.println("��ü ���� i�� �� : " + i);
		System.out.print("�迭�� �� : ");
		for(int index = 0; index < j.length; index++)
			System.out.print(j[index] + " ");
		System.out.println("");
		System.out.println("���ڿ� sb�� �� : " + sb);
	}
}
class ArgumentTest1 {
	public static void main(String args[]) {
		Argument d = new Argument();
		int a = 10;
		int b[] = { 1, 2, 3, 4 };
		StringBuffer c = new StringBuffer("���� ����?");
		System.out.println("ù��° display() �޼ҵ� ȣ��");
		d.display(a, b, c);
		d.change(a, b, c);
		System.out.println("=============================");
		System.out.println("���� ��ȯ�� ���� �ι�° display() ȣ��");
		d.display(a, b, c);
	}
}