class Box10 {
	private int i_volume;
	private double d_volume;
	public Box10(int w, int h, int d)
	{
		volume(w, h, d);
	}
	public Box10(double w, double h, double d)
	{
		volume(w, h, d);
	}
	private void volume(int w, int h, int d)
	{
		i_volume = w * h * d;
	}
	private void volume(double w, double h, double d)
	{
		d_volume = w * h * d;
	}
	public int get_i_volume()
	{
		return i_volume;
	}
	public double get_d_volume()
	{
		return d_volume;
	}
}
public class Box10Test {
	public static void main(String args[]) {
		Box10 mybox1 = new Box10(10,20,30);
		Box10 mybox2 = new Box10(10.5,20.5,30.5);
		Box10 mybox3 = new Box10(10.5,20.5,30);
		System.out.println("정수 박스의 부피 : " + mybox1.get_i_volume());
		System.out.println("실수 박스의 부피 : " + mybox2.get_d_volume());
		System.out.println("정수와 실수가 섞여있는 박스의 부피 : " + mybox3.get_d_volume());
	}
}