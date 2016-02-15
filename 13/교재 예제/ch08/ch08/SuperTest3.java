class Ad1 {
	int d1;
	int s;
	Ad1(int s1) {
		System.out.println("클래스 Ad1의 생성자 수행");
		s = s1;
		d1 = s * s ;
	}
}
class Ad2 extends Ad1 {
	int d2;
	int t;
	Ad2(int s1, int t1) {
		super(s1);
		System.out.println("클래스 Ad2의 생성자 수행");
		t = t1;
		d2 = t * t ;
	}
}
public class SuperTest3 {
	public static void main(String args[]) {
		Ad2 super2 = new Ad2(10,20);
		System.out.println("10의 제곱은 : " + super2.d1);
		System.out.println("20의 제곱은 : " + super2.d2);
	}
}