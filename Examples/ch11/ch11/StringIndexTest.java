public class StringIndexTest {
	public static void main(String args[]) {
		String s = "1234567890JAVA1234567890java";
		System.out.println(s);
		System.out.println("문자열의 길이 : " + s.length());
		System.out.println("indexOf(J) = " + s.indexOf('J'));
		System.out.println("lastIndexOf(9) = " + s.lastIndexOf('9'));
		System.out.println("indexOf(5, 5) = " + s.indexOf('5', 5));
		System.out.println("lastIndexOf(5, 18) = " + s.lastIndexOf('5', 17));
		System.out.println("indexOf(java, 10) = " + s.indexOf("java", 10));
		System.out.println("lastIndexOf(Java, 40) = " + s.lastIndexOf("Java", 23));
	}
}