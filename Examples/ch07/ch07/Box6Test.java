class Box6 {
	int width;
	int height;
	int depth;
	double dwidth;
	double dheight;
	double ddepth;
	public Box6(int w, int h, int d)
	{
		width = w;
		height = h;
		depth = d;
	}
	public Box6(double w, double h, double d)
	{
		dwidth = w;
		dheight = h;
		ddepth = d;
	}
}

public class Box6Test {
	public static void main(String args[]) {
	Box6 mybox1 = new Box6(10,20,30);
	Box6 mybox2 = new Box6(10.5,20.5,30.5);
	Box6 mybox3 = new Box6(10.5,20.5,30);
	int vol1 = mybox1.width * mybox1.height * mybox1.depth;
	double vol2 = mybox2.dwidth * mybox2.dheight * mybox2.ddepth;
	double vol3 = mybox3.dwidth * mybox3.dheight * mybox3.ddepth;
	System.out.println("정수 박스의 부피 : " + vol1);
	System.out.println("실수 박스의 부피 : " + vol2);
	System.out.println("정수와 실수가 섞여있는 박스의 부피 : " + vol3);
	}
}