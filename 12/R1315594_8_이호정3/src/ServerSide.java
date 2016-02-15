/*
 * 서버는 열린다.
 * 서버는 폴더를 보여준다 (show)
 * 클라이언트는 폴더를 보고서 폴더명을 입력한다 (typeDirName)
 * 폴더명은 서버에게 전달된다.
 * 서버는 폴더명을 자기가 가진것과 비교한다.
 * 클라이언트가 보낸 typeDirName이 폴더명이면 - 폴더로 들어가기 아니면 - 명령어 다시 입력받기
 * 클라이언트는 폴더로 들어갔으면 들어갔다는 알림을 받고 다시 명령어를 입력할 것.
 * 
 * ServerSide.java 프로그램에 저장되어 있는 directory의 내용을 Client 요청에 따라서 보여주고 선택한 파일(text 파일)명을 Client가 요청하면 이 파일을 전송하여 화면에 출력하는 프로그램을 작성하시오.
 * 
 */
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ServerSide {

	public static void main(String[] args) throws IOException {
		ServerSocket sc;
		sc = new ServerSocket(13579);

		Scanner scan = new Scanner(System.in);
		int times = 0; //서버접근횟수 times

		while (times<10){ //10번까지 서버에 접근할 수 있음

			//디폴트 파일 폴더 설정하고, 해당 디렉토리의 모든 파일/폴더들을 File[]배열에 저장
			File defaultFile = new File("./");
			File[] dirFileList = defaultFile.listFiles();
			//FileWriter fw = new FileWriter(currentFile);

			byte[] strBuff = new byte[19999]; //공간확보


			Socket c = sc.accept(); //클라이언트의 요청 받아들이는 소켓
			System.out.println("클라이언트 접근 "+sc.getLocalSocketAddress());
			times++;

			//OutputStream, InputStream 객체 생성
			OutputStream os = c.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
			InputStream is = c.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			InputStreamReader isr = new InputStreamReader(is, "UTF-8");
			PrintWriter pw = new PrintWriter(os);
			
			//command 받아오기
			/**
			 * dis.read()	*1
			 * dis.readChar()	*length
			 **/
			int length = dis.read();
			String inputCommand = "";
			for (int i=0;i<length;i++){
				inputCommand = inputCommand + (char)isr.read();
				//명령어를 글자단위로 불러와서 문자열에 접합 저장	
			}

			
			System.out.println("inputCommand");
			String[] command = inputCommand.split(" "); //띄어쓰기를 기준으로 앞, 뒤로 나눔


			length = dirFileList.length; //문자열 길이 수정
			switch (command[0]){ //rdir or get


			/**********************************************************************/		

			/*
			 * rdir 명령어를 받는 경우
			 * ./폴더의 디렉토리, 파일명 모두 출력
			 */
			case "rdir" : //rdir 명령문
				/**
				 * dos.writeInt(); 		*1
				 * dos.write(byte[]); 	*length
				 */
				dos.writeInt(length);

				for (int n=0;n<length;n++){ //접근한 폴더 내부에 요청
					String str = dirFileList[n].getName();
					pw.println(str);
					int namelen=str.length();
					char ch = 0;
					for (int i=0;i<namelen;i++){
						dos.writeChar(ch);//Client에게 출력
						pw.write(str);
					}
					//dos.flush();
				} //for 끝

				break; //switch (서버역할) 끝내기

				/**********************************************************************/		

				/*
				 * get ____ 명령어를 받는 경우
				 * 파일명인지 폴더명인지 아닌지 확인하기
				 * 파일명이면 파일 FileOutputStream ㄱㄱ하고 break
				 * 폴더명이거나 오타이면 break
				 */

			case "get" :
				

				for (int i=0;i<length;i++){
					if (command[1].equals(dirFileList[i].getName())
							&&dirFileList[i].isFile()){
						FileOutputStream fos = new FileOutputStream(dirFileList[i]);

						; //file을 byte로, Client에게 OutputStream
						break; //for문 나가기
					}//if끝
					break; //switch 나가기
				} //for끝
				//파일명이 아닐때
				dos.write("Try Again (invalid file name)".getBytes());
				break;		

			/**********************************************************************/
		
			default :
				//명령어가 rdir도 아니고 get도 아닐때
				dos.write("Try Again (invalid command".getBytes());
				break;
			} //switch
			
			System.out.println(times+"/10 Socket Finish");
		} //while

		sc.close();	

	} //main
}

