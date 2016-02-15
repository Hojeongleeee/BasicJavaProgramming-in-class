public class BitOPTest2 {
	public static void main(String args[])
	{
		int a = 4;
		int b = a << 2;
		int c = a >> 2;
		int d = -4;
		int e = d << 2;
		int f = d >> 2;
		int g = d >>> 2;
		System.out.println("     a = " + a);
		System.out.println("  a<<2 = " + b);
		System.out.println("  a>>2 = " + c);
		System.out.println("  d<<2 = " + e);
		System.out.println("  d>>2 = " + f);
		System.out.println(" d>>>2 = " + g);
	}
}