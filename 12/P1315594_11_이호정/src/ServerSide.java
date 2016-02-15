/*	P1315594_11_��ȣ�� (�濵�к�)
 * 	
 * ������ ServerSide.java�� ClientSide.java ���α׷��� �����Ͽ�
 * Client�� �䱸�ϴ� ���� ���ڸ� Server�� �ް� *****
 * �� ���ں��� 10���� ���� ������ ���α׷��� �ۼ��Ͻÿ�.
 * 
 * �� Ŭ���� ���� �������̹Ƿ� main �ΰ�
 * ���� run �� Ŭ���̾�Ʈ run, �������Ѽ� 1���� run��
 * 
 */
import java.io.*;
import java.net.*;

class ServerSide {
	public static void main(String args[]) throws Exception {
		int port = 8801; //��Ʈ�ּ�
		
		int times = 10; //������ accept�� �� �ִ� Ƚ�� (client run Ƚ��)
		System.out.println("��������");
		
		ServerSocket serverSoc = new ServerSocket(port); //�������� (��������)
		int i = 1; 
		while(i <= times) {
			Socket soc = serverSoc.accept();
			System.out.println("Ŭ���̾�Ʈ: "+i+"/"+times);
			
			//Ŭ���̾�Ʈ�� �䱸�ϴ� ���ۼ��� �ޱ�
			InputStream is = soc.getInputStream(); //request�� ���� InputStream (client�� �䱸�� ����)
			DataInputStream dis = new DataInputStream(is);
			int k = dis.readInt();
			
			//Ŭ���̾�Ʈ���� 10���� ���� ������
			OutputStream os = soc.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			
			for(int j = 0; j < 10 ; j++) {
				dos.writeInt(j+k); 
			}
			soc.close();
			++i; //accept 1ȸ�� 1�����ϹǷ� Ŭ���̾�Ʈ�� ������ Ƚ��
		}
		
		serverSoc.close(); //file�̳� socket �� �ü������ close�� ������ ���� ����
	}
}
