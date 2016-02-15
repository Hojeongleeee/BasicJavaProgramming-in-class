import java.io.*;
import java.net.*;
import java.util.Scanner;
//	/textDirectory/text1.txt

public class ClientSide {

	public static void main(String[] args) throws IOException {

		
		Scanner scan = new Scanner(System.in);
	
		Socket c = new Socket("127.0.0.1", 13579); //소켓(받는이)
		
		OutputStream os = c.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
		InputStream is = c.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		PrintWriter pw = new PrintWriter(os);
		
		System.out.print("명령어 입력:");
		String inputCommand = scan.nextLine();

		byte[] rBuff = new byte[19999];
		char[] cbuf = new char [10000];
		int length;
		
		//명령어 outputStream
//안댕	pw.println(inputCommand);
		
		
//		//rdir 응답 inputStream
//		length=dis.readInt();
//		String printString = "";
//		for(int i=0; i<length; i++){
//			isr.read(cbuf);
//			printString = printString + (char)dis.readChar();
//		}
//		System.out.println("출력---------------------------\n"+printString);
		c.close();
	}
}
