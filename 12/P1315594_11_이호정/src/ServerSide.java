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

class ServerSide {
	public static void main(String args[]) throws Exception {
		int port = 8801; //포트주소
		
		int times = 10; //서버가 accept할 수 있는 횟수 (client run 횟수)
		System.out.println("서버열기");
		
		ServerSocket serverSoc = new ServerSocket(port); //서버소켓 (보내는이)
		int i = 1; 
		while(i <= times) {
			Socket soc = serverSoc.accept();
			System.out.println("클라이언트: "+i+"/"+times);
			
			//클라이언트가 요구하는 시작숫자 받기
			InputStream is = soc.getInputStream(); //request를 받을 InputStream (client의 요구를 받음)
			DataInputStream dis = new DataInputStream(is);
			int k = dis.readInt();
			
			//클라이언트에게 10개의 숫자 보내기
			OutputStream os = soc.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			
			for(int j = 0; j < 10 ; j++) {
				dos.writeInt(j+k); 
			}
			soc.close();
			++i; //accept 1회당 1증가하므로 클라이언트가 접속한 횟수
		}
		
		serverSoc.close(); //file이나 socket 등 운영체제에게 close를 보내는 것이 안전
	}
}
