public class LongTest {
	public static void main(String args[]) {
		Long a = new Long(Long.MAX_VALUE);
		System.out.println("Long�� �ִ밪(10����) : " + a.longValue());
		System.out.println("Long�� �ִ밪(2����) : " + Long.toBinaryString(a.longValue()));
		System.out.println("Long�� �ִ밪(8����) : " + Long.toOctalString(a.longValue()));
		System.out.println("Long�� �ִ밪(16����) : " + Long.toHexString(a.longValue()));
		System.out.println("==========================================");
		a = new Long(Long.MIN_VALUE);
		System.out.println("Long�� �ּҰ�(10����) : " + a );
		System.out.println("Long�� �ּҰ�(2����) : " + Long.toBinaryString(a));
		System.out.println("Long�� �ּҰ�(8����) : " + Long.toOctalString(a));
		System.out.println("Long�� �ּҰ�(16����) : " + Long.toHexString(a));
	}
}