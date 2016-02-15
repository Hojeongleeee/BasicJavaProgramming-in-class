class Box9 {
	private int width;
	private int height;
	private int depth;
	public long idNum;
	static long boxID = 100;
	static long getCurrentID()
	{
		int count = 1;
		boxID = boxID + count;
		return boxID;
	}
}
public class Box9Test {
	public static void main(String args[]) {
		Box9 mybox1 = new Box9();
		mybox1.idNum = Box9.getCurrentID();
		Box9 mybox2 = new Box9();
		mybox2.idNum = Box9.getCurrentID();
		System.out.println("mybox1의 id 번호 : " + mybox1.idNum);
		System.out.println("mybox2의 id 번호 : " + mybox2.idNum);
		System.out.println("다음 박스의 번호는 " + Box9.getCurrentID() + "번 입니다");
	}
}