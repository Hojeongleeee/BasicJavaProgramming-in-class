import java.io.*;
import java.net.*;
import java.util.Scanner;
//	/textDirectory/text1.txt

public class ClientSide {

	public static void main(String[] args) throws IOException {

		
		Scanner scan = new Scanner(System.in);
	
		Socket c = new Socket("127.0.0.1", 13579); //����(�޴���)
		
		OutputStream os = c.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
		InputStream is = c.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		PrintWriter pw = new PrintWriter(os);
		
		System.out.print("��ɾ� �Է�:");
		String inputCommand = scan.nextLine();

		byte[] rBuff = new byte[19999];
		char[] cbuf = new char [10000];
		int length;
		
		//��ɾ� outputStream
//�ȴ�	pw.println(inputCommand);
		
		
//		//rdir ���� inputStream
//		length=dis.readInt();
//		String printString = "";
//		for(int i=0; i<length; i++){
//			isr.read(cbuf);
//			printString = printString + (char)dis.readChar();
//		}
//		System.out.println("���---------------------------\n"+printString);
		c.close();
	}
}
