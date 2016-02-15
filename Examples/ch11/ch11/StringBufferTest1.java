public class StringBufferTest1 {
	public static void main(String args[]) {
		StringBuffer str1 = new StringBuffer("Hello JAVA");
		StringBuffer str2 = new StringBuffer("안녕하세요 자바");
		System.out.println("문자열 => " + str1);
		System.out.println("문자열 길이 => " + str1.length());
		System.out.println("버퍼를 포함한 길이 => " + str1.capacity());
		System.out.println("문자열 => " + str2);
		System.out.println("문자열 길이 => " + str2.length());
		System.out.println("버퍼를 포함한 길이 => " + str2.capacity());
	}
}