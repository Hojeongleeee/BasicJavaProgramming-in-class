class Box8 {
	private int width;
	private int height;
	private int depth;
	private int vol;
	public Box8(int w, int h, int d)
	{
		width = w;
		height = h;
		depth = d;
		volume();
	}
	private void volume()
	{
		vol = width * height * depth;
	}
	public int getvolume()
	{
		return vol;
	}
}
public class Box8Test {
	public static void main(String args[]) {
		Box8 mybox1 = new Box8(10,20,30);
		// mybox1.width = 20;
		// int vol1 = mybox1.volume();
		System.out.println("정수 박스의 부피 : " + mybox1.getvolume());
	}
}