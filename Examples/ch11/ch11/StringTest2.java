public class StringTest2 {
	public static void main(String args[]) {
		String s1 = "Java Korea";
		String s2 = new String("Java Korea");
		String s3 = s2.intern();
		String s4 = "Java Korea";
		String s5 = new String("Java Korea");
		System.out.println("s1�� s2�� ������? : " + (s1 == s2));
		System.out.println("s2�� s3�� ������? : " + (s2 == s3));
		System.out.println("s1�� s3�� ������? : " + (s1 == s3));
		System.out.println("s1�� s4�� ������? : " + (s1 == s4));
		System.out.println("s2�� s5�� ������? : " + (s2 == s5));
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("s3 : " + s3);
		System.out.println("s4 : " + s4);
		System.out.println("s5 : " + s5);
	}
}