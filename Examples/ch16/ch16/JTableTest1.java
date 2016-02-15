import javax.swing.*;
import java.awt.*;
class JTableDemo extends JFrame {
	public JTableDemo() {
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		String[] colHeads = { "학과", "학번", "이름" };
		Object[][] data = {
		{ "IT응용공학전공", "201095029", "김지연" },
		{ "컴퓨터응용공학전공", "201195007", "김대연" },
		{ "인터넷응용공학전공", "201195072", "이현덕" },
		{ "멀티미디어공학전공", "201096041", "김기창" },
		{ "IT응용공학전공", "201198001", "이명찬" },
		{ "정보통신공학전공", "201198074", "강재근" },
		{ "인터넷응용공학전공", "201195012", "임자용" },
		{ "멀티미디어공학전공", "201196025", "문정숙" },
		{ "IT응용공학전공", "201198016", "하종섭" },
		{ "데이타베이스공학전공", "201197011", "안진숙" },
		{ "IT응용공학전공", "201198009", "서은실" },
		{ "데이타베이스공학전공", "201197008", "장희숙" },
		{ "멀티미디어공학전공", "201196033", "장현석" }
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