import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClientClass extends Thread {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		Socket c = new Socket("127.0.0.1", 8888); //소켓(받는이)
		
		OutputStream os = c.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		InputStream is = c.getInputStream();
		DataInputStream dis = new DataInputStream(is);

	
		System.out.print("명령어 입력:");
		String inputCommand = scan.nextLine();
		int length = 0;
		dos.write(inputCommand.getBytes());
		//명령어 out
		

		//응답방식을 결정할 switch문
		int dirOrFile = dis.readInt();
		switch (dirOrFile){
		case 1 : //rdir
			//rdir 출력
			length=dis.read();
			for (int i=0;i<length;i++){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				byte[] buf = new byte[30];
				dis.read(buf);
				String str = new String(buf);
				System.out.println(str.trim());
			}
			System.out.println("rdir print end");

			break; //switch 끝
		case 2 : //get filename
			//파일기록
			int len;
			byte [] sendFile = new byte[4096]; //4MB
			
			//파일명 정하기
			System.out.print("저장하고 싶은 파일명: ");
			String fileName = scan.nextLine(); //파일명 입력받음
			if (!fileName.contains(".txt")){
				//.txt 자동으로 붙여주기
				fileName=fileName.concat(".txt"); 
			}
			
			//파일에 쓰기
			File newFile = new File("./",fileName);
			newFile.createNewFile();
			System.out.println("파일명 "+fileName+"을 전송받습니다.");
			FileWriter fw = new FileWriter(newFile);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
		
			//네트워크 받아오기
			BufferedInputStream bis = new BufferedInputStream(c.getInputStream());
			dis = new DataInputStream(bis);
			
			//네트워크 받아서 파일에 쓰기
			FileOutputStream fos = new FileOutputStream(newFile);
			dos = new DataOutputStream(fos);
			
			dis.read(sendFile);
			System.out.println(new String(sendFile));
			fos.write(sendFile);
			fos.flush(); //파일에다가 기록
			fos.close();
			System.out.println("파일전송완료");
			break;
		case 3 : //오타
			
			break;
		}
		c.close();
		scan.close();
	}//main 끝

}
