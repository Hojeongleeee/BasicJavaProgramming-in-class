import javax.swing.*;
import java.awt.*;
class JTableDemo extends JFrame {
	public JTableDemo() {
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		String[] colHeads = { "�а�", "�й�", "�̸�" };
		Object[][] data = {
		{ "IT�����������", "201095029", "������" },
		{ "��ǻ�������������", "201195007", "��뿬" },
		{ "���ͳ������������", "201195072", "������" },
		{ "��Ƽ�̵���������", "201096041", "���â" },
		{ "IT�����������", "201198001", "�̸���" },
		{ "������Ű�������", "201198074", "�����" },
		{ "���ͳ������������", "201195012", "���ڿ�" },
		{ "��Ƽ�̵���������", "201196025", "������" },
		{ "IT�����������", "201198016", "������" },
		{ "����Ÿ���̽���������", "201197011", "������" },
		{ "IT�����������", "201198009", "������" },
		{ "����Ÿ���̽���������", "201197008", "�����" },
		{ "��Ƽ�̵���������", "201196033", "������" }
		};
		JTable table = new JTable(data, colHeads);
		int v =	ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		JScrollPane jsp = new JScrollPane(table, v, h);
		c.add(jsp, BorderLayout.CENTER);
		setTitle("JTableTest1");
		setSize(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
public class JTableTest1 {
	public static void main(String[] args) {
		new JTableDemo();
	}
}