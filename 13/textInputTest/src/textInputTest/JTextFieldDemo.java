package textInputTest;
// A program to demonstrate the use of JTextFields's
//Import Statements
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JTextFieldDemo extends JFrame {

	//Class Declarations
	JTextField[] jtfText = new JTextField[5];
	JTextField[] jtfValue = new JTextField[5];
	String disp = "";
	JButton submition = new JButton();

	public String chartTitle;
	private String values[] = new String[5];
	private String valuesTitle[] = new String[5];
	private double valueSum = 0;

	TextHandler handler = null;

	//Constructor
	public JTextFieldDemo() {
		super("TextField Test Demo");
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		container.add("전송", submition);
		
		for (int i=0; i<5; i++){
			jtfText[i] = new JTextField("항목"+(i+1),10);
			jtfValue[i] = new JTextField("값"+(i+1),10);
			container.add(jtfText[i]);
			container.add(jtfValue[i]);
		}
		for (int i=0; i<5; i++){
			handler = new TextHandler();
			jtfText[i].addActionListener(handler);
			jtfValue[i].addActionListener(handler);
		}
		setSize(325, 400);
		setVisible(true);
	}
	
	
	//Inner Class TextHandler
	private class TextHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			for(int i=0;i<5;i++){
				if (e.getSource() == jtfText[i]) {
					valuesTitle[i] = "항목"+(i+1)+": " + e.getActionCommand();
				} else if (e.getSource() == jtfValue[i]) {
					values[i] = "값"+(i+1)+": " + e.getActionCommand();
				}
			}
			JOptionPane.showMessageDialog(null, disp);
		}
	}
	
	private class SubmitHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			new ChartMaking();
			
		}
	}
	
	//Main Program that starts Execution
	public static void main(String args[]) {
		JTextFieldDemo test = new JTextFieldDemo();
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}// End of class TextFieldTest
