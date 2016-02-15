public class SubStringTest {
	public static void main(String args[]) {
		String str = "알기쉽게 해설한 자바";
		System.out.println("인덱스 5부터 8이전까지의 문자열 : " + str.substring(5,8));
		System.out.println(str.concat("와 예제 프로그램"));
		System.out.println(str.replace('한','된'));
		str = " " + str + " ";
		System.out.println("공백 추가 str의 길이 : " + str.length());
		str = str.trim();
		System.out.println("공백 제거 str의 길이 : " + str.length());
	}
}