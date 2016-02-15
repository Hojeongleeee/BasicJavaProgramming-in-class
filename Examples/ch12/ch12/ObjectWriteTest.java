import java.io.*;
class Box implements Serializable {
	int w;
	int h;
	int d;
	public Box(int a, int b, int c)
	{
		w = a;
		h = b;
		d = c;
	}
}
public class ObjectWriteTest {
	public static void main(String args[]) throws Exception {
		String s1 = "***박스의 가로,세로,높이***";
		Box mybox1 = new Box(10,20,30);
		ObjectOutputStream oos =
		new ObjectOutputStream(new FileOutputStream("tmp.txt"));
		oos.writeObject(s1);
		oos.writeObject(mybox1);
		oos.writeDouble(123.456);
		oos.close();
	}
}