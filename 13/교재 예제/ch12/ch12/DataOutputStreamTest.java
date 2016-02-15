import java.io.*;
public class DataOutputStreamTest {
	public static void main(String args[]) throws IOException {
		FileOutputStream fos = new FileOutputStream(args[0]);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeBoolean(false);
		dos.writeByte(Byte.MAX_VALUE);
		dos.writeChar('±è');
		dos.writeDouble(Double.MAX_VALUE);
		dos.writeFloat(Float.MIN_VALUE);
		dos.writeInt(Integer.MAX_VALUE);
		dos.writeLong(Long.MAX_VALUE);
		dos.writeShort(Short.MAX_VALUE);
		fos.close();
	}
}