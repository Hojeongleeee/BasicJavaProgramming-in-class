class Am {
	void callme() {
		System.out.println("Ŭ���� Am�� callme() �޼ҵ� ����");
	}
}
class Bm extends Am {
	void callme() {
		System.out.println("Ŭ���� Bm�� callme() �޼ҵ� ����");
	}
}

class Cm extends Am {
	void callme() {
		System.out.println("Ŭ���� Cm�� callme() �޼ҵ� ����");
	}
}
public class OverridingAndCasting {
	public static void main(String args[]) {
		Am r = new Am();
		r.callme();
		r = new Bm();
		r.callme();
		r = new Cm();
		r.callme();
	}
}