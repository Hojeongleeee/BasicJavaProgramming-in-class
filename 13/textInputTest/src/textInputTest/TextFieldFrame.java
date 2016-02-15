package textInputTest;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;//이벤트
import java.awt.event.ActionListener;//이벤트 리스너

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

		//10컬럼으로 textfield를 생성
		textField1 = new JTextField(10);//최대 입력 글자수 10으로 설정
		add(textField1);

		//기본 텍스트로 textfield를 생성
		textField2 = new JTextField("Enter text here");//텍스트 입력란
		add(textField2);

		//기본 텍스트와 21 칼럼으로 textField를 생성
		textField3 = new JTextField("Uneditable text field" , 21);//문자 입력길이 21로 설정
		textField3.setEditable(false);//사용 불가 설정
		add(textField3);

		//기본 텍스트로 passwordField를 생성
		passwordField = new JPasswordField("Hidden text");//비밀번호 형태로 설정
		add(passwordField);

		//이벤트 헨들러 등록
		TextFieldHandler handler = new TextFieldHandler();

		textField1.addActionListener(handler);
		textField2.addActionListener(handler);
		textField3.addActionListener(handler);
		passwordField.addActionListener(handler);

	}
}

//이벤트
private class TextFieldHandler implements ActionListener{
	public void actionPerformed(ActionEvent event) {

		String string = "";//문자열 선언

		//사용자가 JTextField textField1에서 엔터를 누른다
		if( event.getSource() == textField1 ){//입력 후 엔터키 발생시
			string = String.format("textField1 : %s", event.getActionCommand() );//문자열 값 반환
		}else if( event.getSource() == textField2){
			string = String.format("textField2 : %s", event.getActionCommand() );
		}else if( event.getSource() == textField3){
			string = String.format("textField3 : %s", event.getActionCommand() );
		}else if( event.getSource() == passwordField){
			string = String.format("passwordField : %s", new String(passwordField.getPassword()) );
		}

		JOptionPane.showMessageDialog(null, string);//뮨저를 대화상자로 출력
	}
}


