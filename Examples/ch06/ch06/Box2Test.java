class Box2 {
	int width=10;
	int height=20;
	int depth=30;
}
public class Box2Test {
	public static void main(String args[]) {
		int myint1 = 100;
		int myint2 = myint1;
		System.out.println("첫 번째 값 : " + myint1 + " 두 번째 값 : " + myint2);
		myint1 = 200;
		System.out.println("첫 번째 값 : " + myint1 + " 두 번째 값 : " + myint2);
		Box2 mybox1 = new Box2();
		Box2 mybox2 = mybox1;
		mybox1.width = 20;
		System.out.println("mybox1.width : " + mybox1.width);
		System.out.println("mybox2.width : " + mybox2.width);
		mybox2.depth = 123;
		System.out.println("mybox1.depth : " + mybox1.depth);
		System.out.println("mybox2.depth : " + mybox2.depth);
	}
}