class Box7 {
	int width;
	int height;
	int depth;
	public Box7(int w, int h, int d)
	{
		width = w;
		height = h;
		depth = d;
	}
	int volume()
	{
		int vol = width * height * depth;
		return vol;
	}
}
public class Box7Test {
	public static void main(String args[]) {
		Box7 mybox1 = new Box7(10,20,30);
		mybox1.width = 20;
		int vol1 = mybox1.volume();
		System.out.println("정수 박스의 부피 : " + vol1);
	}
}