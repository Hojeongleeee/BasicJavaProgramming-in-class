public class ByteTest {
	public static void main(String args[]) {
		Byte b1 = new Byte("126");
		byte b2 = Byte.parseByte("1");
		byte btotal1 = (byte)(b1.byteValue() + b2);
		System.out.println("byte µ¡¼ÀÀÇ °á°ú 1 : " + btotal1);
		Byte b3 = 1;
		byte btotal2 = (byte)(b3.byteValue() + btotal1);
		System.out.println("byte µ¡¼ÀÀÇ °á°ú 2 : " + btotal2);
	}
}