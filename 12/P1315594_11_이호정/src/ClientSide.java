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
import java.util.Scanner;

public class ClientSide {
	public static void main(String args[]) throws Exception {
		String server = "127.0.0.1"; //�����ּ� (������ ������ ���� ȣ��Ʈ�� �����)
		int port = 8801; //��Ʈ�ּ�
		Scanner scan = new Scanner(System.in);
		
		Socket c = new Socket(server, port); //����(�޴���)
		
		//�������� ���� ���� ������
		OutputStream os = c.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		System.out.print("�����Է�:");
		int k = scan.nextInt();
		dos.writeInt(k);
		
		//�������� �������κ��� 10���� ���� �޾ƿ���
		InputStream is = c.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		
		for(int i=1 ; i <= 10 ; i++) {
			int j = dis.readInt();
			System.out.println("�����κ��� ���� ������ " + j + " ���");
		}
		c.close();
	}
}
