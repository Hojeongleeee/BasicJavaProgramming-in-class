public class LongTest {
	public static void main(String args[]) {
		Long a = new Long(Long.MAX_VALUE);
		System.out.println("Long의 최대값(10진법) : " + a.longValue());
		System.out.println("Long의 최대값(2진법) : " + Long.toBinaryString(a.longValue()));
		System.out.println("Long의 최대값(8진법) : " + Long.toOctalString(a.longValue()));
		System.out.println("Long의 최대값(16진법) : " + Long.toHexString(a.longValue()));
		System.out.println("==========================================");
		a = new Long(Long.MIN_VALUE);
		System.out.println("Long의 최소값(10진법) : " + a );
		System.out.println("Long의 최소값(2진법) : " + Long.toBinaryString(a));
		System.out.println("Long의 최소값(8진법) : " + Long.toOctalString(a));
		System.out.println("Long의 최소값(16진법) : " + Long.toHexString(a));
	}
}