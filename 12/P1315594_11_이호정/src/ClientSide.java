/*	P1315594_11_이호정 (경영학부)
 * 	
 * 다음의 ServerSide.java와 ClientSide.java 프로그램을 응용하여
 * Client가 요구하는 시작 숫자를 Server가 받고 *****
 * 이 숫자부터 10개의 수를 보내는 프로그램을 작성하시오.
 * 
 * 두 클래스 각각 독립적이므로 main 두개
 * 서버 run 후 클라이언트 run, 순서지켜서 1번씩 run함
 * 
 */
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClientSide {
	public static void main(String args[]) throws Exception {
		String server = "127.0.0.1"; //서버주소 (서버가 없으니 로컬 호스트로 대신함)
		int port = 8801; //포트주소
		Scanner scan = new Scanner(System.in);
		
		Socket c = new Socket(server, port); //소켓(받는이)
		
		//서버에게 시작 숫자 보내기
		OutputStream os = c.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		System.out.print("숫자입력:");
		int k = scan.nextInt();
		dos.writeInt(k);
		
		//서버에게 시작으로부터 10개의 숫자 받아오기
		InputStream is = c.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		
		for(int i=1 ; i <= 10 ; i++) {
			int j = dis.readInt();
			System.out.println("서버로부터 받은 데이터 " + j + " 출력");
		}
		c.close();
	}
}
