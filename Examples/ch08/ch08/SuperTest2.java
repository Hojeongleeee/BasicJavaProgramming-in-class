class A1 {
	double d1;
	A1() {
		System.out.println("Ŭ���� A1�� ������ ����");
		d1 = 10*10;
	}
}
class A2 extends A1 {
	double d2;
	A2() {
		System.out.println("Ŭ���� A2�� ������ ����");
		d2 = 10*10*10;
	}
}
class A3 extends A2 {
	double d3;
	A3() {
		System.out.println("Ŭ���� A3�� ������ ����");
		d3 = 10*10*10*10;
	}
}
class SuperTest2 {
	public static void main(String args[]) {
		A3 super1 = new A3();
		System.out.println("10�� 2���� : " + super1.d1);
		System.out.println("10�� 3���� : " + super1.d2);
		System.out.println("10�� 4���� : " + super1.d3);
	}
}