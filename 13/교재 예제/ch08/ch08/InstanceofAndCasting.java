class An {
	int i, j;
}
class Bn extends An{
	int k;
}
class Cn extends Bn {
	int m;
}
public class InstanceofAndCasting {
	public static void main(String args[]) {
		An a = new An();
		Bn b = new Bn();
		Cn c = new Cn();
		if(a instanceof An)
			System.out.println("a�� A Ŭ������ ��ü");
		if(b instanceof Bn)
			System.out.println("b�� B Ŭ������ ��ü");
		if(c instanceof Cn)
			System.out.println("c�� C Ŭ������ ��ü");
		if(c instanceof An)
			System.out.println("c�� A Ŭ������ ��ü : ����ȯ");
		if(a instanceof Cn)
			System.out.println("a�� C Ŭ������ ��ü : ����ȯ");
		else
			System.out.println("a�� C Ŭ������ ��ü�� �ƴ� : ����ȯ �Ұ�");
	}
}