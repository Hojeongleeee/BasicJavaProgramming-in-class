import java.io.*;
class FileInputStreamTest {
	public static void main(String args[]) throws IOException {
		FileInputStream fis = new FileInputStream(args[0]);
		int i;
		while((i = fis.read()) != -1) {
			System.out.println(i);
		}
		fis.close();
		System.out.println("지정한 파일로부터 바이트 스트림을 입력받아 화면에 출력하였습니다.") ;
	}
}