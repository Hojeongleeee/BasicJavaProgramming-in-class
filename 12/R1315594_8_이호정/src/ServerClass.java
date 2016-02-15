import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ServerClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket sc;
		sc = new ServerSocket(8888);
		
		//파일
		File defaultFile = new File("./");
		File[] dirFileList = defaultFile.listFiles();
		
		//스캐너, times
		Scanner scan = new Scanner(System.in);
		int times = 0; //서버접근횟수 times

		
		//서버 100번 열림
		while (times<100){ //10번까지 서버에 접근할 수 있음
			
			//시작-------------------------------------------------------
			Socket c = sc.accept(); //클라이언트의 요청 받아들이는 소켓
			System.out.println("클라이언트 접근 "+sc.getLocalSocketAddress());
			times++;
			
			//Stream 객체 생성-------------------------------------------------------
			OutputStream os = c.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			InputStream is = c.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			byte[] buf = new byte[30];
	
			//명령어 in-------------------------------------------------------
			
			int length = 0;
			String inputCommand = new String();
			dis.read(buf);
			inputCommand=new String(buf).trim();
			System.out.println("inputCommand :" + inputCommand);
			
			

			//출력 -------------------------------------------------------
			if (inputCommand.equals("rdir")){
				dos.writeInt(1); //Client에게 flag값
				length=dirFileList.length;
				dos.write(length);
				for (int i=0;i<length;i++){
					dos.write(dirFileList[i].getName().getBytes());
					dos.flush();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} //for 끝
				System.out.println("rdir End");	
			}//rdir if
			
			else if (inputCommand.contains("get")){
				dos.writeInt(2); //Client에게 flag값
				System.out.println(inputCommand.substring(4));
				String inputFileName = inputCommand.substring(4).replace(".txt", "");
				length=dirFileList.length; //file List 갯수만큼 반복
				for (int i=0;i<length;i++){
					if (dirFileList[i].isFile()){
						String fileName = "test.txt"; //fileName은 test.txt로 변경하여 전송하게 됨
						System.out.println("파일 ("+fileName+")을 전송하고있습니다.");
						
						
						//파일 읽어오기
						File f = new File("./","test.txt");
						FileInputStream fis = new FileInputStream(f);
						BufferedInputStream bis = new BufferedInputStream(fis);
						dis = new DataInputStream(bis); //파일 읽기
						FileReader fr = new FileReader(dirFileList[i]);
						BufferedReader br = new BufferedReader(fr);
						
						
						//네트워크 보내기
						BufferedOutputStream bos = new BufferedOutputStream(os);
						dos = new DataOutputStream(bos);						
						
						//파일 읽기, 네트워크 보내기
						byte[] sendFile = new byte[4096]; //4MB
						String fileRead="";
						StringBuilder sb = new StringBuilder();
						while((fileRead=br.readLine())!=null){
							sb.append(fileRead);
							//String 문자열 계속적으로 추가
						}
						
						dos.write(sb.toString().getBytes());
						dos.flush();


						break;
					}
				}
				System.out.println("get File End");
			} //else if 끝
			else {
				System.out.println("invalid Command");
			}
			System.out.println("Client Closed");
		} //while 끝
		sc.close();
		System.out.println("Server Closed");
		scan.close();
	}//main끝
}
