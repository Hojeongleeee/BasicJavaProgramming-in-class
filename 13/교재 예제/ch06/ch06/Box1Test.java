class Box1 {
	int width;
	int height;
	int depth;
}
public class Box1Test {
	public static void main(String args[]) {
		Box1 mybox1 = new Box1();
		Box1 mybox2 = new Box1();
		int vol1, vol2;
		
		mybox1.width = 20;
		mybox1.height = 40;
		mybox1.depth = 15;
		
		mybox2.width = 10;
		mybox2.height = 20;
		mybox2.depth = 30;
		
		vol1 = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println(" ù��° �ڽ��� ���Ǵ� " + vol1 + "�Դϴ�.");
		
		vol2 = mybox2.width * mybox2.height * mybox2.depth;
		System.out.println(" �� ��° �ڽ��� ���Ǵ�  " + vol2 + "�Դϴ�.");
	}
}