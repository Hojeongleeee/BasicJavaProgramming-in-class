public class ShortTest {
	public static void main(String args[]) {
		Short s1 = new Short((short)30);
		short s2 = Short.parseShort("20");
		short stotal = (short)(s1.intValue() + s2);
		System.out.println("short µ¡¼ÀÀÇ °á°ú : " + stotal);
	}
}