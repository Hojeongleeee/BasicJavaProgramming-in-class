class Box3 {
	int width;
	int height;
	int depth;
	long idNum;
	static long boxID = 0;
	public void increment() {
		idNum = ++boxID;
	}
}

class Box3Test {
	public static void main(String args[]) {
		Box3 mybox1 = new Box3();
		Box3 mybox2 = new Box3();
		Box3 mybox3 = new Box3();
		Box3 mybox4 = new Box3();
		mybox1.increment();
		mybox2.increment();
		mybox3.increment();
		mybox4.increment();
		System.out.println("mybox1�� id ��ȣ : " + mybox1.idNum);
		System.out.println("mybox2�� id ��ȣ : " + mybox2.idNum);
		System.out.println("mybox3�� id ��ȣ : " + mybox3.idNum);
		System.out.println("mybox4�� id ��ȣ : " + mybox4.idNum);
		System.out.println("��ü �ڽ��� ������ "+ Box3.boxID + "�Դϴ�.");
	}
}