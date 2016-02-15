package textInputTest;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;//�̺�Ʈ
import java.awt.event.ActionListener;//�̺�Ʈ ������

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class TextFieldFrame extends JFrame{

	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;

	private JPasswordField passwordField;

	public TextFieldFrame(){

		super("Testing JTextField and JPasswordField");
		setLayout( new FlowLayout() );

		//10�÷����� textfield�� ����
		textField1 = new JTextField(10);//�ִ� �Է� ���ڼ� 10���� ����
		add(textField1);

		//�⺻ �ؽ�Ʈ�� textfield�� ����
		textField2 = new JTextField("Enter text here");//�ؽ�Ʈ �Է¶�
		add(textField2);

		//�⺻ �ؽ�Ʈ�� 21 Į������ textField�� ����
		textField3 = new JTextField("Uneditable text field" , 21);//���� �Է±��� 21�� ����
		textField3.setEditable(false);//��� �Ұ� ����
		add(textField3);

		//�⺻ �ؽ�Ʈ�� passwordField�� ����
		passwordField = new JPasswordField("Hidden text");//��й�ȣ ���·� ����
		add(passwordField);

		//�̺�Ʈ ��鷯 ���
		TextFieldHandler handler = new TextFieldHandler();

		textField1.addActionListener(handler);
		textField2.addActionListener(handler);
		textField3.addActionListener(handler);
		passwordField.addActionListener(handler);

	}
}

//�̺�Ʈ
private class TextFieldHandler implements ActionListener{
	public void actionPerformed(ActionEvent event) {

		String string = "";//���ڿ� ����

		//����ڰ� JTextField textField1���� ���͸� ������
		if( event.getSource() == textField1 ){//�Է� �� ����Ű �߻���
			string = String.format("textField1 : %s", event.getActionCommand() );//���ڿ� �� ��ȯ
		}else if( event.getSource() == textField2){
			string = String.format("textField2 : %s", event.getActionCommand() );
		}else if( event.getSource() == textField3){
			string = String.format("textField3 : %s", event.getActionCommand() );
		}else if( event.getSource() == passwordField){
			string = String.format("passwordField : %s", new String(passwordField.getPassword()) );
		}

		JOptionPane.showMessageDialog(null, string);//������ ��ȭ���ڷ� ���
	}
}


