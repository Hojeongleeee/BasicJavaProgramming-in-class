import java.io.*;
class FileInputStreamTest {
	public static void main(String args[]) throws IOException {
		FileInputStream fis = new FileInputStream(args[0]);
		int i;
		while((i = fis.read()) != -1) {
			System.out.println(i);
		}
		fis.close();
		System.out.println("������ ���Ϸκ��� ����Ʈ ��Ʈ���� �Է¹޾� ȭ�鿡 ����Ͽ����ϴ�.") ;
	}
}