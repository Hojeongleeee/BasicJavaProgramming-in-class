class Da {
	void show(String str) {
		System.out.println("상위클래스의 메소드 show(String str)수행 " + str);
	}
}
class Db extends Da {
	void show() {
		System.out.println("하위클래스의 메소드 show() 수행");
	}
}
public class OverridingTest1 {
	public static void main(String args[]) {
		Db over = new Db();
		over.show("알기 쉽게 해설한 자바");
		over.show();
	}
}