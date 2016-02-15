class EqualsTest {
	public static void main(String args[]) {
		String s1 = "알기쉽다" ;
		String s2 = "Apple";
		String s3 = "APPLE";
		String s4 = new String("알기쉽다");
		System.out.println("s1과 s2가 동일한 문자열? : " + s1.equals(s2));
		System.out.println("s2와 s3가 동일한 문자열?(대소문자 무시) : " +
		s2.equalsIgnoreCase(s3));
		if (s1 == s4)
			System.out.println("s1과 s4를 \"==\" 연산자로 비교한 결과는 같다");
		else
			System.out.println("s1과 s4를 \"==\" 연산자로 비교한 결과는 같지 않다");
		if (s1.equals(s4))
			System.out.println("s1과 s4를 \"equals()\" 메소드로 비교한 결과는 같다");
		else
			System.out.println("s1과 s4를 \"equals()\" 메소드로 비교한 결과는 같지 않다");
			System.out.println("s1문자열은 \"알기\"로 시작하는가? " + 	s1.startsWith("알기"));
			System.out.println("s1문자열은 \"ple\"로 끝나는가? " + s2.endsWith("ple"));
	}
}