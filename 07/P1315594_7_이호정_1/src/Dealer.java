/* P1315594_7_��ȣ�� (�濵�к�)
 * �ڵ��� �ֹ��� �ۼ� ���α׷�
 * Dealer.java - main, �ֹ���ü, �ڵ�����ü ���� �� �ֹ�����
 */
import java.util.Scanner;

public class Dealer {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int menu=0;
		int chk = 1; //�ڵ��� ���� ���μ����� ����� ��Ű�� ���� flag ��, while�� �������� ���Ե�

		do{ //��ü ���� ����
			
			menu=firstmenu(); //�ֹ��� ���� ����
			Order order = new Order(menu); //�ֹ� ��ü �����ϱ� (����Ӽ��� �⺻����)
		
			
			System.out.println("������ȣ:"+order.orderedCar.engineNum);
			System.out.println("����Ÿ��:"+order.orderedCar.engineType);
			System.out.println("�����뷮:"+order.orderedCar.engineCapa);
			switch(order.orderedCar.carDefine){
			case 1:
				System.out.println("����:"+99999);
				System.out.println("�����ο�:"+99999);
				break;
			case 2:
				System.out.println("��������:"+99999);
				System.out.println("�����ο�:"+99999);
				break;
			case 3:
				System.out.println("������:"+99999);
				System.out.println("ȭ�����緮:"+99999);
			}

			
			System.out.println("�ٽ� �Ͻðڽ��ϱ�? (��:1, �ƴϿ�:0)");
			chk = scan.nextInt();
		} while(chk==1); //��ü���� ������ ����࿩�� �˻�
		
		
		System.out.println("-------�ȳ���������-------");
		//��~
	} //main ��

	/**********������ ���� �����ϱ�*******/
	static int firstmenu(){
		int menu = 0;
		do {
			System.out.println("------���� �ֹ�------");
			System.out.println("���ϴ� ������ �����ϼ���");
			System.out.println("1.�¿���");
			System.out.println("2.����");
			System.out.println("3.ȭ����");
			menu = scan.nextInt();
		}	while(menu>3);

		return menu;
	}

} //class��

