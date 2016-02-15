import java.io.*;
public class FileOutputStreamTest {
	public static void main(String args[]) throws IOException {
		FileOutputStream fos = new FileOutputStream(args[0]);
		for(int i = 1; i <= 5 ; i++) {
			fos.write(i);
		}
		fos.close();
		System.out.println("지정한 화일명으로 ByteStreamFile을 생성하였습니다.");
	}
}